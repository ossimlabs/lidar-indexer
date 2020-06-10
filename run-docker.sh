#!/bin/sh

docker run -it --rm -p 8080:8080 --env PGHOST=host.docker.internal lidar-indexer