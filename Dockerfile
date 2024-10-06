FROM maven AS build
COPY . .
RUN mvn clean package -DskipTests

FROM openjdk:21-jdk
COPY --from=build /target/clashdb-0.0.1-SNAPSHOT.jar clashdb.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","clashdb.jar"]