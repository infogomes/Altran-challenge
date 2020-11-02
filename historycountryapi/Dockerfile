FROM openjdk:oraclelinux8
VOLUME /tmp
ADD ./historycountryapi-0.0.1-SNAPSHOT.jar historycountryapi.jar
ENTRYPOINT ["java","-jar", "-Dspring.profiles.active=prod" ,"/historycountryapi.jar"]
