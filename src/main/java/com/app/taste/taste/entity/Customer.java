package com.app.taste.taste.entity;


import com.app.taste.taste.model.Active;
import com.app.taste.taste.model.CustomerType;

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
@Table(name = "customer")
@Data
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name = "name", unique = true, nullable = false)
	private String name;
	
	@Column(name = "password", nullable = false)
	private String password;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "type", unique = true, nullable = false)
	private CustomerType type;
	
	@Enumerated(EnumType.ORDINAL)
	@Column(name = "isActive", nullable = false)
	private Active isActive;

}