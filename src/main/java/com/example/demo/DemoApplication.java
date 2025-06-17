package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@SpringBootApplication
public class DemoApplication {
//
//    public static final double R = 6371; // Radius of Earth in kilometers
//
//    public static double haversine(double lat1, double lon1, double lat2, double lon2) {
//        double dLat = Math.toRadians(lat2 - lat1);
//        double dLon = Math.toRadians(lon2 - lon1);
//
//        double a = Math.pow(Math.sin(dLat / 2), 2) +
//                         Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2)) *
//                        Math.pow(Math.sin(dLon / 2), 2);
//        double c = 2 * Math.asin(Math.sqrt(a));
//
//        return R * c;
//    }


//    public static int removeDuplicates(int[] nums, int val) {
//        if (nums.length == 0) return 0; // Edge case
//
//        int uniqueIndex = 0; // Pointer to track unique elements
//
//        for (int i = 0; i < nums.length; i++) {
//            if(nums[i]!=val){
//                nums[uniqueIndex]= nums[i];
//                uniqueIndex++;
//            }
//
//        }
//
//        return uniqueIndex  ; // New size of array with unique elements
//    }
//
//
//
//    public static int divide(int dividend, int divisor) {
//
//        int result = dividend/divisor;
//        return result;
//
//    }
//
//    public static int[] searchRange(int[] nums, int target) {
//        int first = findIndex(nums, target, true);
//        int last = findIndex(nums, target, false);
//        return new int[]{first, last};
//    }
//
//    private static  int findIndex(int[] nums, int target, boolean findFirst) {
//        int left = 0, right = nums.length - 1, index = -1;
//
//        while (left <= right) {
//            int mid = left + (right - left) / 2;
//
//            if (nums[mid] == target) {
//                index = mid;
//                if (findFirst) right = mid - 1;
//                else left = mid + 1;
//            } else if (nums[mid] < target) {
//                left = mid + 1;
//            } else {
//                right = mid - 1;
//            }
//        }
//
//        return index;
//    }
//


    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
        {
//        double lat1 = 19.11607, lon1 = 72.92563; // Mumbai cateina
//        double lat2 = 21.10457, lon2 = 77.15305; // Wadali Deshmmukh
//
//        System.out.println("Distance: " + haversine(lat1, lon1, lat2, lon2) + " km");
//        double degrees = 90.0;
//        double radians = Math.toRadians(degrees);
//        System.out.println("radians  :  " +radians);

//          int []nums = {0,0,1,1,1,2,2,3,3,4};
//
//            System.out.println("result : "+removeDuplicates(nums,1));
//            System.out.println("result : "+divide(2147483647,-1));
//            System.out.println("result : "+searchRange(new int[]{5,7,7,8,8,10},8));

//            List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
//            numbers.stream()
//                    .filter(n -> n % 2 == 0 || n % 3 == 0)
//                    .forEach(System.out::println);
//        }
        }
    }
}