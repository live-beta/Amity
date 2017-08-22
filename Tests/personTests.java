import static org.junit.Assert.assertEquals;
import org.junit.Test;
import junit.framework.*;

/**
*
* Unit test for Person operations
*/

public class personTest {
	String [] person_data;


public void setUp(){
	Person person_obj = new Person();
	Room room_obj =new Room();
	person_data = new String[]{"SAMMY WANJALA","FELLOW", "Y"};
}

@Test
public void test_that_a_new_fellow_has_been_added_successfully(){

	assertEquals(person_obj(person_data),"FELLOW has been added successfully");

}

@Test
public void test_reallocate_person(){

	/*Assert that a user has been reallocated properly*/

	assertEquals(person_obj(person_data)," Reallocation success")

	}

@Test
public void test_that_person_data_is_of_correct_type(){

   assertTrue(person_data instanceof Array);
}
}