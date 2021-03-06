import java.util.Date;

public class Rental {
	public enum STATUS {
		RENTED(0), RETURNED(1);

		private final int status;
		STATUS(int status){
			this.status=status;
		}
		public int getStatus() {
			return status;
		}
	}
	
	private Video video ;
	private int status ;

	private Date rentDate ;
	private Date returnDate ;

	public Rental(Video video) {
		this.video = video ;
		status = 0 ;
		rentDate = new Date() ;
	}

	public Video getVideo() {
		return video;
	}

	public int getStatus() {
		return status;
	}

	public void returnVideo() {
		if ( status == 1 ) {
			this.status = 1;
			returnDate = new Date() ;
		}
	}
	public Date getRentDate() {
		return rentDate;
	}

	public Date getReturnDate() {
		return returnDate;
	}

	public int getDaysRented() {
		long diff;
		if (getStatus() == Rental.STATUS.RENTED.getStatus()) {
			diff = returnDate.getTime() - rentDate.getTime();
		} else { // not yet returned
			diff = new Date().getTime() - rentDate.getTime();
		}
		return (int) (diff / (1000 * 60 * 60 * 24)) + 1;
	}

	public int getDaysRentedLimit() {
		int limit = 0 ;
		int daysRented = getDaysRented();

		if ( daysRented <= 2) return limit ;

		limit = video.getLimit();

		return limit ;
	}
}
