package com.cpg.movies.util;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import com.cpg.movies.dto.SeatDto;
import com.cpg.movies.dto.SeatDto.BookingState;
public class SeatRepository {
	public static HashMap <List<SeatDto>,Enum<?>> listOfSeatsAndStatus=  new  HashMap<List<SeatDto>,Enum<?>>();
	public static List <SeatDto> listOfSeats1 = new ArrayList <SeatDto>();
	public static List <SeatDto> listOfSeats2 = new ArrayList <SeatDto>();
	public static List <SeatDto> listOfSeats3 = new ArrayList <SeatDto>();
	public SeatRepository()
	{
		listOfSeats1.add(new SeatDto(101,343.99));
		listOfSeats2.add(new SeatDto(102,452.70));
		listOfSeats3.add(new SeatDto(103,232.70));
		listOfSeatsAndStatus.put(listOfSeats1, BookingState.Available);
		listOfSeatsAndStatus.put(listOfSeats2, BookingState.Available);
		listOfSeatsAndStatus.put(listOfSeats3, BookingState.Available);
		/*object.setSeatId(101);
		object.setSeatPrice(205.09);
		object.setSeatStatus(BookingState.Available);
		object.getSeatStatus();
		listOfSeats.add(object);
		*/
	}
	}
