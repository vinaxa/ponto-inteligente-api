package com.cirrus_farm_technology.api.response;



import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;


public class Response <T> {
	
	@Getter
	@Setter
	private T data;
	
	@Setter
	private List<String> errors;

	
	public Response() {
	}
	
	
	public T getData() {
		return data;
	}

	
	public void setData(T data) {
		this.data = data;
	}

	
	public List<String> getErrors() {
		if (this.errors == null) {
			this.errors = new ArrayList<String>();
		}
		return errors;
	}
	
	
	public void setErrors(List<String> errors) {
		this.errors = errors;
	}
	
	
	
	
	
}