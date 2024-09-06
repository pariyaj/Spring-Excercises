public class Person implements Comparable<Person>{
    	
    private String name;
    private String fname;
    private int age;
    private String address
    
    public Person(String name, String fname, int age, String address) {
        this.name = name;
        this.fname = fname;
        this.age = age;
        this.address = address;
    }

   public String getName() {
        return name;
    }

   public String getFname() {
        return fname;
    }

   public int getAge() {
      return age;
    }

   public String getAddress() {
      return adress;
    }
    
   public void setName(String name) {
    	this.name = name;
		
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public void setAge(int age) {
		this.age = age;
	}

  public void setAdress(String address) {
    this.address = address;
		
	}

	@Override
	public int compareTo(Person o) {
		return this.age - o.age;
	}
}
