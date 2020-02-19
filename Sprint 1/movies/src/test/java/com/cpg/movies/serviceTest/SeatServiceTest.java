package com.cpg.movies.serviceTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.cpg.movies.dto.SeatDto;
import com.cpg.movies.dto.SeatDto.BookingState;
import com.cpg.movies.exceptions.InvalidSeatServiceException;
import com.cpg.movies.service.SeatService;
import com.cpg.movies.util.SeatRepository;

public class SeatServiceTest
{
	SeatRepository obj1=new SeatRepository();
	@Test
	public void SeatBlockSeat() throws InvalidSeatServiceException
	{
		SeatService obj = new SeatService();
		Throwable exception = assertThrows(Exception.class,()->{obj.serviceBlockSeat(104);});
		assertEquals("Null pointer:May be the seatid not present", exception.getMessage());
	}
	
	@Test
	public void SeatBlockSeat1() throws InvalidSeatServiceException 
	{
		
		SeatService obj = new SeatService();
		Enum<?> expected = obj.serviceBlockSeat(101);
		assertEquals(BookingState.Blocked,expected);
	}
	
	@Test
	public void SeatBookSeat() throws InvalidSeatServiceException
	{
		SeatService obj = new SeatService();
		Throwable exception = assertThrows(Exception.class,()->{obj.serviceBookSeat(104);});
		assertEquals("Null pointer:May be the seatid not present or it is blocked", exception.getMessage());
	}
	
	@Test
	public void SeatBookSeat1() throws InvalidSeatServiceException 
	{
		
		SeatService obj = new SeatService();
		SeatDto expected = obj.serviceBookSeat(102);
		assertEquals(102,expected.getSeatId());
	}
	
	@Test
	public void SeatCancelSeat() throws InvalidSeatServiceException
	{
		SeatService obj = new SeatService();
		Throwable exception = assertThrows(Exception.class,()->{obj.serviceCancelSeat(104);});
		assertEquals("Null pointer:May be the seatid not present or it is blocked", exception.getMessage());
	}
	@Test
	public void SeatCancelSeat1() throws InvalidSeatServiceException 
	{
		
		SeatService obj = new SeatService();
		obj.serviceBookSeat(103);
		SeatDto expected = obj.serviceCancelSeat(103);
		assertEquals(232.7,expected.getSeatPrice());
	}
}