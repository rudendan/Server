package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

public class CheckService {

    public static boolean isrussaPigDog(String data, BufferedReader in, PrintWriter out) throws IOException {

        if (data.toLowerCase().contains("ы") || data.toLowerCase().contains("э") || data.toLowerCase().contains("ъ")) {
            out.println("Are you svinosobaka?");
            String answer = in.readLine().toLowerCase();
            if (answer.equals("da")) {
                out.println("Go to Hell, PigiDog!!!");
                return true;
            }
        }

            return false;


    }
}


//System.out.println("Client connected from " + client.getInetAddress().getHostAddress());
//        PrintWriter out = new PrintWriter(client.getOutputStream(), true);
//        out.println("You have been connected to host");
//
//        try(BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()))) {
//
//        String receiveData;
//        while((receiveData = in.readLine()) != null) {
//
//        if (CheckService.isrussaPigDog(receiveData, in, out)) {
//        break;
//
//        }
//        else {
//        out.println("Hello User! You are not PigiDog, so at the moment: \n" +
//        LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss")));
//        }
//        }
//        }
//
//        client.close();
//        System.out.println("Connection closed");