package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {
    public static void main(String[] args) {


        try (ServerSocket server = new ServerSocket(8081)) {
            System.out.println("Server started and listening port 8081");
            Socket client = server.accept();
            System.out.println("Client with IP" + client.getInetAddress() + " connected");
            ServerHandler handler = new ServerHandler(client);
            handler.handleClient();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}