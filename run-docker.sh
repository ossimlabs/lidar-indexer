#!/bin/sh

#docker run -it --rm -p 8080:8080 -e PGHOST=host.docker.internal lidar-indexer
docker run -it --rm -p 8080:8080 -e PGHOST=host.docker.internal hercules/lidar-indexer
