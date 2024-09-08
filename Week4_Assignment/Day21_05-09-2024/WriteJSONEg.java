package com.egjson;

import java.io.*;
import com.fasterxml.jackson.databind.ObjectMapper;

public class WriteJSONEg {

 public static void main (String[] args ) throws Exception{

		//Address[]
    Address[] addrs =  {new Address("street1", "city1", 645762),
    		new Address("street2", "city2", 457862),
    };
    
    
    Person obj = new Person("Ravi", 46,  addrs);
		
		ObjectMapper mapper = new ObjectMapper();
		
		FileOutputStream fos = new FileOutputStream("person.json");
		
		mapper.writeValue(fos,  obj);
		
		System.out.println("JSON File has been created");
		
	}
}

