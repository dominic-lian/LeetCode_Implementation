package com.dominic;

class Solution {
    private static int count = 1;

    public int findKthLargest(int[] nums, int k) {
        return findKthLargest(nums, 0, nums.length - 1, k);
    }

    public int findKthLargest(int[] nums, int low, int high, int k) {
        if (low > high) {
            return -1;
        }
        int index = partition(nums, low, high);

        count = index - low + 1;

        if (count > k) {
            return findKthLargest(nums, low, index - 1, k);
        } else if (count < k) {
            return findKthLargest(nums, index + 1, high, k - count);
        } else {
            return nums[index];
        }
    }

    public static int partition(int[] a, int low, int high) {
        int i = low, j = high, temp = a[low];
        if (low < high) {
            while (i < j) {
                while (i < j && temp >= a[j]) {
                    j -= 1;
                }

                if (i < j) {
                    a[i] = a[j];
                    i += 1;
                }

                while (i < j && temp <= a[i]) {
                    i += 1;
                }

                if (i < j) {
                    a[j] = a[i];
                    j -= 1;
                }
            }
            a[i] = temp;
        }

        return i;
    }
}
