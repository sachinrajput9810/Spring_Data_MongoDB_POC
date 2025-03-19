package com.nt.document;

import java.util.Map;
import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class Player {
	@Id
	private String pid ;
	private String pname ;
	private String paddrs ;
	private Set<Sport> sports ;
	private Map<String, Medal> medals ;
	
	@Override
	public String toString() {
		return "Player [pid=" + pid + ", pname=" + pname + ", paddrs=" + paddrs + "]";
	}
	
	
	
	
}
