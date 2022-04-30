package com.bhagyavant.assignment;

import java.io.FileReader;
import java.io.InputStreamReader;

public class file {

	 file()
	    {
	        try{
	        FileReader fr = new FileReader("output.txt");
	        String str = "";
	        int i;
		    while ((i = fr.read()) != -1)str += (char)i;
		    System.out.println("Data Stored in file : \n"+str);
	    }
	    catch(Exception e)
	    {
	        System.out.println(e);
	    }
	}
	}

