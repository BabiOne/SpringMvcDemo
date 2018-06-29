package com.springmvc.service;

import com.springmvc.pojo.Items;

import java.util.List;



public interface ItemsService {


	public List<Items> list() throws Exception;
	
	public Items findItemsById(Integer id) throws Exception;
	
	public void updateItems(Items items) throws Exception;
}
