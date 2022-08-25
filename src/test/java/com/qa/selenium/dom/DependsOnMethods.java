package com.qa.selenium.dom;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethods {
	@Test(priority = 1)
	public void createUser() {
		System.out.println("createUser...user created successufuly");
		Assert.fail();
	}
	
	@Test(priority=2, dependsOnMethods="createUser") 
	public void deleteUser(){ 
		System.out.println("deleteUser...");
		}

	/* Cyclic Dependencies */

//	@Test(priority=1, dependsOnMethods="deleteUser")
//	public void createUser(){
//		System.out.println("createUser...user created successufuly");
//		}
//	
//	@Test(priority=3, dependsOnMethods="createUser")
//	public void deleteUser(){
//		System.out.println("deleteUser...");
//		}

}
