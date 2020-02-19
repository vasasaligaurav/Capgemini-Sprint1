package com.cpg.movies.serviceTest;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import com.cpg.movies.dto.MovieDto;
import com.cpg.movies.dto.ScreenDto;
import com.cpg.movies.exceptions.InvalidTheatreServiceExceptions;
import com.cpg.movies.service.TheatreService;
import com.cpg.movies.util.MovieRepository;
import com.cpg.movies.util.ScreenRepository;
public class TestServiceTest{
	@Test
	public void SearchMovieNameTest() throws Exception,InvalidTheatreServiceExceptions
	{
		TheatreService obj = new TheatreService();
		MovieRepository ob =new MovieRepository();
		Throwable excepted = assertThrows(Exception.class,()->{obj.serviceSearchMovie("sd", "asd");});
		assertEquals("Null Pointer Exception as movie name or theatre name is not matching", excepted.getMessage());
	}
	
	@Test
	public void SearchMovieNameTest1() throws Exception,InvalidTheatreServiceExceptions
	{
		TheatreService obj = new TheatreService();
		MovieRepository ob =new MovieRepository();
		MovieDto expected = obj.serviceSearchMovie("Batman", "Viva");
		assertEquals(101, expected.getMovieId());
	}
	@Test
	public void SearchScreenNameTest() throws Exception,InvalidTheatreServiceExceptions
	{
		TheatreService obj = new TheatreService();
		ScreenRepository ob =new ScreenRepository();
		Throwable excepted = assertThrows(Exception.class,()->{obj.serviceSearchScreen(10, "d");});
		assertEquals("Null Pointer Exception as the screenid or theatre name is not matching", excepted.getMessage());
	}
	@Test
	public void  SearchScreenNameTest1() throws Exception,InvalidTheatreServiceExceptions
	{
		TheatreService obj = new TheatreService();
		ScreenRepository ob =new ScreenRepository();
		ScreenDto expected = obj.serviceSearchScreen(1001, "Curo");
		assertEquals(2001, expected.getTheatreId());
	}
	
	
}