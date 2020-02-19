package com.cpg.movies.dto;

public class SeatDto {
	public int seatId;
	public  Double seatPrice;
	 public static   Enum<?> seatStatus;
	 public enum BookingState
	{
		Available,
		Blocked,
		Booked;
	}

	public int getSeatId() {
		return seatId;
	}
	public void setSeatId(int seatId) {
		this.seatId = seatId;
	}
	
	
	public Double getSeatPrice() {
		return seatPrice;
	}
	public void setSeatPrice(Double seatPrice) {
		this.seatPrice = seatPrice;
	}
	
	
	
	
	public Enum<?> unBlockSeat()
	{
		return null;

	}
	public Enum<?> getSeatStatus() {
		return seatStatus;
	}
	
	public SeatDto(int seatId,double seatPrice)
	{
		this.seatId=seatId;
		this.seatPrice=seatPrice;
	}
	//May be Usefull
	/*public void setSeatStatus(Enum<?> seatStatus) {
	SeatDto.seatStatus = seatStatus;
	}*/


}
	
	

