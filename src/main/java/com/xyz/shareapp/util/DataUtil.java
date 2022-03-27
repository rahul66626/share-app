package com.xyz.shareapp.util;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.xyz.shareapp.domain.StockMaster;

@Component
public class DataUtil {
	
	public List<StockMaster> getAllStocks(){
		List<StockMaster> stockList = new ArrayList<>();
		stockList.add(new StockMaster(163,"APOLLOTYRE","APOLLO TYRES LTD","INE438A01022"));
		stockList.add(new StockMaster(547,"BRITANNIA","BRITANNIA INDUSTRIES LTD","INE216A01030"));
		stockList.add(new StockMaster(772,"DABUR","DABUR INDIA LTD","INE016A01026"));
		stockList.add(new StockMaster(1250,"CASTROLIND","CASTROL INDIA LIMITED","INE172A01027"));
		stockList.add(new StockMaster(1333,"HDFCBANK","HDFC BANK LTD","INE438A01022INE040A01034"));
		stockList.add(new StockMaster(2181,"BOSCHLTD","BOSCH LIMITED","INE323A01026"));
		stockList.add(new StockMaster(3506,"TITAN","TITAN COMPANY LIMITED","INE280A01028"));
		stockList.add(new StockMaster(3787,"WIPRO","WIPRO LTD","INE075A01022"));
		return stockList;
	}

	public List<StockMaster> getItStocks(){
		List<StockMaster> stockList = new ArrayList<>();
		stockList.add(new StockMaster(18564,"LTTS","L&T TECHNOLOGY SER. LTD.","INE010V01017"));
		stockList.add(new StockMaster(1327,"HCL-INSYS","HCL INFOSYSTEMS LTD","INE216A01030"));
		stockList.add(new StockMaster(7229,"HCLTECH","HCL TECHNOLOGIES LTD","INE860A01027"));
		stockList.add(new StockMaster(11536,"TCS","TATA CONSULTANCY SERV LT","INE467B01029"));
		stockList.add(new StockMaster(11983,"SASKEN","SASKEN TECHNOLOGIES LTD","INE231F01020"));
		stockList.add(new StockMaster(2181,"BOSCHLTD","BOSCH LIMITED","INE323A01026"));
		stockList.add(new StockMaster(500209,"INFY","INFOSYS LTD","INE009A01021"));
		stockList.add(new StockMaster(3787,"WIPRO","WIPRO LTD","INE075A01022"));
		return stockList;
	}
	
}
