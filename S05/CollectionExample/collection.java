public class collection {
	public static void main(String[] args) {
		Person mehdi = new Person("Mehdi", "Mohammadi", 18, "12 St NewYork"); 
		Person pariya = new Person("Pariya", "Jafari", 29, "12 St Shiraz");
		Person ali = new Person("Ali", "Rostami", 20, "12 St Tehran");
		Person sara = new Person("Sara", "Ahmadi", 25, "Shiraz");
		Person saman = new Person("Saman", "Razavi", 21, "12 St Dalas"); 
		Person aram = new Person("Aram", "Mousavi", 14, "12 St Texas"); 
		Person arezou = new Person("Arezou", "Mohammadi", 30, "12St Washington DC"); 
		Person nima = new Person("Nima", "Alavi", 31, "12 St Brighton");
		Person sarina = new Person("Sarina", "Asrari", 26, "12 St London"); 
		Person sina = new Person("Sina", "Mana", 27, "15 St Lahijan"); 

		Person[] presonsArray = {mehdi,pariya,ali,sara,saman,aram,arezou,nima,sarina,sina};
		List persons = Arrays.asList(presonsArray);
		persons.size();
		Collections.sort( persons );
		System.out.println( persons );
		public class SortPersonByAge implements Comparator<Person> {
			@Override
			public int compare(Person p1, Person p2) {
				return p1.getAge() - p2.getAge();
			}
		}
	}
