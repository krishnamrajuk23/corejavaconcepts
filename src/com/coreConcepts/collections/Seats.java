package com.coreConcepts.collections;

public class Seats {
	private String seatNumber;
	private boolean reversed = false;
	
	public boolean reversed() {
		if(!this.reversed){
			this.reversed = true;
			System.out.println("seat is avaliable"+ seatNumber + "you can book it");			
		}else{
			this.reversed = false;
			System.out.println("Seat are filled");			
		}
		return this.reversed;		
	}

	public Seats(String seatNumber){
		this.seatNumber = seatNumber;
	}
}
