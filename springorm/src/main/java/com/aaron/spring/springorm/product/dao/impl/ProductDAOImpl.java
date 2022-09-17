package com.aaron.spring.springorm.product.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.aaron.spring.springorm.product.dao.ProductDAO;
import com.aaron.spring.springorm.product.entity.Product;

@Component("productDAO")
public class ProductDAOImpl implements ProductDAO{
	
	@Autowired
	HibernateTemplate hibernateTemplate;
	
	@Override
	@Transactional
	public int create(Product product) {
		Integer result = (Integer) hibernateTemplate.save(product);
		return result;
	}
	

}
