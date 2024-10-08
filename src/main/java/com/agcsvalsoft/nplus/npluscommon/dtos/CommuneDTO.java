package com.agcsvalsoft.nplus.npluscommon.dtos;

import java.io.Serial;
import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CommuneDTO implements Serializable{

	@Serial
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	

}
