package com.example.demo.model;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "consequence")
public class Consequence {
	
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	public long id;
	

	
	@Column(name = "infos")
	public String infos;
	
	
	
	public Consequence () {
		
	}



	public Consequence(String infos) {
		
		this.infos = infos;
	}


	


}
