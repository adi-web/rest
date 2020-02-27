package rest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Rest {

    public static void main(String[] args) {

        String output;
        rest_grafica r = new rest_grafica();
        Rest_Service rG = new Rest_Service(r);

    }

}
