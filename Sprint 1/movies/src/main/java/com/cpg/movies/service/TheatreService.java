package com.cpg.movies.service;

import com.cpg.movies.dao.TheatreDao;
import com.cpg.movies.dto.MovieDto;
import com.cpg.movies.dto.ScreenDto;
import com.cpg.movies.exceptions.InvalidTheatreServiceExceptions;
import com.cpg.movies.util.MovieRepository;
import com.cpg.movies.util.ScreenRepository;

public class TheatreService extends Exception{
	TheatreDao obj = new TheatreDao();
	public MovieDto serviceSearchMovie(String moviename,String theaterName) throws InvalidTheatreServiceExceptions,Exception
	{
		new MovieRepository();
		MovieDto check = obj.searchMovie(moviename,theaterName);
		if(check==null)
		{
			throw new InvalidTheatreServiceExceptions("Null Pointer Exception as movie name or theatre name is not matching");
		}
		else
		{
			return check;
		}
		
	}
	
	public ScreenDto serviceSearchScreen(int screenid,String theaterName) throws InvalidTheatreServiceExceptions
	{
		new ScreenRepository();
		ScreenDto check1 = obj.searchScreen(screenid,theaterName);
		if(check1==null)
		{
			throw new InvalidTheatreServiceExceptions("Null Pointer Exception as the screenid or theatre name is not matching");
		}
		else
		{
			return check1;
		}
	}
	
}


