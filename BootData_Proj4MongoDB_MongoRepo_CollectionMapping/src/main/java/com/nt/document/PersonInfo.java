package com.nt.document;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document
public class PersonInfo implements Serializable{
	
	@Id
	private String id ;
	private String pname ;
	private String paddrss ;
	private String[] favColors ;
	private List<String> friends ;
	private Set<Long> contactNos ;
	private Map<String , Long> bankAccountDetails ;
	private Properties idDetails ;
 }
