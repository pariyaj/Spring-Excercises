package ir.freeland.spring.validator;

import org.hibernate.validator.constraints.Email;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Pattern;


@SuppressWarnings("deprecation")
public class Input {

  @Min(1)
  @Max(10)
  private int numberBetweenOneAndTen;

  // Note that this is actually not a valid IP address pattern, since
  // it allows values greater than 255 per octet.
  @Pattern(regexp = "^[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}$")
  private String ipAddress;
  
  
  @Email
  @Pattern(regexp = "^[A-Za-z0-9+_.-]+@(.+)$")
  private String email;
  
  public String getEmail(String email) {
	  
	  if(email.length()==0)
		  System.out.println("Email is not valid");
	  else
		  this.email = email;
	return email;

  }
  

  public int getNumberBetweenOneAndTen() {
    return numberBetweenOneAndTen;
  }

  public void setNumberBetweenOneAndTen(int numberBetweenOneAndTen) {
    this.numberBetweenOneAndTen = numberBetweenOneAndTen;
  }

  public String getIpAddress() {
    return ipAddress;
  }

  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }
  
  
}
