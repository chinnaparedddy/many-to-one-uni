package com.ty.manytoone.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveProductReview {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("naresh");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Product product=new Product();
		product.setName("Bike");
		product.setType("Ns200");
		product.setCost(210000);
		
		ProductReview productReview=new ProductReview();
		productReview.setName("naresh");
		productReview.setMail("nareshR@gmail");
		productReview.setReview("such a amoazing bike i neaver seen");
		
		ProductReview productReview1=new ProductReview();
		productReview1.setName("naresh");
		productReview1.setMail("nareshR@gmail");
		productReview1.setReview("such a amoazing bike i neaver seen");
		
		ProductReview productReview2=new ProductReview();
		productReview2.setName("naresh");
		productReview2.setMail("nareshR@gmail");
		productReview2.setReview("such a amoazing bike i neaver seen");
		
		List<ProductReview> productReviews=new ArrayList<ProductReview>();
		productReviews.add(productReview2);
		productReviews.add(productReview1);
		productReviews.add(productReview);
		productReview.setProduct(product);
		entityTransaction.begin();
		entityManager.persist(productReview);
		entityManager.persist(productReview1);
		entityManager.persist(productReview2);
		entityManager.persist(product);
		entityTransaction.commit();
	}

}
