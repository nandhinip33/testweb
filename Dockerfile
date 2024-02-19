FROM eclipse-temurin:17
COPY target/testweb.jar  testweb.jar
CMD [ "java","-jar", "testweb.jar" ]