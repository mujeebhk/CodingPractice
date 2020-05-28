package com.pl;

import java.util.HashSet;
import java.util.Set;

public class ParkingLot {

	private Set<Slot> smallSlotList = new HashSet<>();
	private Set<Slot> mediumSlotList = new HashSet<>();
	private Set<Slot> largeSlotList = new HashSet<>();
	private Set<Slot> xlargeSlotList = new HashSet<>();
	
	private int[]

	public boolean checkAvailability(VSize vsize) {
		if (VSize.SMALL.equals(vsize)) {
			return checksmallAndAbove();
		} else if (VSize.MEDIUM.equals(vsize)) {
			return checkmediumAndAbove();
		} else if (VSize.LARGE.equals(vsize)) {
			return checklargeAndAbove();
		} else  {
			return checkxlargeAndAbove();
		}  
		
		return true;
	}

	private boolean checkxlargeAndAbove() {
		// TODO Auto-generated method stub
		
		return false;
	}
	
	
	
	
	
}
