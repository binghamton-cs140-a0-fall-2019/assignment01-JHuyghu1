package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class PlaceDOBTester{
  public static void main(String[] args) {
    DateAndPlaceOfBirth Person1 = new DateAndPlaceOfBirth(1999, 7, 28, "San Francisco," , "USA");
    DateAndPlaceOfBirth Person2 = new DateAndPlaceOfBirth(2003, 9, 18, "Orlando," , "USA");
    DateAndPlaceOfBirth Person3 = new DateAndPlaceOfBirth(1999, 7, 28, "Boston," , "USA");
    DateAndPlaceOfBirth Person4 = new DateAndPlaceOfBirth(1998, 9, 18);
    DateAndPlaceOfBirth Person5 = new DateAndPlaceOfBirth(2007, 3, 30);

    System.out.println("%s\n%s\n%s\n%s\n%s\n" , Person1, Person2, Person3, Person4, Person5);
    System.out.println(Person1.olderThan(Person2));
    System.out.println(Person1.hasSameBirthDateAs(Person3));
    System.out.println(Person5.youngerThan(Person4));
    System.out.println(Person2.hasSameBirthDayAs(Person4));
    System.out.println(Person2.olderThan(Person1));
    System.out.println(Person3.youngerThan(Person4));


    try(var output =new PrintWriter(new FileOutputStream(
    			    new File("output.txt"), true /* true means append to file */))) {
    			output.println("\nTESTS FOR DateAndPlaceOfBirth.java:");

          DateAndPlaceOfBirth Person12 = new DateAndPlaceOfBirth(1999, 7, 28, "San Francisco," , "USA");
          DateAndPlaceOfBirth Person22 = new DateAndPlaceOfBirth(2003, 9, 18, "Orlando," , "USA");
          DateAndPlaceOfBirth Person32 = new DateAndPlaceOfBirth(1999, 7, 28, "Boston," , "USA");
          DateAndPlaceOfBirth Person42 = new DateAndPlaceOfBirth(1998, 9, 18);
          DateAndPlaceOfBirth Person52 = new DateAndPlaceOfBirth(2007, 3, 30);

          System.out.println("%s\n%s\n%s\n%s\n%s\n" , Person12, Person22, Person32, Person42, Person52);
          System.out.println(Person12.olderThan(Person22));
          System.out.println(Person12.hasSameBirthDateAs(Person32));
          System.out.println(Person52.youngerThan(Person42));
          System.out.println(Person22.hasSameBirthDayAs(Person42));
          System.out.println(Person22.olderThan(Person12));
          System.out.println(Person32.youngerThan(Person42));
    		//Copy all your lines above, add an extra "2" to every variable name
    		// and replace every System.out.print or System.out.println
    		// by output.print or output.println
    		} catch (FileNotFoundException e) {
    			e.printStackTrace();
    		}
  }
}
