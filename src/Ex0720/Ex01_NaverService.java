package Ex0720;

import java.util.ArrayList;
import java.util.List;

public class Ex01_NaverService {
	// id 출력을 위한 메소드 선언
	public void member(List<Ex01_NavermemberDTO> naverList) {
		for(int i = 0 ; i<naverList.size();i++) {
			System.out.println(naverList.get(i).getID());
		}
	}

	public void allmember(List<Ex01_NavermemberDTO> naverList) {
		for(int i = 0 ; i<naverList.size();i++) {
			System.out.println(naverList.get(i).getID());
			System.out.println(naverList.get(i).getPassword());
			System.out.println(naverList.get(i).getName());
		}
	}
	
}
