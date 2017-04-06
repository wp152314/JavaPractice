/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *  |_ SnackTest
 * 1. 개요 : 
 * 2. 작성일 : 2017. 4. 5.
 * </pre>
 *
 * @author :  amara
 * @version : 1.0
 */
public class SnackTest {

	   public static void main(String[] args) {
	      int sum=0;
	      
	      Snack[] snack = {
	            new Snack("새우깡", "농심", 1100, 2),
	            new Snack("콘칲", "크라운", 1200, 1),
	            new Snack("허니버터칩", "해태", 1500, 4)
	      };
	      for(int i = 0; i < 3; i++){
	         System.out.println(snack[i]);
	         sum += snack[i].calcPrice();
	      }
	      
	      System.out.printf("총 구매 금액 : %,d원", sum);

	   }

	}