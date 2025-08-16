package utilities;



import com.github.javafaker.Faker;
import com.github.javafaker.PhoneNumber;

//fakerutility-generate fake data's using "fakerclass"

public class FakerUtility {
	Faker faker=new Faker();
	
	public String Username() {
		return faker.name().username();
	}
	public String Password() {
		return faker.internet().password();
	}
	public String generatename() {
		return faker.name().fullName();
		}
	public String generateaddress() {
		return faker.address().fullAddress();
	}
	public PhoneNumber phonenumber() {
		return faker.phoneNumber();
		
	}
	public String emailid() {
		return faker.internet().emailAddress();
	
	}
	
	public String city() {
		return faker.address().city();
	}
	
	public String randomdigit() {
		return faker.number().digit();
	}
   public int randomnumber() {
	   return faker.number().numberBetween(5, 10);
	   
   }
}

