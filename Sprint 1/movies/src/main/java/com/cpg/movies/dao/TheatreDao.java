package com.cpg.movies.dao;
import com.cpg.movies.dto.MovieDto;
import com.cpg.movies.dto.ScreenDto;
import com.cpg.movies.exceptions.InvalidTheatreServiceExceptions;
import com.cpg.movies.util.*;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
public class TheatreDao {
	
			public MovieDto searchMovie(String movieName,String theatres) throws InvalidTheatreServiceExceptions
		{
				
				for (Map.Entry<String, List<MovieDto>> entry : MovieRepository.listOfTheatreAndMovies.entrySet()) 
				{
					if(theatres.equalsIgnoreCase(entry.getKey()))
					{
						for(MovieDto gav:entry.getValue())
						{
							if(movieName.equals(gav.getMovieName()))
							{
								return gav;
							}
						}
					}
		            
				}
				return null;
				
		}
			
			
			
			public ScreenDto searchScreen(int scrnid,String theaters) throws InvalidTheatreServiceExceptions
			{
				
				for (Map.Entry<String, List<ScreenDto>> entry : ScreenRepository.listOfTheatreAndScreen.entrySet()) 
				{
					if(theaters.equalsIgnoreCase(entry.getKey()))
					{
						for(ScreenDto gav1:entry.getValue())
						{
							if(scrnid == gav1.getScreenId())
							{
								return gav1;
							}
						}
					}
		            
				}
				return null;
			}
			
	}
