package EX0807;

import java.sql.Connection;
import java.util.*;
import java.util.Random;

public class BaseballService {
	BaseballDTO baseballDTO = new BaseballDTO();

	public String skhitter() {
		//SK_타수
		String[] hitter = {"정진기","최지훈","최준우","정현","최정","로맥","한동민","채태인","고종욱","김강민"};
		Random SKHRD = new Random();//SK 타수  랜덤  SKHRD = SKhitterRandom
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
		//SK_타수가 공을 쳤을때 액션 결과
				String[] hitteraction1_SK = {"홈런","파울","안타","볼","플라이아웃"};
				Random SKHARD = new Random();
				int rannum2 = SKHARD.nextInt(hitteraction1_SK.length);
				
				return hitteraction1_SK[rannum2];
	}
	
	public String skhitteraction2() {
		//SK_타수가 공을 기다릴때 액션 결과
		String[] hitteraction2_SK = {"볼","스트라이크"};
		Random SKHARD = new Random();
		int rannum2 = SKHARD.nextInt(hitteraction2_SK.length);
				
		return hitteraction2_SK[rannum2];
		
	}
	
	public int homerun(String result, int homerun) {
		//홈런
		String HR = result;
	
		if(HR.equals("홈런")) {
			homerun++;
			System.out.println("홈런!!!!");
			
		}return homerun;
	}
	public int foul(String result, int foul) {
		//파울
		String F = result;
		if(F.contentEquals("파울")) {
			foul++;
			
			System.out.println("파울 입니다.");
		}return foul;
	}
	public int bingle(String result, int bingle) {
		//안타
		String BG = result;
		if(BG.equals("안타")) {
			bingle++;
			
			System.out.println("안타 입니다.");
		}return bingle;
	}
	public int ball(String result, int ball) {
		//볼
		String B = result;
		if(B.equals("볼")) {
			ball++;
			
			System.out.println("볼 입니다.");
		}
			return ball;
	}
	public int strike(String result, int strike) {
		//스트라이크
		String ST = result;
		if(ST.equals("스트라이크")) {
			strike++;
			
			System.out.println("스트라이크 입니다.");
			
		}return strike;
	}
	public int flyout(String result, int flyout) {
		//플라이아웃
		String FL = result;
		if(FL.equals("플라이아웃")) {
			flyout++;
			
			System.out.println("플라이아웃 입니다.");
		}return flyout;
	}
}
