package com.modal;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

public class Item {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private Integer itemId;
	
	private String name;
	
	private float price;
	
	@ManyToMany
	@JoinColumn(name="dealId")
	private SellerDeal deal;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public Integer getItemId() {
		return itemId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}

	public SellerDeal getDeal() {
		return deal;
	}

	public void setDeal(SellerDeal deal) {
		this.deal = deal;
	}

	

}
