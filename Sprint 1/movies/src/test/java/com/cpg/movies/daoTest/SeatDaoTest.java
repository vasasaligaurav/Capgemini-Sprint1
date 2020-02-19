package com.cpg.movies.daoTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.cpg.movies.dao.SeatDao;
import com.cpg.movies.dto.SeatDto;
import com.cpg.movies.dto.SeatDto.BookingState;
import com.cpg.movies.exceptions.InvalidSeatServiceException;
import com.cpg.movies.util.SeatRepository;

public class SeatDaoTest {
	SeatRepository obj1=new SeatRepository();
	@Test
	public void SeatBlockSeat() throws InvalidSeatServiceException
	{
		SeatDao obj = new SeatDao();
		Enum<?> exception =obj.blockSeat(10);
		assertEquals(null, exception);
	}
	
	@Test
	public void SeatBlockSeat1() throws InvalidSeatServiceException 
	{
		SeatDao obj = new SeatDao();
		Enum<?> expected = obj.blockSeat(101);
		assertEquals(BookingState.Blocked,expected);
	}
	
	@Test
	public void SeatBookSeat() throws InvalidSeatServiceException
	{
		SeatDao obj = new SeatDao();
		SeatDto exception =obj.bookSeat(10);
		assertEquals(null, exception);
	}
	@Test
	public void SeatBookSeat1() throws InvalidSeatServiceException 
	{
		SeatDao obj = new SeatDao();
		SeatDto expected = obj.bookSeat(102);
		assertEquals(102,expected.getSeatId());
	}
	
	@Test
	public void SeatCancleSeat() throws InvalidSeatServiceException
	{
		SeatDao obj = new SeatDao();
		SeatDto exception =obj.cancelSeatBooking(10);
		assertEquals(null, exception);
	}
	@Test
	public void SeatCancelSeat1() throws InvalidSeatServiceException 
	{
		SeatDao obj = new SeatDao();
		SeatDto exception =obj.bookSeat(103);
		SeatDto expected = obj.cancelSeatBooking(103);
		assertEquals(232.7,expected.getSeatPrice());
	}
	
}
