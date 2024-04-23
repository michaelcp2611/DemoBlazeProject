package pe.demoBlaze.Helper;

public class BlazeHelper {

   public static void pausa(){
       try{

           Thread.sleep(2000);
       }
       catch (InterruptedException e) {

           throw new RuntimeException(e);
       }
   }








}
