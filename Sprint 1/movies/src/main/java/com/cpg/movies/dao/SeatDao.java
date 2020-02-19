package com.cpg.movies.dao;
import com.cpg.movies.dto.SeatDto;
import com.cpg.movies.exceptions.InvalidSeatServiceException;
import com.cpg.movies.dto.SeatDto.BookingState;
import com.cpg.movies.util.SeatRepository;
import java.util.List;
import java.util.Map;
public class SeatDao {
	public Enum<?> blockSeat(int id) throws InvalidSeatServiceException
	{
		
		for (Map.Entry<List<SeatDto>, Enum<?>> entr : SeatRepository.listOfSeatsAndStatus.entrySet())
		{
			for(SeatDto j:entr.getKey())
			{
				if(j.getSeatId()==id && entr.getValue().equals(BookingState.Available))
				{
					entr.setValue(BookingState.Blocked);
					return entr.getValue();
				}
			}
		}
		return null;
	}
	
	public SeatDto bookSeat(int id) throws InvalidSeatServiceException
	{
		for (Map.Entry<List<SeatDto>, Enum<?>> entr : SeatRepository.listOfSeatsAndStatus.entrySet()) 
		{
			for(SeatDto j:entr.getKey())
			{
				if(j.getSeatId()==id && entr.getValue().equals(BookingState.Available))
				{
					entr.setValue(BookingState.Booked);
					return j;
					
				}
			}
		}
		return null;
		
	}
	
	public SeatDto cancelSeatBooking(int id)throws InvalidSeatServiceException
	{
		for (Map.Entry<List<SeatDto>, Enum<?>> entr : SeatRepository.listOfSeatsAndStatus.entrySet()) 
		{
			for(SeatDto j:entr.getKey())
			{
				if(j.getSeatId()==id && entr.getValue().equals(BookingState.Booked))
				{
					entr.setValue(BookingState.Available);
					return j;
				}
			}
		}
		return null;
	}
	public void getstatus(int id)
	{
		for (Map.Entry<List<SeatDto>, Enum<?>> entr : SeatRepository.listOfSeatsAndStatus.entrySet()) 
		{
			for(SeatDto j:entr.getKey())
			{
				if(j.getSeatId()==id)
				{
					System.out.println(entr.getValue());
					
				}
			}
		}
	}
}

