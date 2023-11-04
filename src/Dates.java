import java.io.Serializable;
import java.time.LocalDate;


public class Dates implements Serializable {
    int fromDay, fromMonth, fromYear, untilDay, untilMonth, untilYear, fromNum, untilNum;
    LocalDate localDate;

    public Dates(){
        localDate = LocalDate.now();
    }

    public Dates(int fromDay,int fromMonth, int fromYear, int untilDay, int untilMonth, int untilYear){
        this.fromDay = fromDay;
        this.fromMonth = fromMonth;
        this.fromYear = fromYear;
        this.untilDay = untilDay;
        this.untilMonth = untilMonth;
        this.untilYear = untilYear;
        localDate = LocalDate.now();
    }

    /**
     * Αυτή η μέθοδος παίρνει σαν
     * παράμετρο την ημερομηνία κράτησης του χρήστη και φτιάχνει ένα αριθμό ο οποίος
     * αναπαριστά το πόσες μέρες έχουν περάσει απο την αρχή της χρονιάς
     * @param day Μέρα κράτησης
     * @param month Μήνας κράτησης
     * @param year Χρονολογία κράτησης
     * @return Επιστρέφει τον αριθμό που έχει φτιάξει η μέθοδος σύμφωνα με την ημερομηνία
     */
   public int dayToNum(int day, int month, int year) {
        int dayOfYear = 0;
            if (year > localDate.getYear()) {
                dayOfYear += 365;
            }

            for (int i = 1; i < month; i++) {

                if (i == 2) {
                    dayOfYear += 28;
                } else if (i == 1 || i == 3 || i== 5 || i == 7 || i == 8 || i == 10 || i == 12) {
                    dayOfYear += 31;
                } else {
                    dayOfYear += 30;
                }
            }


        dayOfYear += day;
        return dayOfYear;

}

    /**
     * Αυτή η μέθοδος καλεί την dayToNum για τις δυο ημερομηνίες (άφιξη και αποχώρηση)
     */
    public void setDayOfYear(){
        this.fromNum = dayToNum(fromDay,fromMonth,fromYear);
        this.untilNum = dayToNum(untilDay,untilMonth,untilYear);
    }

    public Boolean checkDate(){
        return this.fromYear < localDate.getYear();
    }
}
