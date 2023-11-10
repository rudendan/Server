package org.example;

import java.io.*;
import java.net.Socket;

public class ServerHandler {
    private Socket clientSocket;

    public ServerHandler(Socket clientSocket) {
        this.clientSocket = clientSocket;
    }

    public void handleClient() {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            PrintWriter writer = new PrintWriter(clientSocket.getOutputStream(), true);

            writer.println(Answers.GREETINGS);
            String greeting = reader.readLine();
            System.out.println("Client [" + clientSocket.getLocalAddress() + "]: " + greeting);

            if (CheckService.containsPigDogLetters(greeting)) {
                writer.println(Answers.CHECK);
                String response = reader.readLine();
                System.out.println("Client [" + clientSocket.getLocalAddress() + "]: " + response);

                if (CheckService.isCorrectAnswer(response)) {
                    writer.println(Answers.CORRECT_ANSWER + "" + Answers.DATE);
                } else {
                    writer.println(Answers.NOT_CORRECT_ANSWER);
                }
            } else {
                writer.println("Server: " + Answers.DATE);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
