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
  
