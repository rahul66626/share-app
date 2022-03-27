package com.xyz.shareapp.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StockMaster {
	private Integer scriptCode;
	private String name;
	private String fullName;
	private String isin;
	
	public StockMaster(Integer scriptCode, String name, String fullName, String isin) {
		super();
		this.scriptCode = scriptCode;
		this.name = name;
		this.fullName = fullName;
		this.isin = isin;
	}

	@Override
	public String toString() {
		return "StockMaster [scriptCode=" + scriptCode + ", name=" + name + ", fullName=" + fullName + ", isin=" + isin
				+ "]";
	}
	
	
	
	
}
