package com.enp;

import java.util.logging.ConsoleHandler;
import java.util.logging.Logger;

import com.google.api.client.http.HttpTransport;

public class Main {
	
	// Habilitar el registro detallado
    Logger logger = Logger.getLogger(HttpTransport.class.getName());
    ConsoleHandler handler = new ConsoleHandler();
    //handler.setLevel(Level.ALL);
    //logger.addHandler(handler);
    //logger.setLevel(Level.ALL);

    // Ejecuta tu código aquí
    public static void main(String[] args) {
        try {
            GmailOAuth2Sender.sendEmail("destinatario@correo.com", "Asunto del correo", "Contenido del correo",null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
