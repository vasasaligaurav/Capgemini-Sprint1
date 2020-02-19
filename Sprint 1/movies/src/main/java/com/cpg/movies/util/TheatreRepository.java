package com.cpg.movies.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import com.cpg.movies.dto.*;


public class TheatreRepository {
	public static  List <TheatreDto> listOfTheatres = new ArrayList<TheatreDto>();
	public static HashMap<String,List<Integer>> listOfMoviesAndScreens = new HashMap<String,List<Integer>>();
	public TheatreRepository()
	{
		//Theater 1
		TheatreDto object = new TheatreDto();
		object.setTheatreId(2001);
		object.setTheatreName("Viva College");
		object.setTheatreCity("Jalandhar");
		object.setManagerName("Chandralekha");
		object.setManagerContact("9493131944");
		listOfTheatres.add(object);
		//Theater 2
		TheatreDto object1 = new TheatreDto();
		object1.setTheatreId(2002);
		object1.setTheatreName("CURO");
		object1.setTheatreCity("Amritsar");
		object1.setManagerName("Karthik");
		object1.setManagerContact("5962548963");
		listOfTheatres.add(object1);
		//Theater 3
		TheatreDto object2 = new TheatreDto();
		object2.setTheatreId(2003);
		object2.setTheatreName("MBD");
		object2.setTheatreCity("Chandigarh");
		object2.setManagerName("Roshan");
		object2.setManagerContact("8932324597");
		listOfTheatres.add(object2);
		//Theater 4
		TheatreDto object3 = new TheatreDto();
		object3.setTheatreId(2004);
		object3.setTheatreName("Prime");
		object3.setTheatreCity("Phargwara");
		object3.setManagerName("Madhan");
		object3.setManagerContact("8463214578");
		listOfTheatres.add(object3);
		
		//List Of Movie And particular Screens
		Integer [] movie1=  {1,2,3,5};
		listOfMoviesAndScreens.put("Sahoo", Arrays.asList(movie1));
		Integer [] movie2= {4,9};
		listOfMoviesAndScreens.put("Bang Bang", Arrays.asList(movie2));
		Integer [] movie3= {8,6,10};
		listOfMoviesAndScreens.put("Avengers", Arrays.asList(movie3));
		Integer [] movie4= {7,11,12};
		listOfMoviesAndScreens.put("The End Game", Arrays.asList(movie4));
	}
	//Testing the Repository
	/*public static void main(String [] args)
	{
		TheatreRepository gav = new TheatreRepository();
		for(Theater g :listOfTheaters)
		{
			System.out.println(g.getManagerName());
		}
	}*/


}
