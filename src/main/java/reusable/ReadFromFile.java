package reusable;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ReadFromFile {
    String path;
    public ReadFromFile(String path) {
        this.path = path;
    }
    public String getLine() {
        try(InputStream is = ClassLoader.getSystemResourceAsStream(this.path);
            BufferedReader bf = new BufferedReader(new InputStreamReader(is))) {

        } catch(IOException e) {

        }
        //To do: return first line from file
        return null;
    }
}
