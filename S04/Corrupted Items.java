  @Entity
  @Table(name="Corrupted_Items")
  public class CorruptedItems {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        @OneToOne
        @JoinColumn( name = "citem_id" , referencedColumnName = "id" )
        private Item item;
        private String reason;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Items getItem() {
		return item;
	}
	public void setItem(Items item) {
		this.item = item;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}


}
