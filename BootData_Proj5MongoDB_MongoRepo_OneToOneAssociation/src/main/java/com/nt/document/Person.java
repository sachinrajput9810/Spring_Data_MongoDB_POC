package com.nt.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Document
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class Person {
	@Id
	private String id ;
	@NonNull
	private String name ;
	@NonNull
	private String addrs ;
	
	private DrivingLicense license ;
	
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", addrs=" + addrs + ", license=" + license + "]";
	}
	
	
	
}
