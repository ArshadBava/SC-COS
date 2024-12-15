import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.*;

public class myserver {
    public static void main(String[] args) {
            ServerSocket serverSocket= null;
            Socket server = null;

            try {
                serverSocket = new ServerSocket(4045);
                System.out.println("Waiting for client connection...");
                
                server = serverSocket.accept();
                System.out.println("Server is connected");
                
                OutputStream outputStream = server.getOutputStream();
                PrintWriter writer = new PrintWriter(outputStream,true);

                BufferedReader consolReader = new BufferedReader(new InputStreamReader(System.in));
                while (true) {
                    System.out.println("Enter message to send the client: ");
                    String message = consolReader.readLine();
                    writer.println(message);
                    
                }


            } catch (Exception e) {
                System.out.println(e);
            }

        
    }
}
