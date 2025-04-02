#Aquí tenim la versio de java que utilitzarà el contenidor de docker
FROM openjdk:24-jdk-slim

#Aquí trobam el directori de treball del contenidor
WORKDIR /app

#Establim la copia del jar per al contenidor, abans el has de haver creat amb ./mvnw clean package(package crea el jar)
COPY target/tascaAndreu-0.0.1-SNAPSHOT.jar app.jar

#El port on treballà l'aplicació per a que el contenido ho agafi
EXPOSE 8080

#El comandament per executar el jar de l'aplicació dins el contenidor
CMD ["java","-jar","app.jar"]


