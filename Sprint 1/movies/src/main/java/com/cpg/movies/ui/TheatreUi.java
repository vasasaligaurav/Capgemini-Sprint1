package com.cpg.movies.ui;

import java.util.Arrays;
import java.util.Scanner;

import com.cpg.movies.dao.TheatreDao;
import com.cpg.movies.dto.MovieDto;
import com.cpg.movies.dto.ScreenDto;
import com.cpg.movies.service.TheatreService;


public class TheatreUi {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int choice,scrnId;
		String mveName,theatre1,theatre2;
		TheatreService obj = new TheatreService();
		Scanner sc = new Scanner(System.in);
		MovieDto movieDtoObject;
		ScreenDto screenDtoObject;
		while(true)
		{
			System.out.println("\nEnter your Choice\n"+"1.Search Movie\n"+"2.Search Screen");
			choice = sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("Enter the Movie Name");
				mveName = sc.next();
				System.out.println("Enter the Theartre Name");
				theatre1 = sc.next();
				movieDtoObject=obj.serviceSearchMovie(mveName,theatre1);
				System.out.println("Movie id:"+movieDtoObject.getMovieId()
				+"\nMovie Name:"+movieDtoObject.getMovieName()+
						"\nMovie Genre:"+movieDtoObject.getMovieGenre()+"\nMovie Director:"+movieDtoObject.getMovieDirector()+
						"\nMovie Length:"+movieDtoObject.getMovieLength()+"\nLanguages:"+Arrays.asList(movieDtoObject.getLanguages())
						+"\nMovie RealeaseDate:"+movieDtoObject.getMovieReleaseDate());
				break;
			case 2:
				System.out.println("Enter the Screen Name");
				scrnId = sc.nextInt();
				System.out.println("Enter the Theartre Name");
				theatre2 = sc.next();
				screenDtoObject = obj.serviceSearchScreen(scrnId,theatre2);
				System.out.println("ScreenId:"+screenDtoObject.getScreenId()+"\ntheatreId:"+screenDtoObject.getTheatreId()+"\nscreenName:"+screenDtoObject.getScreenName()+"\nshowList:"+screenDtoObject.getShowList()+"\nRows:"+screenDtoObject.getRows()	+"\nColumns:"+screenDtoObject.getColumns());
				break;
			default:
				System.out.println("Exited");
				System.exit(0);
			}
			
		}
	
	}

}
