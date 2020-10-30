package EX0807;

import java.util.*;



public class BaseballMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		int selectNum = 0;
		BaseballDTO baseball = null;
		BaseballDAO baseballDAO = new BaseballDAO();
		BaseballService BS = new BaseballService();

		
		
		int AT = 0;// 공격수 선택 하면 공격진행   AT = attack
		int ATM = 1;// 공격수 타수 번호 선정하는 값   ATM = attackman
		int HAT = 0;// 공격수  액션 (치겠다,않치겠다 )
		
		while(run) {
			boolean play = true;//스윙 테스트 진행 
			System.out.println("설명서  : 2번을 선택하고  선택된 선수로 3.스윙 테스트를 클릭하시오");
			System.out.println("--------------------------------------------");
			System.out.println("    1. DB 접속  | 2. 선수(렌덤)    | 3. 스윙 테스트    ");
			System.out.println("--------------------------------------------");
			System.out.print("선택>> ");
			selectNum = scan.nextInt();
			switch(selectNum) {
			case 1:
				baseballDAO.DBConnection();
				break;
			case 2:
				int homerun = 0;
				int foul = 0;
				int bingle= 0;
				int ball= 0;
				int strike= 0;
				int flyout= 0;
				String skhittername = BS.skhitter();
				System.out.println("'"+skhittername+"'"+" 선수 선택");
				baseball = new BaseballDTO();
				baseball.setPlayername(skhittername);
				boolean result1 = baseballDAO.hittername(baseball);
				if(result1) {
					System.out.println("선수등록 성공");
					while(play) {
						System.out.println("-----------------------공을 던졌습니다.-----------------------");
						System.out.println("    1. 공을 치시겠습니까??  | 2. 공을 치지 않겠습니까?? |  3. 이전으로 가지");
						System.out.println("---------------------------------------------------------");
						System.out.print("선택>> ");
						HAT = scan.nextInt();
							if(HAT==1) {
								String result = BS.skhitteraction1();
								System.out.println("'"+result+"'");
								homerun = BS.homerun(result, homerun);
								foul = BS.foul(result, foul);
								bingle = BS.bingle(result, bingle);
								ball = BS.ball(result, ball);
								flyout = BS.flyout(result, flyout);
								strike = BS.strike(result, strike);
								baseball.setHomerun(homerun);
								baseball.setFoul(foul);
								baseball.setBingle(bingle);
								baseball.setBall(ball);
								baseball.setStrike(strike);
								baseball.setFlyout(flyout);
								System.out.println("홈런 : "+homerun);
								System.out.println("파울 : "+foul);
								System.out.println("안타 : "+bingle);
								System.out.println("볼 : "+ball);
								System.out.println("스트라이크 : "+strike);
								System.out.println("플라이아웃 : "+flyout);
								baseballDAO.totalRetrun(baseball);
							}else if(HAT==2) {
								String result = BS.skhitteraction2();
								System.out.println("'"+result+"'");
								
								BS.ball(result, ball);
								BS.strike(result, strike);
								baseball = new BaseballDTO();
								
								
							}else if(HAT==3) {
						
								
								play = false;
								
							}
							else {
								System.out.println("잘못 입력했습니다.");
							}
						}
				}else {
					System.out.println("선수등록 실패");
				}
				break;
			case 3:
				
				
				break;
			}
		}
	}
}
	

