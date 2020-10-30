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

		
		
		int AT = 0;// ���ݼ� ���� �ϸ� ��������   AT = attack
		int ATM = 1;// ���ݼ� Ÿ�� ��ȣ �����ϴ� ��   ATM = attackman
		int HAT = 0;// ���ݼ�  �׼� (ġ�ڴ�,��ġ�ڴ� )
		
		while(run) {
			boolean play = true;//���� �׽�Ʈ ���� 
			System.out.println("����  : 2���� �����ϰ�  ���õ� ������ 3.���� �׽�Ʈ�� Ŭ���Ͻÿ�");
			System.out.println("--------------------------------------------");
			System.out.println("    1. DB ����  | 2. ����(����)    | 3. ���� �׽�Ʈ    ");
			System.out.println("--------------------------------------------");
			System.out.print("����>> ");
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
				System.out.println("'"+skhittername+"'"+" ���� ����");
				baseball = new BaseballDTO();
				baseball.setPlayername(skhittername);
				boolean result1 = baseballDAO.hittername(baseball);
				if(result1) {
					System.out.println("������� ����");
					while(play) {
						System.out.println("-----------------------���� �������ϴ�.-----------------------");
						System.out.println("    1. ���� ġ�ðڽ��ϱ�??  | 2. ���� ġ�� �ʰڽ��ϱ�?? |  3. �������� ����");
						System.out.println("---------------------------------------------------------");
						System.out.print("����>> ");
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
								System.out.println("Ȩ�� : "+homerun);
								System.out.println("�Ŀ� : "+foul);
								System.out.println("��Ÿ : "+bingle);
								System.out.println("�� : "+ball);
								System.out.println("��Ʈ����ũ : "+strike);
								System.out.println("�ö��̾ƿ� : "+flyout);
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
								System.out.println("�߸� �Է��߽��ϴ�.");
							}
						}
				}else {
					System.out.println("������� ����");
				}
				break;
			case 3:
				
				
				break;
			}
		}
	}
}
	

