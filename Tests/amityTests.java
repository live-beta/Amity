
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import junit.framework.*;


/**
*
* Unit tests for core amity functionality
*
*/
public class amityTests {

	 String [] person_data;
	 String [] room_data;
	 String [] office_data;


	public void setUp(){

		/* Initialize objects and data */
		Person person_obj = new  Person();
		Room room_obj = new Room();
		person_data = new String[]{"SAMMY WANJALA","FELLOW", "Y"};
	    room_data = new String [] {"Room 1","Room 2"};
		office_data = new String [] {"Area 1","Area 2","Area 3"};

	}

	@Test
	public void test_load_state(){

	}
	@Test
	public void test_save_state(){

	}

	@Test
	public void test_print_people_allocated(){

	}

	@Test
	public void test_print_people_unallocated_state(){

	}
}