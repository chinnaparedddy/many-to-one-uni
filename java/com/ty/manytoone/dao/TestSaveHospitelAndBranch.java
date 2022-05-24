package com.ty.manytoone.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveHospitelAndBranch {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("naresh");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Hospital hospital = new Hospital();
		Branch branch = new Branch();
		branch.setName("Appolebng");
		branch.setState("Karnataka");
		branch.setCountry("India");
		branch.setPhone(9876223978l);
		
		
		Branch branch1 = new Branch();
		branch1.setName("Appolebng");
		branch1.setState("Karnataka");
		branch1.setCountry("India");
		branch1.setPhone(9876223978l);
		
		
		Branch branch2 = new Branch();
		branch2.setName("Appolebng");
		branch2.setState("Karnataka");
		branch2.setCountry("India");
		branch2.setPhone(9876223978l);
		
		hospital.setName("Appolo");
		hospital.setWeb("www.apolo.com");
		
		branch.setHospital(hospital);
		branch1.setHospital(hospital);
		branch2.setHospital(hospital);
		
		entityTransaction.begin();
		entityManager.persist(hospital);
		entityManager.persist(branch);
		entityManager.persist(branch1);
		entityManager.persist(branch2);
		entityTransaction.commit();
	}

}
