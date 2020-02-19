package com.cpg.movies.daoTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import com.cpg.movies.dao.TheatreDao;
import com.cpg.movies.dto.MovieDto;
import com.cpg.movies.dto.ScreenDto;
import com.cpg.movies.exceptions.InvalidTheatreServiceExceptions;
import com.cpg.movies.service.TheatreService;
import com.cpg.movies.util.MovieRepository;
import com.cpg.movies.util.ScreenRepository;

public class TheaterDaoTest {
	
	@Test
	public void SearchMovieNameTest() throws Exception,InvalidTheatreServiceExceptions
	{
		TheatreDao obj = new TheatreDao();
		MovieRepository ob =new MovieRepository();
		MovieDto expected = obj.searchMovie("ad", "asdd");
		assertEquals(null, expected);
	}
	
	@Test
	public void SearchMovieNameTest1() throws Exception,InvalidTheatreServiceExceptions
	{
		TheatreDao obj = new TheatreDao();
		MovieRepository ob =new MovieRepository();
		MovieDto expected = obj.searchMovie("Batman", "Viva");
		assertEquals(101, expected.getMovieId());
	}
	@Test
	public void SearchScreenNameTest() throws Exception,InvalidTheatreServiceExceptions
	{
		TheatreDao obj = new TheatreDao();
		ScreenRepository ob =new ScreenRepository();
		ScreenDto excepted = obj.searchScreen(1, "sa");
		assertEquals(null, excepted);
	}
	@Test
	public void  SearchScreenNameTest1() throws Exception,InvalidTheatreServiceExceptions
	{
		TheatreDao obj = new TheatreDao();
		ScreenRepository ob =new ScreenRepository();
		ScreenDto expected = obj.searchScreen(1001, "Curo");
		assertEquals(2001, expected.getTheatreId());
	}


}
