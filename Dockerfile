# Utiliza una imagen base de Java
FROM amazoncorretto:17

# Copia el archivo JAR de tu aplicación al contenedor
COPY target/persona4-social-api-0.0.1-SNAPSHOT.jar app.jar

# Expone el puerto en el que se ejecutará la aplicación
#EXPOSE 8080

# Comando para ejecutar la aplicación cuando se inicie el contenedor
CMD ["java", "-jar", "app.jar"]