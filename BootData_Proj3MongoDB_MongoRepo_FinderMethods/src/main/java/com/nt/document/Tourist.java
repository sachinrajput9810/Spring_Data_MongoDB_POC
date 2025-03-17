package com.nt.document;

import java.io.Serializable;
import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document
public class Tourist implements Serializable{
	
	@Id
	private String id ;
	private String touristName ;
	private String nativePlace ;
	private Float age ;
	private String passportNo ;
	private Long contactNo ;
	private Boolean isVaccinated ;
	private Integer visaDuration ;
	private LocalDateTime visaExpiry ;
 }
