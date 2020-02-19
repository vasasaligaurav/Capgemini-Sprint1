package com.cpg.movies.util;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import com.cpg.movies.dto.ScreenDto;

public class ScreenRepository {
	public static HashMap<String,List<ScreenDto>> listOfTheatreAndScreen = new HashMap<String,List<ScreenDto>>();
	public static List<ScreenDto> listOfScreen1 = new ArrayList<ScreenDto>();
	public static List<ScreenDto>  listOfScreen2= new ArrayList<ScreenDto>();
	public static List<ScreenDto>  listOfScreen3= new ArrayList<ScreenDto>();
	public ScreenRepository()
	{
		ScreenDto obj = new ScreenDto();
		obj.setScreenId(1001);
		obj.setScreenName("Screen 1");
		obj.setTheatreId(2001);
		obj.setRows(25);
		obj.setColumns(25);
		LocalDate d=LocalDate.of(2020, 12 ,12);
		obj.setMovieEndDate(d);
		String arr[]= {"ABCD","GOD OF WAR"};
		obj.setShowList(Arrays.asList(arr));
		listOfScreen1.add(obj);
		
		ScreenDto obj1 = new ScreenDto();
		obj1.setScreenId(1002);
		obj1.setScreenName("Screen 2");
		obj1.setTheatreId(2002);
		obj1.setRows(26);
		obj1.setColumns(35);
		LocalDate d1=LocalDate.of(2019, 03 ,12);
		obj1.setMovieEndDate(d1);
		String arr1[]= {"Avatar","Ultron"};
		obj1.setShowList(Arrays.asList(arr1));
		listOfScreen2.add(obj1);
		
		ScreenDto obj2 = new ScreenDto();
		obj2.setScreenId(1003);
		obj2.setScreenName("Screen 3");
		obj2.setTheatreId(2003);
		obj2.setRows(28);
		obj2.setColumns(34);
		LocalDate d2=LocalDate.of(2002, 12 ,02);
		obj2.setMovieEndDate(d2);
		String arr2[]= {"Dhoom3","Remo"};
		obj2.setShowList(Arrays.asList(arr2));
		listOfScreen3.add(obj2);
		listOfTheatreAndScreen.put("Curo",listOfScreen1 );
		listOfTheatreAndScreen.put("Viva", listOfScreen2);
		listOfTheatreAndScreen.put("MBD", listOfScreen3);
	}

}
