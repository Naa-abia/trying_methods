public class TryingMethods {
    // this class is would be used to try the different methods
    public static void main(String[] args) {
        // code to be executed
       // DayOftheWeek(6);
    }

    // switch case used to check if the value is matched to the day of the week.
    // Hence based on the value input , the method would return a specific day of
    // the week. This is cleaner than writing long if statements.
 void DayOftheWeek(int day) {
    switch (day) {
        case 1:
        System.out.println("Monday");
            break;
        case 2:
        System.out.println("Tuesday");
            break;
        case 3:
        System.out.println("Wednesday");
            break; 
        case 4:
        System.out.println("Thursday");
            break;
        case 5:
        System.out.println("Friday");
            break;
        case 6:
        System.out.println("Saturday");
            break;
        case 7:
        System.out.println("Sunday");
            break;                         
         
        default:
        System.out.println("Oops! Sorry this day doesn't existed on planet Earth.");
            break;
    }
    

    }

   // DayOftheWeek(1);
    // this is my second dynamic methods which will use a if statements to get an
    // answer of a string

}