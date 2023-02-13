package com.fcacereshdez.productmicroservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.fcacereshdez.productmicroservice.entity.ProductEntity;

public interface ProductRepository extends MongoRepository<ProductEntity, String> {
	
}
