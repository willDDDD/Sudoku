package com.example.sudokuxiuhaodingxinlongdai;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class webApi {
    /**
     * Retrieve the document at the specified URL by sending a GET request;
     * return null if the request/connection fails.
     */
    public String sendGet(String urlString) {
        HttpURLConnection con = null;
        try {
            URL url = new URL(urlString);
            con = (HttpURLConnection) url.openConnection();
            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;
            while ((line = in.readLine()) != null) {
                response.append(line);
            }
            return response.toString();
        } catch (IOException e) {
            //e.printStackTrace();
        } finally {
            if (con != null) {
                con.disconnect();
            }
        }
        String r = "{\"response\":true,\"size\":\"9\",\"squares\":[{\"x\":0,\"y\":1,\"value\":1},{\"x\":0,\"y\":5,\"value\":5},{\"x\":1,\"y\":1,\"value\":5},{\"x\":1,\"y\":2,\"value\":3},{\"x\":1,\"y\":5,\"value\":9},{\"x\":2,\"y\":1,\"value\":8},{\"x\":2,\"y\":3,\"value\":3},{\"x\":2,\"y\":5,\"value\":1},{\"x\":2,\"y\":7,\"value\":2},{\"x\":3,\"y\":0,\"value\":5},{\"x\":3,\"y\":2,\"value\":1},{\"x\":3,\"y\":4,\"value\":9},{\"x\":3,\"y\":8,\"value\":2},{\"x\":4,\"y\":2,\"value\":2},{\"x\":4,\"y\":3,\"value\":1},{\"x\":4,\"y\":4,\"value\":3},{\"x\":4,\"y\":6,\"value\":9},{\"x\":5,\"y\":0,\"value\":9},{\"x\":5,\"y\":5,\"value\":7},{\"x\":5,\"y\":8,\"value\":3},{\"x\":6,\"y\":1,\"value\":4},{\"x\":6,\"y\":4,\"value\":1},{\"x\":6,\"y\":6,\"value\":2},{\"x\":6,\"y\":7,\"value\":8},{\"x\":7,\"y\":2,\"value\":5},{\"x\":7,\"y\":5,\"value\":2},{\"x\":7,\"y\":7,\"value\":3},{\"x\":8,\"y\":0,\"value\":3},{\"x\":8,\"y\":2,\"value\":8},{\"x\":8,\"y\":3,\"value\":7}]}\n";
        return r;
    }

    public static String mainA(int diff) {
        String FORMAT = "http://www.cs.utep.edu/cheon/ws/sudoku/new/?size=%d&level=%d";
        int size = 9;
        int level = diff;
        String url = String.format(FORMAT, size, level);
        String response = new webApi().sendGet(url);
        return response;
    }
}