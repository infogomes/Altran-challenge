FROM openjdk:oraclelinux8
VOLUME /tmp
EXPOSE 8761
ADD ./eureka-server-0.0.1-SNAPSHOT.jar hr-eureka-server.jar
ENTRYPOINT ["java","-jar", "-Dspring.profiles.active=prod" ,"/hr-eureka-server.jar"]
