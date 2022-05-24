package com.ty.manytoone.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GetOrderAndItems {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("naresh");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
	    Items items=entityManager.find(Items.class, 2);
	    Amazonrder amazonrder=items.getAmazonrder();
	    		System.out.println(amazonrder.getId());
	    		System.out.println(amazonrder.getName());
	    		System.out.println(amazonrder.getAddress());
	    		System.out.println(amazonrder.getStatus());
	    		System.out.println(items.getItemId());
	    		System.out.println(items.getName());
	    		System.out.println(items.getPrice());
	    		System.out.println(items.getQuntity());
	}

}
