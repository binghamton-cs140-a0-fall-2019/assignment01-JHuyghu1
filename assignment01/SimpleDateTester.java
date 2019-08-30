package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class SimpleDateTester{
  public static void main(String[] args){
    SimpleDate date1 = new SimpleDate(2019, 29, 8);
    SimpleDate date2 = new SimpleDate(2017, 6, 17);
    SimpleDate date3 = new SimpleDate(2003, 3, 25);

    System.out.println(date1.before(date2));
    System.out.println(date2.before(date1));
    System.out.println(date3.before(date1));
    System.out.println(date2.before(date3));
    System.out.println(date1.before(date2));
    System.out.println(date3.before(date2));

    try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR SimpleDate.java:");

      SimpleDate date12 = new SimpleDate(2019, 29, 8);
      SimpleDate date22 = new SimpleDate(2017, 6, 17);
      SimpleDate date32 = new SimpleDate(2003, 3, 25);

      output.println(date12.before(date22));
      output.println(date22.before(date12));
      output.println(date32.before(date12));
      output.println(date22.before(date32));
      output.println(date12.before(date22));
      output.println(date32.before(date22));
		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}



  }
}
