package com.devsuperior.dsvendas.dtos;

import java.io.Serializable;

import com.devsuperior.dsvendas.entities.Seller;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class SellerDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;	
	
	private Long id;	
	private String name;
	
	public SellerDTO(Seller entity) {
		this.id = entity.getId();
		this.name = entity.getName();
	}
}
