package com.cpg.movies.dto;

import java.time.LocalDate;

public class MovieDto {
	
	int movieId,movieLength;
	String movieName;
	String[] languages= {"Telugu","English","Hindi"};
	String movieDirector;
	LocalDate movieReleaseDate;
	String movieGenre;
	//movieGenre: Show[*]
	   
	public int getMovieId() {
	return movieId;
	}
	public void setMovieId(int movieId) {

	this.movieId = movieId;
	}
	public int getMovieLength() {
	return movieLength;
	}
	public void setMovieLength(int movieLength) {
	this.movieLength = movieLength;
	}
	public String getMovieName() {
	return movieName;
	}
	public void setMovieName(String movieName) {
	this.movieName = movieName;
	}
	public String getMovieDirector() {
	return movieDirector;
	}
	public void setMovieDirector(String movieDirector) {
	this.movieDirector = movieDirector;
	}

	public String getMovieGenre() {
	return movieGenre;
	}
	public void setMovieGenre(String movieGenre) {
	this.movieGenre = movieGenre;
	}
	public LocalDate getMovieReleaseDate() {
	return movieReleaseDate;
	}
	/*public void setMovieReleaseDate1(LocalDate movieReleaseDate) {
	this.movieReleaseDate = movieReleaseDate;
	}*/
	public void setMovieReleaseDate(LocalDate f) {
	// TODO Auto-generated method stub
	this.movieReleaseDate=f;
}
	public String[] getLanguages() {
		return languages;
	}
	public void setLanguages(String[] languages) {
		this.languages = languages;
	}
	

}
