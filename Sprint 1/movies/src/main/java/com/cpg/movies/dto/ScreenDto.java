package com.cpg.movies.dto;

import java.time.LocalDate;
import java.util.List;

public class ScreenDto {
	int screenId,theatreId,rows,columns;
	String screenName;
	List<?> showList;
	LocalDate movieEndDate;
	public int getScreenId() {
		return screenId;
	}
	public void setScreenId(int screenId) {
		this.screenId = screenId;
	}
	public int getTheatreId() {
		return theatreId;
	}
	public void setTheatreId(int theatreId) {
		this.theatreId = theatreId;
	}
	public int getRows() {
		return rows;
	}
	public void setRows(int rows) {
		this.rows = rows;
	}
	public int getColumns() {
		return columns;
	}
	public void setColumns(int columns) {
		this.columns = columns;
	}
	public String getScreenName() {
		return screenName;
	}
	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}
	public List<?> getShowList() {
		return showList;
	}
	public void setShowList(List<?> showList) {
		this.showList = showList;
	}
	public LocalDate getMovieEndDate() {
		return movieEndDate;
	}
	public void setMovieEndDate(LocalDate movieEndDate) {
		this.movieEndDate = movieEndDate;
	}

}
