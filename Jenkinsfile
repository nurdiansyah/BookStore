pipeline {
    agent any
    tools {
        maven 'maven 3.5.0'
    }
    stages {
        stage ('Build Maven'){
            steps {
                checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/nurdiansyah/BookStore.git']])
                sh 'mvn clean install'
            }
        }
        stage ('Build docker image'){
            steps {
                script {
                    sh 'docker build -t radar511/devops-integration .'
                }
            }
        }
        stage('Push image to Hub'){
            steps{
                script{
                withCredentials([string(credentialsId: 'nurdiansyah-hub-docker', variable: 'pass')]) {
                    sh 'docker login -u nurdiansyah -p ${pass}'
                    sh 'docker push nurdiansyah/book-store'
                }
            }
        }
           
    }
}
