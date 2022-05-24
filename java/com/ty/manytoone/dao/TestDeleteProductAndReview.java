package com.ty.manytoone.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestDeleteProductAndReview {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("naresh");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		ProductReview productReview=entityManager.find(ProductReview.class, 1);
		Product product=productReview.getProduct();
		entityTransaction.begin();
		entityManager.remove(productReview);
		entityManager.remove(product);
		entityTransaction.commit();
		System.out.println("Deleted");
		
	}

}
