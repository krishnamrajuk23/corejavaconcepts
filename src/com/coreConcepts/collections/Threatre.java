package com.coreConcepts.collections;

import java.util.*;

public class Threatre {
	private final String threatre;
	private final Integer numRows;
	private final String[] seatNum;
	
	public String getThreatre() {
		return threatre;
	}

	public Integer getNumRows() {
		return numRows;
	}

	public String[] getSeatNum() {
		return seatNum;
	}

	private List<Seats> seat = new ArrayList<>();
	
	public Threatre(String threatre, int numRows, String[] seatNum){
		this.threatre = threatre;
		this.numRows = numRows;
		this.seatNum = seatNum;
	}
	
	public static void createThreatre(Threatre th) {
		String[] hi = th.getSeatNum();
		for(int i=0;i<hi.length;i++){
			for(int j=1;j<=th.getNumRows();j++) {
				System.out.println(hi[i]+""+j);
			}
		}
	}
	
	public static void main(String[] args) {
		//seatNum = new String[] {};
		createThreatre(new Threatre("Raju", 15, new String[]{"A","B","C","D","E","F"}));
	}
}
