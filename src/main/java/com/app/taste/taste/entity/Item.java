package com.app.taste.taste.entity;

import com.app.taste.taste.model.Active;
import com.app.taste.taste.model.ItemType;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "item")
@Data
public class Item {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name = "name")
	private String itemName;
	
	@Column(name = "price", nullable = false)
	private Integer price;
	
	@Column(name = "type", unique = true, nullable = false)
	private ItemType type;
	
	@Enumerated(EnumType.ORDINAL)
	@Column(name = "isActive", nullable = false)
	private Active isActive;
	
	
}