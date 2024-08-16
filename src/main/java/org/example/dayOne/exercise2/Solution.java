package org.example.dayOne.exercise2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {

        long[] results = new long[arr.size()];

        for (int i = 0; i < arr.size(); i++) {
            long sum = 0;
            for (int j = 0; j < arr.size(); j++) {
                if (i != j) {
                    sum += arr.get(j);
                }
            }
            results[i] = sum;
        }

        long minSum = results[0];
        long maxSum = results[0];
        for (int i = 1; i < results.length; i++) {
            if (results[i] < minSum) {
                minSum = results[i];
            }
            if (results[i] > maxSum) {
                maxSum = results[i];
            }
        }

        System.out.println(minSum + " " + maxSum);

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}
