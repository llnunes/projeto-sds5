package com.devsuperior.dsvendas.dtos;

import java.time.LocalDate;

import com.devsuperior.dsvendas.entities.Sale;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class SaleDTO {

	private Long id;
	private Integer visited;
	private Integer deals;
	private Double amount;
	private LocalDate date;
	
	public SaleDTO(Sale entity) {
		this.id = entity.getId();
		this.visited = entity.getVisited();
		this.deals = entity.getDeals();
		this.amount = entity.getAmount();
		this.date = entity.getDate();
	}
}
