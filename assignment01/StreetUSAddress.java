package assignment01;
/**
 * SORRY: I did not have time for the javadocs
 * @author CS 140
 *
 */
public class StreetUSAddress {
	private String addressLine1;
	private String addressLine2;
	private String city;
	private String stateAbbreviation;
	private String zipCode;

	public StreetUSAddress(String address1,
			String address2, String cty,
			String state, String zip) {
				addressLine1 = address1;
				addressLine2 = address2;
				city = cty;
				stateAbbreviation = state;
				zipCode = zip;

      //TODO use the parameters to set the values of
      //the fields above
	}

	public String getAddressLine1() {
		return addressLine1;
    // TODO return the appropriate String
	}

	public String getAddressLine2() {
		return addressLine2;
    // TODO return the appropriate String
	}

	public String getCity() {
		return city;
    // TODO return the appropriate String
	}

	public String getStateAbbreviation() {
		return stateAbbreviation;
    // TODO return the appropriate String
	}

	public String getZipCode() {
		return zipCode;
    // TODO return the appropriate String
	}
	@Override
	public String toString() {
		if(addressLine2.trim().length() > 0) {
			return String.format("%s\n%s\n%s, %s %s", addressLine1,
					addressLine2, city, stateAbbreviation, zipCode);
		} else {
			return String.format("%s\n%s, %s %s", addressLine1,
					city, stateAbbreviation, zipCode);
		}
	}
}
