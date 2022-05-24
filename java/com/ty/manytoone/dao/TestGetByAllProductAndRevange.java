package com.ty.manytoone.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestGetByAllProductAndRevange {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("naresh");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		ProductReview productReviews=entityManager.find(ProductReview.class, 1);
		Product product= productReviews.getProduct(); 

		System.out.println("Product id : "+product.getId());
		System.out.println("product name: "+product.getName());
		System.out.println("product Type: "+product.getType());
		System.out.println("product Cost: "+product.getCost());
		System.out.println("=============================");
		 System.out.println("Review id :"+productReviews.getId());
		 System.out.println("Review Name :"+productReviews.getName());
		 System.out.println("Review Mail :"+productReviews.getMail());
		 System.out.println("Review Review :"+productReviews.getReview());
	}

}
