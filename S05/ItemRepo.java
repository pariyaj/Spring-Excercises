public interface ItemJpaRepository extends CrudRepository<Item, Integer> {
	List<Item> findByName(String name);
	List<Item> findByCategoryName(String name);
	List<Item> findByNameStartingWith(String name);	
	List<Item> findByCategoryLocationNameStartingWith(String name);
  List<Item> findByNameIncluding(String name);
}
