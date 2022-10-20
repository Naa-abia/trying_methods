public class TryingMethods {
    // this class would be used to try the different methods
    public static void main(String[] args) {
        // code to be executed
        TryingMethods mainClass = new TryingMethods(); // creating instance of a class to be able to invoke a dynamic
                                                       // method
        System.out.println(mainClass.dayOftheWeek(6));
        
        mainClass.ifStatements("Friday");  /*calling just the class because the method isnt asking for a return (void)
                                          hence calling just the method because im printing the statements.*/

        System.out.println( addToThousand());   
        System.out.println( sumEven());                               

    }

    /*
     * switch case used to check if the value is matched to the day of the week.
     * Hence based on the value input , the method would return a specific day of
     * the week. This is cleaner than writing long if statements.
     */
    String dayOftheWeek(int day) {
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

    void ifStatements(String day) {
        if (day == "Monday") {
            System.out.println("Hmmm it is " + day);
        } else if (day == "Wednesday") {
            System.out.println("It is " + day + ", Weekend is coming");
        } else if (day == "Friday") {
            System.out.println("Hurray...It is " + day + ",Let's have fun");
        } else if (day == "Sunday") {
            System.out.println("Eii...It is " + day + ",The Weekend is over");
        } else {
            System.out.println(day + "??, I don't know what day it is"); // if all the above conditions are false then
                                                                         // the system should print this statement
        }

    }

    public static int addToThousand(){

        int num = 0;
        int total = 0; //we are initialising the variable that will store the total ie. where it should start from 
        while(num < 1000){
            total += num;
            num++; // num + 1
        }
        return total;
    }

    public static int sumEven() {
        int total = 0;
        for(int i = 12; i < 103; i++){   //where i is equal to 12 while < 103 and continues to add with an interval of 1
            if(i % 2 == 0){    //if i is divided by 2 is 0 (modulas for even numbers)
                total += i; // total = total + i
            }
        }
        return total;
        
    }
}