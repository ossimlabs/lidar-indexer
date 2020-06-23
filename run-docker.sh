#!/bin/sh

docker run -it --rm -p 9999:8080 --env PGHOST=host.docker.internal lidar-indexer
