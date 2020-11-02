FROM openjdk:oraclelinux8
VOLUME /tmp
EXPOSE 8765
ADD ./zuul-server-0.0.1-SNAPSHOT.jar zuul-server.jar
ENTRYPOINT ["java","-jar", "-Dspring.profiles.active=prod" ,"/zuul-server.jar"]
