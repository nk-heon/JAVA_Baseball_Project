package EX0807;

import java.sql.Connection;
import java.util.*;
import java.util.Random;

public class BaseballService {
	BaseballDTO baseballDTO = new BaseballDTO();

	public String skhitter() {
		//SK_Ÿ��
		String[] hitter = {"������","������","���ؿ�","����","����","�θ�","�ѵ���","ä����","������","�谭��"};
		Random SKHRD = new Random();//SK Ÿ��  ����  SKHRD = SKhitterRandom
		int rannum1 = SKHRD.nextInt(hitter.length);
		
//				for(int i = 0; i < hitter.length;  i++) {
//					if(hitter[i].equals()) {
//						i=i+1;
//						System.out.println(i);
//					}
//				}
		return hitter[rannum1];
	}
	public String skhitteraction1() {
		//SK_Ÿ���� ���� ������ �׼� ���
				String[] hitteraction1_SK = {"Ȩ��","�Ŀ�","��Ÿ","��","�ö��̾ƿ�"};
				Random SKHARD = new Random();
				int rannum2 = SKHARD.nextInt(hitteraction1_SK.length);
				
				return hitteraction1_SK[rannum2];
	}
	
	public String skhitteraction2() {
		//SK_Ÿ���� ���� ��ٸ��� �׼� ���
		String[] hitteraction2_SK = {"��","��Ʈ����ũ"};
		Random SKHARD = new Random();
		int rannum2 = SKHARD.nextInt(hitteraction2_SK.length);
				
		return hitteraction2_SK[rannum2];
		
	}
	
	public int homerun(String result, int homerun) {
		//Ȩ��
		String HR = result;
	
		if(HR.equals("Ȩ��")) {
			homerun++;
			System.out.println("Ȩ��!!!!");
			
		}return homerun;
	}
	public int foul(String result, int foul) {
		//�Ŀ�
		String F = result;
		if(F.contentEquals("�Ŀ�")) {
			foul++;
			
			System.out.println("�Ŀ� �Դϴ�.");
		}return foul;
	}
	public int bingle(String result, int bingle) {
		//��Ÿ
		String BG = result;
		if(BG.equals("��Ÿ")) {
			bingle++;
			
			System.out.println("��Ÿ �Դϴ�.");
		}return bingle;
	}
	public int ball(String result, int ball) {
		//��
		String B = result;
		if(B.equals("��")) {
			ball++;
			
			System.out.println("�� �Դϴ�.");
		}
			return ball;
	}
	public int strike(String result, int strike) {
		//��Ʈ����ũ
		String ST = result;
		if(ST.equals("��Ʈ����ũ")) {
			strike++;
			
			System.out.println("��Ʈ����ũ �Դϴ�.");
			
		}return strike;
	}
	public int flyout(String result, int flyout) {
		//�ö��̾ƿ�
		String FL = result;
		if(FL.equals("�ö��̾ƿ�")) {
			flyout++;
			
			System.out.println("�ö��̾ƿ� �Դϴ�.");
		}return flyout;
	}
}
