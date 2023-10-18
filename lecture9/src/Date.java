public class Date {
    private int year;
    private int month;
    private int day;

        public Date(int year, int month, int day) {
            this.year = year;
            this.month = month;
            this.day = day;
        }

        private int checkMonth(int testMonth){
            if(testMonth > 0 && testMonth <=12) {
                return testMonth;
            }
            else {
                System.out.printf("Invalid month (%d), set to 1",testMonth);
                return 1;
            }
        }

        private int checkDay(int testDay) {
            int[] daysPerMonth = {0,31,28,31,30,31,30,31,31,30,31,30,31};
            if(testDay > 0 && testDay <= daysPerMonth[month]) {
                return testDay;
            }
            if(this.month == 2 && testDay == 29 && (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))) {
                return testDay;
            }
            return 1;
        }
}
