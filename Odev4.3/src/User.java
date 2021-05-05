
public class User {
	
	int Id;
	String FirstName;
	String LastName;
	String NationalId;
	String BornDate;
	
	
	public User(int id, String firstName, String lastName, String nationalId, String bornDate) {
		super();
		Id = id;
		FirstName = firstName;
		LastName = lastName;
		NationalId = nationalId;
		BornDate = bornDate;
	}


	public int getId() {
		return Id;
	}


	public void setId(int id) {
		Id = id;
	}


	public String getFirstName() {
		return FirstName;
	}


	public void setFirstName(String firstName) {
		FirstName = firstName;
	}


	public String getLastName() {
		return LastName;
	}


	public void setLastName(String lastName) {
		LastName = lastName;
	}


	public String getNationalId() {
		return NationalId;
	}


	public void setNationalId(String nationalId) {
		NationalId = nationalId;
	}


	public String getBornDate() {
		return BornDate;
	}


	public void setBornDate(String bornDate) {
		BornDate = bornDate;
	}

}
