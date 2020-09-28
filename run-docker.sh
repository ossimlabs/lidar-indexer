#!/bin/sh

#docker run -it --rm -p 8080:8080 -e PGHOST=host.docker.internal lidar-indexer
docker run -it --rm -p 8080:8080 -e PGHOST=host.docker.internal nexus-docker-public-hosted.ossim.io/lidar-indexer:latest
