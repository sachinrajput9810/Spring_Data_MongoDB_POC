package com.nt.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document
public class Medal {
	@Id
	private Integer id ;
	private String mname ;
	private String event ;
	private String place ;
	
	@Override
	public String toString() {
		return "Medal [id=" + id + ", mname=" + mname + ", event=" + event + ", place=" + place + "]";
	}
	
	
}
