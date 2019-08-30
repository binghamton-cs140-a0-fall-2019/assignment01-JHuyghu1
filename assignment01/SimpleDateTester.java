package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class SimpleDateTester{
  public static void main(String[] args){
    SimpleDate date1 = SimpleDate.of(2019, 9, 28);
    SimpleDate date2 = SimpleDate.of(2017, 6, 17);
    SimpleDate date3 = SimpleDate.of(2003, 3, 25);
    SimpleDate date4 = SimpleDate.of(1999, 2, 9);


    System.out.println(date1.before(date2));
    //false
    System.out.println(date2.before(date1));
    //true
    System.out.println(date3.before(date1));
    //true
    System.out.println(date2.before(date4));
    //false
    System.out.println(date3.before(date4));
    //false
    System.out.println(date4.before(date1));
    //true

    try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR SimpleDate.java:");

      SimpleDate date12 = SimpleDate.of(2019, 29, 8);
      SimpleDate date22 = SimpleDate.of(2017, 6, 17);
      SimpleDate date32 = SimpleDate.of(2003, 3, 25);
      SimpleDate date42 = SimpleDate.of(1999, 2, 9);

      output.println(date12.before(date22));
      //false
      output.println(date22.before(date12));
      //true
      output.println(date32.before(date12));
      //true
      output.println(date22.before(date42));
      //false
      output.println(date32.before(date42));
      //false
      output.println(date42.before(date12));
      //true
		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}



  }
}
