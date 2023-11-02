package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ChatService {

    Socket client;
    PrintWriter out;
    BufferedReader in;
    String receiveData;

    public ChatService(Socket client) {
        this.client = client;
    }

    public void start() throws IOException {

        try {
            in = new BufferedReader(new InputStreamReader(client.getInputStream()));
            out = new PrintWriter(client.getOutputStream(), true);
            out.println("You have been connected to host");
            receiveData = in.readLine();
            if(isrussaPigDog())
                out.println("Go to Hell, PigiDog!!!");
            else
                out.println("Hello User! You are not PigiDog, so at the moment: \n"
                        + LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss")));

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            in.close();
            out.close();
            client.close();
        }
    }

    private boolean isrussaPigDog() throws IOException {

        if (receiveData.toLowerCase().contains("ы") || receiveData.toLowerCase().contains("э")
                || receiveData.toLowerCase().contains("ъ")) {
            out.println("Що таке паляниця?");
            String answer = in.readLine().toLowerCase();
            if (answer.equals("хліб")) {
                return true;
            }
        }
        return false;
    }
}
