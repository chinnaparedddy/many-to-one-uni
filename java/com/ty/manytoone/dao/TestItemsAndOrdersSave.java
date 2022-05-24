package com.ty.manytoone.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestItemsAndOrdersSave {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("naresh");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Amazonrder amazonrder=new Amazonrder();
		Items items3 =new Items();
		items3.setName("laptop");
		items3.setPrice(501471);
		items3.setQuntity("good");
		Items items1 =new Items();
		items1.setName("pen");
		items1.setPrice(501471);
		items1.setQuntity("good");
		Items items2 =new Items();
		items2.setName("book");
		items2.setPrice(501471);
		items2.setQuntity("good");
		amazonrder.setAddress("suresh");
		amazonrder.setAddress("Basavnagudi");
		amazonrder.setStatus("Packed");
		items3.setAmazonrder(amazonrder);
		items1.setAmazonrder(amazonrder);
		items2.setAmazonrder(amazonrder);
		entityTransaction.begin();
		entityManager.persist(amazonrder);
		entityManager.persist(items3);
		entityManager.persist(items1);
		entityManager.persist(items2);
		entityTransaction.commit();
		
		
		
	}

}
