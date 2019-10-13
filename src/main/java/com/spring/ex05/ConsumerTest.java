/**
 * 
 */
package com.spring.ex05;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @CLASS Name
 *  ConsumerTest
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
public class ConsumerTest {

	public static void main(String[] args) {
		ApplicationContext context = new FileSystemXmlApplicationContext("/src/main/resources/Shoes.xml");
		
		Consumer consumer = (Consumer)context.getBean("consumer");
		
		System.out.println(consumer.getShoesBrand());
	}
	
}
