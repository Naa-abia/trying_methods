public class TryingMethods {
    // this class is would be used to try the different methods
    public static void main(String[] args) {
        // code to be executed
        // DayOftheWeek(6);
        TryingMethods mainClass = new TryingMethods(); // creating instance of a class to be able to invoke a dynamic
                                                       // method
        System.out.println(mainClass.DayOftheWeek(6));
    }

    /*
     * switch case used to check if the value is matched to the day of the week.
     * Hence based on the value input , the method would return a specific day of
     * the week. This is cleaner than writing long if statements.
     */
    String DayOftheWeek(int day) {
        String dayName = " ";
        switch (day) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;

            default:
                dayName = "Oops! Sorry this day doesn't existed on planet Earth.";
                break;
        }

        return dayName;

    }

    // DayOftheWeek(1);
    // this is my second dynamic methods which will use a if statements to get an
    // answer of a string

}