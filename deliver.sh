#!/usr/bin/env bash

echo 'Building Docker image for your Maven-built Java application'
set -x

# Ganti "nama-image" dan "tag" sesuai kebutuhan
docker build -t radar511/devops-integration

set +x

echo 'Running Docker container for your Java application'
set -x

# Ganti port dan nama-image sesuai kebutuhan
docker run -p 7070:7070 radar511/devops-integration

set +x
