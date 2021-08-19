import java.net.Socket;
import java.net.ServerSocket; 
import java.io.IOException;

/*

The challenge is to print some information on the screen.

I opted for the basic output function in the terminal, 
with a basic socket output simulating an http server. 

Of course, for the http server we could use a embedded JAVA EE servlet container
like Jetty or Tomcat, but... keep it simple. 

*/

 
 public class TrustlyChallenge2 { 
     
     public static void main(String args[]) throws IOException  {

          ServerSocket server = new ServerSocket(8020);
          final String name = "Rafael Marshall"; // I think this will never change 
          final String nationality = "Brazilian"; // I hope never become a Heimatlo!
          String biggestdream = "Work at Trustly"; // Today is my big dream 
          String myprofile = "Name: "+name+"\r\n"+"Nationality: "+nationality+"\r\nBiggest Dream: "+biggestdream;

          System.out.println(myprofile);
          System.out.println("This information can be accessed at http://localhost:8020");



          while (true) {
              
               try (Socket socket = server.accept()) {

               String httpResponse = "HTTP/1.1 200 OK\r\n\r\n"+myprofile;
               socket.getOutputStream().write(httpResponse.getBytes("UTF-8")); 
               
               } // END try (Socket socket = server.accept()) {
               
            } // END while (true) {
        }
    }

