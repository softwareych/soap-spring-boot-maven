<div align = "center"> 
  
  <h1 align = "center">Consumir Servicios SOAP</h1>

  ![Static Badge](https://img.shields.io/badge/Version-1.0-cyan)
  ![Static Badge](https://img.shields.io/badge/Lenguaje-Java%2017-yellow)
  ![Static Badge](https://img.shields.io/badge/Spring%20Boot-2.7.10-fuchsia)
  ![Static Badge](https://img.shields.io/badge/MAVEN-green)
  
</div>

![Banner para YouTube Gamer Moderno Morado y Rosa](https://github.com/user-attachments/assets/884171db-2ad2-47a4-a427-57c343e1ff63)

# Conceptos
* SOAP (Simple Object Access Protocol) es un protocolo estándar que define cómo dos objetos en diferentes procesos pueden comunicarse por medio de intercambio de datos dentro de un documento XML, donde se describe todo lo que hace dicho servicio.
* Este XML debe tener definido tanto el Request como el Response
* Para la conversión de XML a objetos Java (Clases) y viceversa se usa MARSHALLING y UNMARSHALLING, a través de la librería Jaxb2Marshaller.

# Objetivo
Este es un ejercicio para consumir un Servicio (API) [SOAP](http://www.dneonline.com/calculator.asmx) con Maven que sirve de estudios y referencia.

# Pruebas

![Static Badge](https://img.shields.io/badge/Postman-curl-orange?link=curl%20--location%20--request%20POST%20'http%3A%2F%2Flocalhost%3A8080%2Fsumar%3FnumberA%3D4%26numberB%3D3') 
curl --location --request POST 'http://localhost:8080/sumar?numberA=4&numberB=3'



>[!TIP]
>
> Revisar los comentarios dentro del código para ayudarte a entender
>
> El protocolo SOAP no se recomienda actualmente, es mejor usar Servicios Rest como mecanismo de comunicación
>
> Se trabaja con Spring 2.7.10 debido a que la API a consumir está construida en Java 8, por lo que no sería compatible con la versión 3 de Spring.

## Desarrollador

[Yenny Chipamo](https://www.linkedin.com/in/yenny-chipamo/)
* Software Developer - Backend Java Jr. - Spring Boot
* FullStack Developer Jr.: Javascript - JQuery - Typescript - HTML - CSS - Bootstrap
  
