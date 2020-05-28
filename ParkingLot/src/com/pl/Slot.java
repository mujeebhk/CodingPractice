package com.pl;

public class Slot {
	
	
	private int id;
	private boolean isOccupied;
	private VSize slotSize;
	public boolean isOccupied() {
		return isOccupied;
	}
	public void setOccupied(boolean isOccupied) {
		this.isOccupied = isOccupied;
	}
	public VSize getSlotSize() {
		return slotSize;
	}
	public void setSlotSize(VSize slotSize) {
		this.slotSize = slotSize;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
}
