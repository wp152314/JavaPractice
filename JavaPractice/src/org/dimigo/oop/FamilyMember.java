/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *  |_ FamilyMember
 * 1. 개요 : 
 * 2. 작성일 : 2017. 4. 19.
 * </pre>
 *
 * @author :  amara
 * @version : 1.0
 */
public class FamilyMember {
	private static int memberCnt;
	private String memberName;
	public FamilyMember(){
		
	}
	public FamilyMember(String memberName){
		
	}
	/**
	 * @param memberName2
	 */
	 public String getMembername(){
		return memberName;
		
	}
	public static void printMemberCnt(){
		System.out.println("가족 총 인원 수 : 4명");
	}
}
