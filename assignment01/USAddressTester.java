package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class USAddressTester {
  public static void main(String[] args) {
    StreetUSAddress locate1 = new StreetUSAddress("4400 Vestal Parkway East", "BU Box 24531", "Binghamton", "NY", "13902");
    StreetUSAddress locate2 = new StreetUSAddress("12 Murray St.", " ",  "Bronx", "NY", "19086");
    System.out.println(locate1);
    System.out.println(locate2);

    try(var output =new PrintWriter(new FileOutputStream(
			     new File("output.txt"), true /* true means append to file */))) {
			          output.println("\nTESTS FOR StreetUSAddress.java:");

                StreetUSAddress locate12 = new StreetUSAddress("4400 Vestal Parkway East", "BU Box 24531", "Binghamton", "NY", "13902");
                StreetUSAddress locate22 = new StreetUSAddress("12 Murray St.", " ", "Bronx", "NY", "19086");
                output.println(locate12);
                output.println(locate22);
		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
  }
}
