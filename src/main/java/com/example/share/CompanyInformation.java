

package com.example.share;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope

public class CompanyInformation {
	private String name;
	private String telephone;
	
	public CompanyInformation() {
	}
	
	public CompanyInformation(String name, String telephone) {
		super();
		this.name = name;
		this.telephone = telephone;
	}
	
	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void printInfo() {
		System.out.print("Company: " + name + "\t Tel: "+ telephone);
		
	}
}