FROM java:7

WORKDIR /home/root/helloweb

COPY src /home/root/helloweb/src
COPY pom.xml /home/root/helloweb/pom.xml

RUN apt-get update && apt-get install -y maven
RUN mvn package

ENTRYPOINT ["java", "-jar", "target/helloweb-0.0.1-SNAPSHOT.jar"]
