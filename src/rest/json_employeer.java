/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest;


public class json_employeer 
{
     int employeeId=105;
   String firstName;
  String lastName="mucaj";
  String email="ssss";
  String phone="34563026";

    public json_employeer(String text) {
        this.firstName=text;
    }

    json_employeer() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
  
  
  @Override
    public String toString() {
        return "{\"employeeId\": "+ employeeId +",\"firstName\": \""+ firstName +"\",\"lastName\": \""+ lastName +"\",\"email\": \""+ email +"\",\"phone\": \""+ phone +"\"}";
    }
    
  
}



/*

 public String GetR(String u) {
        try {

            URL url = new URL(u);
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
                return null;
            }

            conn.disconnect();

        } catch (MalformedURLException e) {

            e.printStackTrace();

        } catch (IOException e) {

            e.printStackTrace();

        }
        return null;

    }
*/
