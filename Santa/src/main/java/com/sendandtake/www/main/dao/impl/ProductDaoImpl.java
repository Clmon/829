package com.sendandtake.www.main.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sendandtake.www.main.dao.ProductDao;
import com.sendandtake.www.main.model.ProductVO;

@Repository
public class ProductDaoImpl implements ProductDao{

	@Autowired
	SqlSession sql;
	
	@Override
	public List<ProductVO> selectList() {

		return sql.selectList("main.list");
	}

}
