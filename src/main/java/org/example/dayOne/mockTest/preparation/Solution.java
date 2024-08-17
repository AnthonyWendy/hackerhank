package org.example.dayOne.mockTest.preparation;

import java.io.*;

import static java.util.stream.Collectors.joining;


class Result {

    /*
     * Complete the 'fizzBuzz' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void fizzBuzz(int n) {

        for (int i = 1; i <= n; i++) {

            String[] numberList = String.valueOf(i).split("");
            int lastNumber = Integer.parseInt(numberList[numberList.length - 1]);

            int sumList = 0;

            for (int j = 0; j < numberList.length; j++) {
                sumList += Integer.parseInt(numberList[j]);
            }

            if ((lastNumber == 0 || lastNumber == 5) && (sumList % 3 == 0)) {
                System.out.println("FizzBuzz");
            }

            if ((lastNumber != 0 && lastNumber != 5) && (sumList % 3 == 0)) {
                System.out.println("Fizz");
            }

            if ((lastNumber == 0 || lastNumber == 5) && (sumList % 3 != 0)) {
                System.out.println("Buzz");
            }

            if ((lastNumber != 0 && lastNumber != 5) && (sumList % 3 != 0)) {
                System.out.println(i);
            }
        }

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        Result.fizzBuzz(n);

        bufferedReader.close();
    }
}
