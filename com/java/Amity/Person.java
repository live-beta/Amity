package Person;

/**
* Class constaing data states for people in Amity.
*/

public class Person extends Room {


 private String name,category;
 private char wants_accomodation;
 List <String> personList = new ArrayList<String>();

 /* Contructor function for the initialioskatin of data items */


 public Person(String name, String category, char wants_accomodation = 'N'){

 	this.name = setName(name);
 	this.category = setCategory(category);
 	this.wants_accomodation = setAccomodation(wants_accomodation);
 	
 }

 /* Sets up the users name*/

 public void setName(String name){

 	this.name = name;

 } 
 /* Sets up the users category */

 public void setCategory(String category){

 	this.category = category;
 }
/* Sets up accomodation*/

public void setAccomodation(String accomodation){

	this.accomodation = accomodation;
}

/* Gets the persons name*/
 public String getName (){

 	return name;
 }

 /* Gets the persons category*/
 public String getCategory(){

 	return category;

 }
 /* Gets the persons accomdation preference*/

 public Char getAccomodation(){

 	return wants_accomodation;
 }

 /* Method to add a new person to the application*/

 }