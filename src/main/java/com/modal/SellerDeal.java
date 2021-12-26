package com.modal;

import java.util.Date;

public class SellerDeal {

	// auto
	private Integer id;
	private Item item;
	private Integer maxAvailableQuantity;
	private Date startTime;
	private Date endTime;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public Integer getMaxAvailableQuantity() {
		return maxAvailableQuantity;
	}

	public void setMaxAvailableQuantity(Integer maxAvailableQuantity) {
		this.maxAvailableQuantity = maxAvailableQuantity;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

}
