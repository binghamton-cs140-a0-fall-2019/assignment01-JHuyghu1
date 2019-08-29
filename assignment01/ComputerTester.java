package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class ComputerTester {
	public static void main(String[] args) {
    Computer myDisk1 = new Computer(800);
    Computer myDisk2 = new Computer(1500);
    Computer myDisk3 = new Computer(1100);
    Computer myDisk4 = new Computer(660);
    System.out.println(myDisk1);
    System.out.println(myDisk2);
    System.out.println(myDisk3);
    System.out.println(myDisk4);

	//TODO make 4 different Computer objects with different
	//combinations of disk size (two more than a terabyte and two less)
	//and for each make one an SSD drive and the other not.
	//Then call System.out.println(comp); for each "comp" object
	//and observe that there are small differences in how the computer
	//information prints out.
		try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR Computer.java:");

      Computer myDisk12 = new Computer(800);
      Computer myDisk22 = new Computer(1500);
      Computer myDisk32 = new Computer(1100);
      Computer myDisk42 = new Computer(660);
      output.println(myDisk12);
      output.println(myDisk22);
      output.println(myDisk32);
      output.println(myDisk42);

		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}
}
