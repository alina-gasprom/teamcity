FROM openjdk:17-oracle
COPY build/libs/TeamCityDemeOne-0.0.1-SNAPSHOT.jar /application.jar
ENTRYPOINT ["java", "-jar", "applicationOne.jar"]