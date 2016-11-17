/**
 * Created by Роман on 17.11.2016.
 */
public class Loader {
   public static void main (String[] args){
       Car mazda = new Car();
       System.out.println(mazda.getStatus());
               mazda.setSpeed();
       System.out.println(mazda.getStatus());
       while(mazda.getStatus() !="P");{
           mazda.setSpeed();
           System.out.println(mazda.getStatus());
       }
    }

}

