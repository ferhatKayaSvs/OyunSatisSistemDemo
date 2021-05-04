package odevCalismaNew;

public class Players {
     private int id;
     private String firstName;
     private String lastName;
     private String birthDate;
     private String identity;
     
	public Players(int id, String firstName, String lastName, String birthDate, String identity) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.identity = identity;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public String getIdentity() {
		return identity;
	}

	public void setIdentity(String identity) {
		this.identity = identity;
	}
     
}
