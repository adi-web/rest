/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import static jdk.nashorn.tools.ShellFunctions.input;

/**
 *
 * @author informatica
 */
public class Rest_Get {

    rest_grafica r;
    json_employeer json = new json_employeer();
    String j = json.toString();

    public Rest_Get(rest_grafica r) {
        this.r = r;
        r.show();

    }

    public Rest_Get() {

    }

    public String GetR(String u) {
        try {
            System.out.println(j);

            URL url = new URL(u);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Accept", "application/json");
            
                     if (conn.getResponseCode() != 200) {
			throw new RuntimeException("Failed : HTTP error code : "
					+ conn.getResponseCode());
		}

          

            BufferedReader br = new BufferedReader(new InputStreamReader(
                    (conn.getInputStream())));

            System.out.println("Output from Server .... \n");
            String output;

            while ((output = br.readLine()) != null) {

                System.out.println(output);

                //r.jTextArea1.setText(output);
                //return output;
                return output;
            }

            conn.disconnect();

        } catch (MalformedURLException e) {

            e.printStackTrace();

        } catch (IOException e) {

            e.printStackTrace();

        }
        return null;

    }
    
    public void PostR()
    {
         try {

            URL url = new URL("http://localhost:8080/api/tutorial/1.0/employees");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setDoOutput(true);
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Type", "application/json");

            OutputStream os = conn.getOutputStream();
            os.write(j.getBytes());
            os.flush();

            if (conn.getResponseCode() != 201) {
                throw new RuntimeException("Failed : HTTP error code : "
                        + conn.getResponseCode());
            }

            BufferedReader br = new BufferedReader(new InputStreamReader(
                    (conn.getInputStream())));

            System.out.println("Output from Server .... \n");
            String output;

            while ((output = br.readLine()) != null) {

                System.out.println(output);

                //r.jTextArea1.setText(output);
                //return output;
                return ;
            }

            conn.disconnect();

        } catch (MalformedURLException e) {

            e.printStackTrace();

        } catch (IOException e) {

            e.printStackTrace();

        }
        
    }

}
