import java.util.Date;

public class Video {
	private String title ;

	private int priceCode ;
	public static final int REGULAR = 1 ;
	public static final int NEW_RELEASE =2 ;

	protected int penalty = 0;
	protected int limit = 0;

	private Date registeredDate ;
	private boolean rented ;

	public Video(String title, int priceCode, Date registeredDate) {
		this.setTitle(title) ;
		this.setPriceCode(priceCode) ;
		this.registeredDate = registeredDate ;
	}

	public int getLateReturnPointPenalty() {
		return penalty;
	}


	public int getPriceCode() {
		return priceCode;
	}

	public void setPriceCode(int priceCode) {
		this.priceCode = priceCode;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public boolean isRented() {
		return rented;
	}

	public void setRented(boolean rented) {
		this.rented = rented;
	}

	public int getLimit() {
		return limit;
	}

}
