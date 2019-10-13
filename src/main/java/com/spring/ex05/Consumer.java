/**
 * 
 */
package com.spring.ex05;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * @CLASS Name
 *  Consumer
 * 
 * @AUTHOR     : Rony Kwak
 * @CREATE DATE: 2019-10-13
 * @PROJECT    : Java-Spring4-Ex05
 * @PACKAGE    : com.spring.ex05
 * @Description: 
 * =============================
 * @Change History
 * v1.0: 
 * v1.1: 
 * =============================
 **/
public class Consumer {
	@Autowired
	@Qualifier("adidasCorp")
	Shoes shoes;
	
//	public Shoes getShoes() {
//		return shoes;
//	}
//	
//	public void setShoes(Shoes shoes) {
//		this.shoes = shoes;
//	}
	
	public String getShoesBrand() {
		return "착용하고있는 신발브랜드: " + shoes.getBrand();
	}
}
