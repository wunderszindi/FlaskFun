import java.io.IOException;
import java.net.URL;

public class Main {
    public static void main(String[] args) throws IOException {
        URL url = new URL("http://localhost:5000/");
        URL url1 = new URL("http://localhost:5000/api/time-now");
        URL url2 = new URL("http://localhost:5000/api/random-number");

        EndPointChecker endPointChecker = new EndPointChecker();
        endPointChecker.contentReader(url);
        endPointChecker.contentReader(url1);
        endPointChecker.contentReader(url2);
    }
}
