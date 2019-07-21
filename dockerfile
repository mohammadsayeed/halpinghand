FROM java:8
VOLUME /tmp
ADD gs-spring-boot-docker-0.1.0.jar helpinghand.jar
RUN bash -c 'touch /helpinghand.jar'
ENTRYPOINT ["java", "-jar", "/${project.build.finalName}.jar"]