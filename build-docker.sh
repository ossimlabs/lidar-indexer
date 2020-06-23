#!/bin/sh
gradle assemble
docker build -t lidar-indexer .
