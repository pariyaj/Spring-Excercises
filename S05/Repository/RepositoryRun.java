@Component
public class RepositoryRun {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Autowired
	StudentRepository repository;

	public void sampleRun() {
    
  	var allItems = repository.findAll();
    System.out.println(allItems);
    
    var item1 = repository.findByName("homesupply");
    System.out.println(item1);
    
    var item2 = repository.findByCategoryName("toy");
    System.out.println(item2);
    
    var item3 = repository.findByNameStartingWith("play");
    System.out.println(item3);
    
    var item4 = repository.findByNameEndingWith("play");
    System.out.println(item4);
    
    var item5 = repository.findByCategoryLocationName("vanak");
    System.out.println(item5);

    var item6 = repository.findByNameIncluding("play");
    System.out.println(item6);
    
	}
}
