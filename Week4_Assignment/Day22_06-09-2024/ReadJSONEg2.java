package com.egjson;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.*;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class ReadJSONEg2 {

public static void main (String[] args ) throws Exception{
		
		ObjectMapper omapper = new ObjectMapper();
		FileInputStream fis = new FileInputStream("./operson.json");
		
		ObjectNode onode = (ObjectNode)omapper.readTree(fis);
		String str = omapper.writeValueAsString(onode);
		
		System.out.println(str);
		

	}

}
