package assignment01;

/**
 *
 * @author CS 140
 *
 */
public class Person {
	private String firstNames;
	private String lastNames;
	private int ssn;
	private DateAndPlaceOfBirth placeDob;
	private StreetUSAddress address;

	public Person(String fstNames, String lstNames, String ssnString, DateAndPlaceOfBirth pdob,
			StreetUSAddress addr) {
		firstNames = fstNames;
		lastNames = lstNames;
		var str = ssnString.trim().replace("-","");
		while(str.charAt(0) == '0') {
			str = str.substring(1);
		}
		try {
			ssn = Integer.parseInt(str);
		} catch(NumberFormatException ex) {
			System.out.println("Bad format for the SSN, use only digits or use '-' separators");
			throw new IllegalArgumentException("This entry is not acceptable: " + ssnString);
		}
		placeDob = pdob;
		address = addr;
	}

	public String getFirstNames() {
		return firstNames;
	}

	public String getLastNames() {
		return lastNames;
	}

	public String getSSN() {
// either
//		String str = String.format("%09d", ssn);
//		return str.substring(0,3) + "-" + str.substring(3,5) + "-" + str.substring(5);
// or
		return String.format("%03d-%02d-%04d", ssn/1000000,ssn%1000000/10000, ssn%10000);

	}
	public DateAndPlaceOfBirth getPlaceDob(){
		return placeDob;
	}

	public StreetUSAddress getAddress(){
		return address;
	}

	@Override
	public String toString(){
		String sko = "";
		sko += firstNames + "  " + lastNames + " "+ ssn + ",\n";
		sko += "Date and place of birth: " + placeDob.getDateOfBirth() + ", " + placeDob.getPlaceOfBirth() + "\n";
		sko += address.getAddressLine1() +"\n";
		sko += address.getAddressLine2() + "\n";
		sko += address.getCity() + " " + address.getStateAbbreviation() + " " + address.getZipCode();
		return sko;
	}
//
// TODO provide the getter methods for placeDob and address
// TODO Override the public String toString() method that is similar to the
// toString of the StreetUSAddress class and will print a person as:
// Jane Doe (111-22-3333),
// Date and place of birth: 1999-04-23, Springfield, CA, USA
// 123 Main Street
// Apt 1B
// Binghamton, NY 13905
}
