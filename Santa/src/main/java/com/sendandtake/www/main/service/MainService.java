package com.sendandtake.www.main.service;

import java.util.List;

import com.sendandtake.www.main.model.MainVO;
import com.sendandtake.www.main.model.ProductVO;

public interface MainService {

	List<ProductVO> selectList();

}
