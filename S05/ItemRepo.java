public interface ItemJpaRepository extends CrudRepository<Item, Integer> {
	List<Item> findByName(String name);
	List<Item> findByCategoryName(String name);
	List<Item> findByNameStartingWith(String name);
	List<Item> findByNameEndingWith(String name);	
	List<Item> findByCategoryLocationName(String name);
        List<Item> findByNameIncluding(String name);
}
