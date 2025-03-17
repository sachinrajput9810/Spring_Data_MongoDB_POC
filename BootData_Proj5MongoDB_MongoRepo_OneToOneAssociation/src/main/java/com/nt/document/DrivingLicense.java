package com.nt.document;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Document
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
public class DrivingLicense {
	@Id
	private String id ;
	@NonNull
	private Long LicenseNo ;
	@NonNull
	private String licenseType ;
	@NonNull
	private LocalDate expiryDate ;
	private Person personDetails ;
	
	@Override
	public String toString() {
		return "DrivingLicense [id=" + id + ", LicenseNo=" + LicenseNo + ", licenseType=" + licenseType
				+ ", expiryDate=" + expiryDate + ", personDetails=" + personDetails + "]";
	}
	
	
	
	
}
