package com.sendandtake.www.main.dao;

import java.util.List;

import com.sendandtake.www.main.model.ProductVO;

public interface ProductDao {
	List<ProductVO> selectList();
}
