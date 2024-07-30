package com.soap.config;

import com.soap.client.SoapClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class SoapConfig {

    @Bean
    public Jaxb2Marshaller marshaller(){
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("com.soap.wsdl"); //pon el mismo paquete que se puso en el pom
        return marshaller;
    }

    /*
    * Recuerda que el servicio web entiende de SOAP o REST, y para que la aplicación (clases) lo entienda se debe convertir
    * Para Soap se usa UNMARSHALLING para convertirlo a clases, para convertir las clases (objetos java) a SOAP se hace el proceso inverso MARSHALLING, la traducción la hace la librería Jaxb2Marshaller
    * Para Rest se usa DESERIALIZACION para convertirlo a clases, para convertir las clases (objetos java) a REST se hace el proceso inverso SERIALIZACIÓN, la librería que se encarga de la serialización o deserialización, es decir de la traducción es Jackson Serialize
    * Esas librerías vienen del Core de Spring ya implementadas para usarse según requiramos
    * Con este Bean de arriba damos la ruta que convertirá de xml a clases java con Marshaller
    */

    @Bean
    public SoapClient getSoapClient(Jaxb2Marshaller marshaller){
        SoapClient soapClient = new SoapClient();
        soapClient.setDefaultUri("http://www.dneonline.com/calculator.asmx");
        soapClient.setMarshaller(marshaller); //es quién se encarga de convertir de objeto a xml
        soapClient.setUnmarshaller(marshaller);//se encarga de lo contrario, de xml a java
        return soapClient;
    }
}
