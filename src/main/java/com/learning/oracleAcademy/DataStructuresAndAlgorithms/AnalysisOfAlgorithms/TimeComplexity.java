package main.java.com.learning.oracleAcademy.DataStructuresAndAlgorithms.AnalysisOfAlgorithms;


public class TimeComplexity {
    public static void main(String[] args) {
        double now = System.currentTimeMillis();
        TimeComplexity timeComplexity = new TimeComplexity();
        System.out.println(timeComplexity.findSumOfNaturalNumbers(99999999));
        System.out.println("Time taken is " + (System.currentTimeMillis() - now) + " milli seconds");

    }


    // this method is taking 2.0 milli seconds of time
    public int findSumOfNaturalNumbers(int number) {
        return number * (number + 1) / 2;
    }

    // this method is taking 72.0 milli seconds of time
    public int findSumOfNatural(int number) {
        int sum = 0;
        for (int i = 0; i <= number; i++) {
            sum = sum + i;
        }
        return sum;

    }
}
