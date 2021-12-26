package com.dto;

public class SellerDealDto {

	private ItemDto item;
	
	private int hours;

	private int maxAvailableQuantity;

	public ItemDto getItem() {
		return item;
	}

	public void setItem(ItemDto item) {
		this.item = item;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public int getMaxAvailableQuantity() {
		return maxAvailableQuantity;
	}

	public void setMaxAvailableQuantity(int maxAvailableQuantity) {
		this.maxAvailableQuantity = maxAvailableQuantity;
	}

}
