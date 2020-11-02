FROM openjdk:oraclelinux8
VOLUME /tmp
ADD ./target/countryapi-0.0.1-SNAPSHOT.jar countryapi.jar
ENTRYPOINT ["java","-jar", "-Dspring.profiles.active=prod" ,"/countryapi.jar"]