package com.beer.app.web.domain;

import java.sql.Timestamp;
import java.util.UUID;

import com.beer.app.web.model.BeerStyleEnum;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Beer {
	private UUID id;
    private String beerName;
    private String beerStyle;
    private Long upc;
    
    private Timestamp createdDate;
    private Timestamp lastUpdatedDate;
}
