package com.cpg.movies.util;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.HashMap;
import java.text.ParseException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.cpg.movies.dto.MovieDto;
public class MovieRepository {
	
	public static HashMap<String,List<MovieDto>> listOfTheatreAndMovies = new HashMap<String,List<MovieDto>>();
	public static List<MovieDto> listOfMovies1 = new ArrayList<MovieDto>();
	public static List<MovieDto> listOfMovies2 = new ArrayList<MovieDto>();
	public static List<MovieDto> listOfMovies3 = new ArrayList<MovieDto>();
	public MovieRepository() throws Exception
	{
	MovieDto object= new MovieDto();
	object.setMovieId(100);
	object.setMovieName("World war 3");
	object.setMovieDirector("Rajamouli");
	object.setMovieLength(100);
	//object.setMovieReleaseDate("12/12/2012");
	LocalDate d=LocalDate.of(2020, 12 ,12);
	object.setMovieReleaseDate(d);
	object.setMovieGenre("Art");
	listOfMovies1.add(object);
	listOfTheatreAndMovies.put("Curo",listOfMovies1 );

	MovieDto object1= new MovieDto();
	object1.setMovieId(101);
	object1.setMovieName("Batman");
	object1.setMovieDirector("Aman");
	object1.setMovieLength(121);
	LocalDate e=LocalDate.of(2020, 05, 10);
	object1.setMovieReleaseDate(e);
	object1.setMovieGenre("Action");
	listOfMovies2.add(object1);
	listOfTheatreAndMovies.put("Viva",listOfMovies2);
	MovieDto object2= new MovieDto();
	object2.setMovieId(102);
	object2.setMovieName("Avengers");
	object2.setMovieDirector("Chey");
	object2.setMovieLength(181);
	LocalDate f=LocalDate.of(2020, 07 , 25);
	object2.setMovieReleaseDate(f);
	//object2.setMovieReleaseDate("05/11/2020");
	object2.setMovieGenre("War");
	listOfMovies3.add(object2);
	listOfTheatreAndMovies.put("MBD",listOfMovies3);
	}
	/*public static void main(String[] args) throws Exception
	{
	MovieRepository obj= new MovieRepository();
	for(MovieDto g : listOfMovies)
	{
	System.out.println(g.getMovieReleaseDate());
	}

	}*/
}