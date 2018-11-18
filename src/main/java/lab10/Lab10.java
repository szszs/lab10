package lab10;

import com.google.gson.*;

import java.io.FileReader;
import java.io.IOException;

public class Lab10 {
    public static void main(String args[]) {
        String filename = "datasets/products.json";
        JsonParser parser = new JsonParser();
        try(FileReader fr = new FileReader(filename)) {
            JsonElement json = parser.parse(fr);
            Gson g = new Gson();
            Product[] p = g.fromJson(json, Product[].class);
            System.out.println(p);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}

