package Ex0720;

import java.util.*;

public class Ex01_Navermembermain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//ȸ�� ������ ��� ������ ArrayList ����
		List<Ex01_NavermemberDTO> naverList = new ArrayList<Ex01_NavermemberDTO>();
		//ȸ�� �ϳ��� ������ ���� DTO ���� ����
		Ex01_NavermemberDTO naver = null;
		//Service Ŭ���� ��ü ����
		Ex01_NaverService service = new Ex01_NaverService();
		int menu = 0; 
		boolean run = true;
		do {
			System.out.println("------------------------------------");
			System.out.println("1.�űԵ�� | 2.��ü���̵� | 3.��ü���� | 4.���� ");
			System.out.println("------------------------------------");
			System.out.print("�� �� > ");
			menu = scan.nextInt();
			if(menu == 1) {
				System.out.print("���̵� : ");
				String ID = scan.next();
				
				System.out.print("��й�ȣ : ");
				String password = scan.next();
				
				System.out.print("�̸� : ");
				String name = scan.next();
				//DTO��ü ����
				naver = new Ex01_NavermemberDTO();
				//��ü�� �ʵ尪 ���� ����
				naver.setID(ID);
				naver.setPassword(password);
				naver.setName(name);
				//ArrayList�� ����
				naverList.add(naver);
				
				
			}else if(menu == 2 ) {
				// id ����� ���� �޼ҵ� ȣ��
				service.member(naverList);
			}else if(menu == 3) {
				service.allmember(naverList);
			}else if(menu == 4) {
				run = false;
				System.out.println("����");
			}
		}
			while(run);

	
	}
	
}
