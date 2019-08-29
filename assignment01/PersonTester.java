package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class PersonTester{
  public static void main(String[] args) {
    Person Human = new Person("Jane", "Doe", 670-99-7843);

    System.out.println(Human);

    try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR Person.java:");

      Person Human2 = new Person("Jane", "Doe", 670-99-7843);

      System.out.println(Human2);
		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
}
}
