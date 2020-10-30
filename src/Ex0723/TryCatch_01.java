package Ex0723;

import java.util.*;



public class TryCatch_01 {

	public static void main(String[] args) {
		/*
		 * 예외 처리 (try ~ catch ~ finally) 오류가 뜨면 예외로 나오지만 콘솔에 오류 메시지가 안뜨게 함.
		 */
		
		
		List<String> list = new ArrayList<String>();
		list.add("aaa");
		try {
		for(int i =0 ;i<list.size();i++) {
			System.out.println(list.get(i));
			}
		} catch(IndexOutOfBoundsException e) {
			System.out.println("리스트 크기 초과했습니다.");
//			e.printStackTrace();
		}finally {
			System.out.println("여기는 무조건 나와요");
		}
	}

}
