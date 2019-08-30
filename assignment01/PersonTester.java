package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class PersonTester{
  public static void main(String[] args) {
    DateAndPlaceOfBirth date =  new DateAndPlaceOfBirth(1998, 03, 28, "Newark", "NJ", "USA");
    StreetUSAddress locate = new StreetUSAddress("32 Jackson Rd", "Apt 1000", "Los Angelos", "CA", "09671");
    Person human = new Person("Jane", "Doe", 670-99-7843, date, locate);
    System.out.println(human);

    try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR Person.java:");

      DateAndPlaceOfBirth date2 =  new DateAndPlaceOfBirth(1998, 03, 28, "Newark", "NJ", "USA");
      StreetUSAddress locate2 = new StreetUSAddress("32 Jackson Rd", "Apt 1000", "Los Angelos", "CA", "09671");
      Person human2 = new Person("Jane", "Doe", 670-99-7843, date2, locate2);
      output.println(human2);
		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
}
}
