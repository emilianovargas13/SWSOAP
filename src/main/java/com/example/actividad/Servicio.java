package com.example.actividad;


@WebService(name="Servicio", targetNamespace="utez")
@SOAPBinding(style=SOAPBinding.Style.RPC)



public class Servicio {

    @WebMethod(operationName="devuelve el mensaje")
    public String devuelveMensaje(@WebParam String valor){
        return "Hola"+valor

    }

    public static void main(String [] args){
        Endpoint.publish("http://localhost:7777/Servicio", new Servicio())
    }

}
