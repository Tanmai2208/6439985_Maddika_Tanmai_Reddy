import java.io.*;
import java.net.*;

public class TCPServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(6789);
        System.out.println("Server started. Waiting for client...");
        
        Socket clientSocket = serverSocket.accept();
        System.out.println("Client connected");
        
        BufferedReader in = new BufferedReader(
            new InputStreamReader(clientSocket.getInputStream()));
        PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
        BufferedReader consoleIn = new BufferedReader(
            new InputStreamReader(System.in));
        
        String inputLine;
        while ((inputLine = in.readLine()) != null) {
            System.out.println("Client: " + inputLine);
            if (inputLine.equalsIgnoreCase("bye")) break;
            
            System.out.print("Server: ");
            String serverMsg = consoleIn.readLine();
            out.println(serverMsg);
            if (serverMsg.equalsIgnoreCase("bye")) break;
        }
        
        clientSocket.close();
        serverSocket.close();
    }
}