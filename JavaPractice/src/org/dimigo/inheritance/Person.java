/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *  |_ Person
 * 1. 개요 : 
 * 2. 작성일 : 2017. 4. 26.
 * </pre>
 *
 * @author : amara
 * @version : 1.0
 */
public class Person {
	public String name;

	public Person() {

	}
	public String setName(){
		return name;
		
	}
	public String getName(){
		return name;
		
	}
	public Person(String name) {
		this.name = name;
	}

	public void sayHello() {
		System.out.println("Hello");
	}

	public void sayBye() {
		System.out.println("Bye");

	}

	public String toString() {
		return "저는 " + name + "입니다.";

	}
}
