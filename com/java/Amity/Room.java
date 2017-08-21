/**
* Class that manages the data and functionality
* of rooms
*/
public class Room extends People {

	/*Constructor class*/
	public void room(String room_names){

		String [] roomNames= new String []{roomNames};

		List<String> roomList = new ArrayLists<String>();
		String message;


	}
	public String add_room(){
       
       /* Assign the correct room type */
     if (roomName.length == 0) {
     	message = "There'e are no rooms to save";
     	return message;

     } else {

 		for (int i =0; i < roomNames.length; i++ ) {

 			if (roomNames[i].room_type == "OFFICE"){

 				room_capacity = 6;

 				roomList.add("roomName":roomNames[i],"roomCapacity":room_capacity, "roomType":room_type, "occupants":occupants);

 				} else if (room_type == "LIVING") {
 					room_capacity = 4;

 			} else {

 				message = "The room type is not correct";
 					return message;
 			}

	}
			return message;
}

}	
	public String assignRoom(){
		/* this method is invoked from a person method */

		// check data fom an already existing list 
		// ensure that the method only fdoes on e thing in returning the required room 
		// test that the room theat is returned is of the correct order. 


	}
	
	public String reallocateRoom(){

	}

}