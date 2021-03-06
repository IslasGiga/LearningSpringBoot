package com.example.learning.domain;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class ItemRequest implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	@JsonIgnore
	private ItemRequestPK id = new ItemRequestPK();
	private Double discount;
	private int count;
	private Double price;
	
	public ItemRequest(){}

	public ItemRequest(Request request, Product product, Double discount, int count, Double price) {
		super();
		this.id.setRequest(request);
		this.id.setProduct(product);
		this.discount = discount;
		this.count = count;
		this.price = price;
	}
	
	
	
	public ItemRequestPK getId() {
		return id;
	}

	public void setId(ItemRequestPK id) {
		this.id = id;
	}

	public Double getDiscount() {
		return discount;
	}

	public void setDiscount(Double discount) {
		this.discount = discount;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	
	@JsonIgnore
	public Request getRequest() {
		return id.getRequest();
	}
	

	public Product getProduct() {
		return id.getProduct();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ItemRequest other = (ItemRequest) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
}
