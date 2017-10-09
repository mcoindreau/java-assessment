public class Assessment {


    public static int setSquare(int square) {

        //Write a static method called `square(number)` accepts an integer as input and returns that number times itself.
        int setSquare = square * square;

        return setSquare;
    }

    //Write a static method `sum(number1, number2)` method that works with both integers and doubles (use method overloading) and returns the result.
    public static int sum(int a, double b) {
        return (int) (a + b);
    }

    public static double getAverage(int[] array)
    {
        int sum = 0;
        for(int i : array) sum += i;
        return ((double) sum)/array.length;
    }

    //Write a `main` method on this class in order to run code that tests the above methods.
    public static void main(String[] args) {

        //square method
//        int setSquare = setSquare(5);
//        System.out.println("The square is = " + setSquare);
        System.out.println("The square is = " + Assessment.setSquare(6));

        //sum method
        double sum = sum(2, 3.2);
        System.out.println("The sum is " + sum);

        //average method
//        double getAverage;
//        getAverage(2, 3.2, 4);
//        System.out.println(Double.parseDouble(getAverage));
        System.out.println("The average is = " + getAverage(90, 90));

    }

    private static int getAverage(int i, int i1) {

        return sum(90, 90) / 2;
    }


}
