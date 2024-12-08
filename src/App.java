public class App {

    public static void main(String[] args) {
        var age = 10;

        // type casting
        double a = 10;
        int b = (int) a;

        int intArray1[][] = new int[3][5];

        int intArray2[][] = {
                { 1, 2, 3, 4, 5 },
                { 1, 2, 3, 4, 5 },
                { 1, 2, 3, 4, 5 }
        };

        int intArray3[][] = new int[3][];
        intArray3[0] = new int[3];
        intArray3[1] = new int[5];
        intArray3[2] = new int[7];

        {
            int i = 10;
        }
        {
            var i1 = 20;
        }

        int dayOfWeek = 21;
        String dayName = switch (dayOfWeek) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Invalid day";
        };
        // System.out.println(dayName); // Output: Tuesday

        // Array declaration
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int total = 0;
        for (int temp : arr) {
            total = total + temp;
        }
        System.out.println(total);
    }

}
