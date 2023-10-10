package com.sendandtake.www.main.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sendandtake.www.main.dao.ProductDao;
import com.sendandtake.www.main.model.ProductVO;
import com.sendandtake.www.main.service.MainService;

@Service
public class MainServiceImpl implements MainService {

	@Autowired
	ProductDao productDao;
	
	@Override
	public List<ProductVO> selectList() {

		return productDao.selectList();
	}

}
