@Entity
public class Category {
	
	@Id
	private long id;	
	private String name;
        @OneToOne(mappedBy = "category_id")
	private String location;
	
	public Category() {};
	
	public Category(long id, String name, String location) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
	}
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}

}
