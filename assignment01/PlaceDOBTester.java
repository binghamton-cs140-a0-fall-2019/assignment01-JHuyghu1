package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class PlaceDOBTester{
  public static void main(String[] args) {
    DateAndPlaceOfBirth person1 = new DateAndPlaceOfBirth(1999, 7, 28, "San Francisco", "CA", "USA");
    DateAndPlaceOfBirth person2 = new DateAndPlaceOfBirth(2003, 9, 18, "Orlando,", "FL", "USA");
    DateAndPlaceOfBirth person3 = new DateAndPlaceOfBirth(1999, 7, 28, "Boston,", "MA",  "USA");
    DateAndPlaceOfBirth person4 = new DateAndPlaceOfBirth(1998, 9, 18, "Istanbul", "Turkey");
    DateAndPlaceOfBirth person5 = new DateAndPlaceOfBirth(2007, 3, 30, "Barcelona", "Spain");

    System.out.println(person1);
    System.out.println(person2);
    System.out.println(person3);
    System.out.println(person4);
    System.out.println(person5);

    System.out.println(person1.olderThan(person2));
    //true
    System.out.println(person1.hasSameBirthDateAs(person3));
    //true
    System.out.println(person5.youngerThan(person4));
    //true
    System.out.println(person2.hasSameBirthDayAs(person4));
    //true
    System.out.println(person2.olderThan(person1));
    //false
    System.out.println(person3.youngerThan(person4));
    //true
    System.out.println(person4.youngerThan(person5));
    //false
    System.out.println(person3.hasSameBirthDayAs(person2));
    //false



    try(var output =new PrintWriter(new FileOutputStream(
    			    new File("output.txt"), true /* true means append to file */))) {
    			output.println("\nTESTS FOR DateAndPlaceOfBirth.java:");

          DateAndPlaceOfBirth person12 = new DateAndPlaceOfBirth(1999, 7, 28, "San Francisco", "CA", "USA");
          DateAndPlaceOfBirth person22 = new DateAndPlaceOfBirth(2003, 9, 18, "Orlando," , "FL", "USA");
          DateAndPlaceOfBirth person32 = new DateAndPlaceOfBirth(1999, 7, 28, "Boston," , "MA",  "USA");
          DateAndPlaceOfBirth person42 = new DateAndPlaceOfBirth(1998, 9, 18, "Istanbul", "Turkey");
          DateAndPlaceOfBirth person52 = new DateAndPlaceOfBirth(2007, 3, 30, "Barcelona", "Spain");

          output.println(person12);
          output.println(person22);
          output.println(person32);
          output.println(person42);
          output.println(person52);

          output.println(person12.olderThan(person22));
          output.println(person12.hasSameBirthDateAs(person32));
          output.println(person52.youngerThan(person42));
          output.println(person22.hasSameBirthDayAs(person42));
          output.println(person22.olderThan(person12));
          output.println(person32.youngerThan(person42));
          output.println(person42.youngerThan(person52));
          //false
          output.println(person32.hasSameBirthDayAs(person22));

    		//Copy all your lines above, add an extra "2" to every variable name
    		// and replace every System.out.print or System.out.println
    		// by output.print or output.println
    		} catch (FileNotFoundException e) {
    			e.printStackTrace();
    		}
  }
}
