package org.example;

import java.util.List;

public class Solution {

    /**
     * Counts the pairs in the given list of integers whose sum is less than the target.
     *
     * @param nums   The list of integers to search for pairs.
     * @param target The target value to compare the pair sums against.
     * @return The count of pairs whose sum is less than the target.
     */
    public int countPairs(List<Integer> nums, int target) {
        int len = nums.size();
        int counter = 0;

        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (nums.get(i) + nums.get(j) < target) {
                    counter++;
                }
            }
        }
        return counter;
    }
}
