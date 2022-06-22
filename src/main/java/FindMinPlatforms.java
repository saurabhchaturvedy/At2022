package main.java;

import java.util.Arrays;

public class FindMinPlatforms {


    private static int minPlatformsNeeded(int arr[], int dep[], int n) {
        Arrays.sort(arr);
        Arrays.sort(dep);

        int min_platforms = 1;
        int result = 1;

        int i = 1;
        int j = 0;

        while (i < n && j < n) {

            if (arr[i] <= dep[j]) {
                min_platforms++;
                i++;
            } else if (arr[i] > dep[j]) {
                min_platforms--;
                j++;
            }

            if (min_platforms > result) {
                result = min_platforms;
            }
        }

        return result;
    }


    public static void main(String[] args) {

    }
}
