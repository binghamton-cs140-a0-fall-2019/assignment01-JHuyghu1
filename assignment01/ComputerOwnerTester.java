package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class ComputerOwnerTester {
	public static void main(String[] args) {
    DateAndPlaceOfBirth date = new DateAndPlaceOfBirth(1924, 1, 17, "Miami Beach", "FL", "USA");
    StreetUSAddress place = new StreetUSAddress("32 Murray Rd", "Apt. 3", "Boston", "MA", "45902");
    Person owner = new Person("Walt", "Frazer", "342-09-1234", date, place);

    Computer dev1 = new Computer("Hp", "Inspiron 700", 1, 800, true, 829.90);
    Computer dev2 = new Computer("Hp", "intel", 2, 1000, true, 1345.70);
    Computer dev3 = new Computer("Hp", "intel", 2, 500, false, 1100.45);
    Computer dev4 = new Computer("Hp", "intel", 1, 2000, true, 1208.50);
    ComputerOwner owner = new ComputerOwner(owner);

    owner.addComputer(dev1);
    owner.addComputer(dev2);
    owner.addComputer(dev3);
    owner.addComputer(dev4);
    System.out.println(owner);

    owner.removeComputer(1);
    owner.removeComputer(2);
    System.out.println(owner);

    try(var output =new PrintWriter(new FileOutputStream(
    			    new File("output.txt"), true /* true means append to file */))) {
    			output.println("\nTESTS FOR ComputerOwner.java:");

          DateAndPlaceOfBirth date2 = new DateAndPlaceOfBirth(1924, 1, 17, "Miami Beach", "FL", "USA");
          StreetUSAddress place2 = new StreetUSAddress("32 Murray Rd", "Apt. 3", "Boston", "MA", "45902");
          Person owner2 = new Person("Walt", "Frazer", "342-09-1234", date2, place2);

          Computer dev12 = new Computer("Hp", "Inspiron 700", 1, 800, true, 829.90);
          Computer dev22 = new Computer("Hp", "intel", 2, 1000, true, 1345.70);
          Computer dev32 = new Computer("Hp", "intel", 2, 500, false, 1100.45);
          Computer dev42 = new Computer("Hp", "intel", 1, 2000, true, 1208.50);
          ComputerOwner owner2 = new ComputerOwner(owner2);

          owner2.addComputer(dev12);
          owner2.addComputer(dev22);
          owner2.addComputer(dev32);
          owner2.addComputer(dev42);
          output.println(owner2);

          owner2.removeComputer(1);
          owner2.removeComputer(2);
          output.println(owner2);

    		//Copy all your lines above, add an extra "2" to every variable name
    		// and replace every System.out.print or System.out.println
    		// by output.print or output.println
    		} catch (FileNotFoundException e) {
    			e.printStackTrace();
    		}





  }

}
