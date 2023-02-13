package com.fcacereshdez.productmicroservice.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value = "product")
@Getter
@Setter
@NoArgsConstructor
public class ProductEntity {
	@Id
	private String id;
	private String productName;
	private String productDescription;
	private Double unitPrice;
	private Integer quantity;
}
