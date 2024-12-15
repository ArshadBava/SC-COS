import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.*;

public class myclient {
    public static void main(String[] args) {
        Socket client = null;

        try {
            client = new Socket("localhost",4045);
            System.out.println("Client is connected");
            
            InputStream inputStream = client.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));

            while (true) {
                String message = reader.readLine();
                System.out.println("Data from server : "+ message);
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
