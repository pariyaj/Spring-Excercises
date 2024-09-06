@Component
public class ItemsCrud {
	
	@PersistenceContext
	private EntityManager entityManager;
	

	public void simpleCrud() {
		entityManager=entityManager.getEntityManagerFactory().createEntityManager();		
		Session session = entityManager.unwrap(Session.class);
		Transaction transaction = session.getTransaction();
		
	  	transaction.begin();
  		Items item = new Items();
    	        item.setName("item1");
    	        item.setPrice(10000);
    	        item.setCategory("toy");
    	        item.setQuality("high");
    	        session.persist(item);
    	        transaction.commit();
    	
         	transaction.begin();
    	        List<Items> allItems = session.createQuery("from Items" , Items.class).getResultList();
    	        allItems.stream().forEach( s -> System.out.println(s));    	
    	        transaction.commit();

    	        transaction.begin();
    	        allItems.get(0).setName("item2");
    	        allItems.get(0).setCategory("Home Supply");
    	        transaction.commit();

                List<Items> allCorruptedItems = session.createQuery("from CorruptedItem where citem_id = :item_id" , CorruptedItems.class).getResultList();
                if(allCorruptedItems.size > 0 )
                    for (CorruptedItem corruptedItem : corruptedItems)
                {
                    transaction.begin();
    	            session.remove( CorruptedItem );
         	    transaction.commit();
		}    	
	}
}
