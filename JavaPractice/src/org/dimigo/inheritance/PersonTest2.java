/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *  |_ PersonTest
 * 1. 개요 : 
 * 2. 작성일 : 2017. 4. 26.
 * </pre>
 *
 * @author : amara
 * @version : 1.0
 */
public class PersonTest2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// // TODO Auto-generated method stub
		// Person a = new Person("Tom");
		// Korean k = new Korean("홍길동");
		// Japanese j = new Japanese("다나카");
		// Chinese c = new Chinese("왕밍");
		//
		// System.out.println(a);
		// System.out.println(k);
		// System.out.println(j);
		// System.out.println(c);
		//
		// a.sayHello();
		// k.sayHello();
		// j.sayHello();
		// c.sayHello();
		//
		// a.sayBye();
		// k.sayBye();
		// j.sayBye();
		// c.sayBye();

		Person[] person = { new Person("Tom"), new Korean("홍길동"), new Japanese("다나카"), new Chinese("왕밍") };

		for (Person p : person) {
			greeting(p);
		}

	}

	private static void greeting(Person p) {
		System.out.println(p);
		p.sayHello();
		p.sayBye();
		System.out.println();
	}

}
