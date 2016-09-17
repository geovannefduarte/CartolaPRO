package br.com.devgeek.cartolapro.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by computador1 on 9/15/16.
 */
public class HttpURLConnectionUtil {

    public static String sendGetRequest(String requestURL) throws IOException {

        URL url = new URL(requestURL);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();

        connection.setRequestMethod("GET");

        connection = (HttpURLConnection) url.openConnection();
        connection.setUseCaches(false);
        connection.setDoOutput(true);
        connection.setDoInput(true);

        connection.setRequestProperty("Content-Type", "application/json");

        StringBuffer response = new StringBuffer();
        int status = connection.getResponseCode();

        if (status == HttpURLConnection.HTTP_OK){

            String line = null;
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            while ((line = reader.readLine()) != null){
                response.append(line);
            }

            reader.close();
            connection.disconnect();

            return response.toString();

        } else {
            throw new IOException("ERRO -> "+status);
        }
    }
}
