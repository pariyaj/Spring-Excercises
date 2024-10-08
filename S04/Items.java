@Entity
@Table(name="Items")
public class Items {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
        @OneToOne
        @JoinColumn(name = "item_id", referencedColumnName = "id")
	private int id;
	@Column(name = "ITEM_NAME", length = 50, nullable = false, unique = false)
	private String name;
	private double price;
	private String category;
	@Transient
	private String quality;

	public Items() {
		super();
	}

	public Items(int id, String name, double price, String category) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.category = category;
	}
	

	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public double getPrice() {
		return price;
	}



	public void setPrice(double price) {
		this.price = price;
	}



	public String getCategory() {
		return category;
	}



	public void setCategory(String category) {
		this.category = category;
	}

	public String getQuality() {
		return quality;
	}


	public void setQuality(String quality) {
		this.quality = quality;
	}


	@Override
	public String toString() {
		return "Items [id=" + id + ", name=" + name + ", price=" + price + ", category=" + category + ", quality="
				+ quality + "]";
	}

}

