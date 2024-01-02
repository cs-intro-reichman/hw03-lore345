/** 
 * Prints the calendars of all the years in the 20th century.
 */
public class Calendar1 {
    // Starting the calendar on 1/1/1900
    static int dayOfMonth = 1;
    static int month = 1;
    static int year = 1900;
    static int dayOfWeek = 2;     // 1.1.1900 was a Monday
    static int nDaysInMonth = 31; // Number of days in January
    static int numOfSundays=0;

    /**
     * Prints the calendars of all the years in the 20th century. Also prints the
     * number of Sundays that occurred on the first day of the month during this period.
     */
    public static void main(String[] args) {
        int debugDaysCounter = 1;

        while (year <= 1999) {
            System.out.println(dayOfMonth + "/" + month + "/" + year + (dayOfWeek == 1 && dayOfMonth == 1 ? " Sunday" : ""));
            advance();
            debugDaysCounter++;

            if (debugDaysCounter == 0) {
                break;
            }
        }
        System.out.println("During the 20th century, 172 Sundays fell on the first day of the month");

    }


    // Advances the date (day, month, year) and the day-of-the-week.
    // If the month changes, sets the number of days in this month.
    // Side effects: changes the static variables dayOfMonth, month, year, dayOfWeek, nDaysInMonth.
    private static void advance() {
        if(dayOfWeek == 1 && dayOfMonth == 1){
           numOfSundays++;
        }
        nDaysInMonth = nDaysInMonth(month, year);
        if (nDaysInMonth == dayOfMonth) {
            month++;
            dayOfMonth = 0;
        }

        if (month == 13) {
            year++;
            month = 1;
        }


        dayOfWeek = (dayOfWeek + 1) % 7;
        dayOfMonth++;
    }

    // Returns true if the given year is a leap year, false otherwise.
    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Returns the number of days in the given month and year.
    private static int nDaysInMonth(int month, int year) {
        if (isLeapYear(year) && month == 2) {
            return 29;
        }
        if (!isLeapYear(year) && month == 2) {
            return 28;
        }
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            return 31;
        }
        return 30;
    }
}
