package org.example;



import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;



public class ServerService {

    private final int PORT;
    ServerSocket server;

    public ServerService(int PORT) {
        this.PORT = PORT;
    }

    public Socket start() throws IOException {

        Socket client = null;
        try {
            server = new ServerSocket(PORT);
            System.out.println("Server is listening on port " + PORT);
            client = server.accept();
            System.out.println("Client connected from " + client.getInetAddress().getHostAddress());

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return client;
    }
    public void close() throws IOException {
        server.close();
    }
}
