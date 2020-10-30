package EX0807;

public class BaseballDTO {
	private String playername;
	private int homerun;
	private int foul;
	private int bingle;
	private int ball;
	private int strike;
	private int flyout;
	public String getPlayername() {
		return playername;
	}
	public void setPlayername(String playername) {
		this.playername = playername;
	}
	public int getHomerun() {
		return homerun;
	}
	public void setHomerun(int homerun) {
		this.homerun = homerun;
	}
	public int getFoul() {
		return foul;
	}
	public void setFoul(int foul) {
		this.foul = foul;
	}
	public int getBingle() {
		return bingle;
	}
	public void setBingle(int bingle) {
		this.bingle = bingle;
	}
	public int getBall() {
		return ball;
	}
	public void setBall(int ball) {
		this.ball = ball;
	}
	public int getStrike() {
		return strike;
	}
	public void setStrike(int strike) {
		this.strike = strike;
	}
	public int getFlyout() {
		return flyout;
	}
	public void setFlyout(int flyout) {
		this.flyout = flyout;
	}
	public BaseballDTO(String playername, int homerun, int foul, int bingle, int ball, int strike, int flyout) {
		super();
		this.playername = playername;
		this.homerun = homerun;
		this.foul = foul;
		this.bingle = bingle;
		this.ball = ball;
		this.strike = strike;
		this.flyout = flyout;
	}
	public BaseballDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "BaseballDTO [playername=" + playername + ", homerun=" + homerun + ", foul=" + foul + ", bingle="
				+ bingle + ", ball=" + ball + ", strike=" + strike + ", flyout=" + flyout + "]";
	}
	
	

}
