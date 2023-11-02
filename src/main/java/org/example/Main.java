package org.example;

import java.io.IOException;
import java.net.Socket;

public class Main {
    public static void main(String[] args) throws IOException {

        ServerService server = new ServerService(8081);
        try {

            Socket client = server.start();
            ChatService chat = new ChatService(client);
            chat.start();
            System.out.println("Connection closed");

        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            server.close();
        }
    }
}