FROM adoptopenjdk/openjdk13-openj9:jdk-13.0.2_8_openj9-0.18.0-alpine-slim
COPY build/libs/lidar-indexer-*-all.jar lidar-indexer.jar
EXPOSE 8080
#CMD ["java", "-Dcom.sun.management.jmxremote", "-Xmx128m", "-XX:+IdleTuningGcOnIdle", "-Xtune:virtualized", "-jar", "lidar-indexer.jar"]
CMD java ${JAVA_OPTS} -jar lidar-indexer.jar
