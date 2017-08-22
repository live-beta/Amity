package PersonOps;


/**
* Class that conatains all the functionalities arounf people in Amity
*
*/

public class PersonOps {

	private List<Person> peopleList = new ArrayList<Person>();

   /* Method that add the person object to list */
   public String addPerson(){
   	String message =" Person added successfully";
   	
   		Person person = new Person();

	   	person.setName(name);
	   	person.setCategory(category);
	   	person.setAccomodation(wants_accomodation));
	 	peopleList.add(person);

	 	return message;
   }
   /* Method returns the list of people who are saved in the application*/
   
   public String printPeople(){
   	return peopleList;
   }

}