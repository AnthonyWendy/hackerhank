package org.example.dayTwo.exercise2;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {

        int primaryDiagonal = 0;
        int secondDiagonal = 0;
        int n = arr.size();

        for (int i=0; i < arr.size() ; i++){
            primaryDiagonal += arr.get(i).get(i);
            secondDiagonal += arr.get(i).get(n -1 - i);
        }

        return  Math.abs(primaryDiagonal - secondDiagonal);

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {

        List<List<Integer>> arr = new ArrayList<>();
        arr.add(Arrays.asList(11, 2, 4));
        arr.add(Arrays.asList(4, 5, 6));
        arr.add(Arrays.asList(10, 8, -12));

        int result = Result.diagonalDifference(arr);
        System.out.println(result);
    }
}

