
import static org.junit.Assert.assertEquals;
import org.junit.Test;
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
	public void test_correct_response_when_no_data_is_entered(){

		/* A specific value should be returned whn*/
		assertEquals(room_obj("","DEFAULT"),"There's no room to be saved");

	}

	@Test
	public void test_that_a_working_space_has_been_created_successfully(){


		assertEquals(room_obj(office_data,"OFFICE"), "OFFICE space Added Successfully");

	}
	@Test

	public void test_that_a_new_living_area_has_been_created_successfully(){
		
		assertEquals(room_obj(room_data,"LIVING"),"LIVING area has been creted successfully");
	
	}

	@Test 
	public void test_that_rooms_are_available_for_allocation(){

		assertEquals(room_obj(),"There are no rooms to assign");

	}

	@Test
	public void test_that_the_system_can_tell_if_all_rooms_are_occupied(){

		assertEquals(room_obj(),"All rooms are occupied");
	}
ls
	@Test
	public void test_that_the_room_being_assigned_is_of_correct_type(){

		assertEquals(room_obj(),room.type="LIVING");
	}
	
	@Test

	public void test_that_correct_room_category_is_added(){
		
		assertEquals(room_obj(room_data,"OTHER"),"Room type is not defined");
	}

	@Test
	public void test_that_a_new_fellow_has_been_added_successfully(){

		assertEquals(person_obj(person_data),"FELLOW has been added successfully");

	}

	@Test
	public void test_reallocate_person(){

		/*Assert that a user has been reallocated properly*/


	}

	@Test
	public void test_load_people_from_database(){

	}

	@Test
	public void test_print_people_allocated(){

	}

	@Test
	public void test_save_state(){

	}
	@Test
	public void load_state(){

	}
}