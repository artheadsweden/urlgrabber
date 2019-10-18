import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class Main {

    public static void main(String[] args) throws IOException {
        //https://www.google.com/search?num=10&q=Java
        String searchItem = "Java";
        URL url = new URL("https://www.google.com/search?num=10&q=" + searchItem);
        URLConnection conn = url.openConnection();
        conn.addRequestProperty("Accept", "text/html");
        conn.addRequestProperty("Accept-Language", "en-US");
        conn.addRequestProperty("User-Agent", "Mozilla/5.0");
        InputStream is = conn.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        String line;
        while((line = br.readLine()) != null) {
            System.out.println(line);
        }


    }
}
