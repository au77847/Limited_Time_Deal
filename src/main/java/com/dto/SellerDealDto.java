package com.dto;

public class SellerDealDto {

	private Integer id;
	private ItemDto item;
	private long hours;

	public ItemDto getItem() {
		return item;
	}

	public void setItem(ItemDto item) {
		this.item = item;
	}

	public long getHours() {
		return hours;
	}

	public void setHours(long hours) {
		this.hours = hours;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

}
