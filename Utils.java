import java.util.Date;

public class Utils {
    public static int getDaysRented(Rental rentalInfo) {
        long diff;
        Date rentDate = rentalInfo.getReturnDate();
        if (rentalInfo.getStatus() == Rental.STATUS.RENTED.getStatus()) { // returned Video
            Date rentalDate = rentalInfo.getReturnDate();
            diff = rentalDate.getTime() - rentDate.getTime();
        } else { // not yet returned
            diff = new Date().getTime() - rentDate.getTime();
        }
        return (int) (diff / (1000 * 60 * 60 * 24)) + 1;
    }
}