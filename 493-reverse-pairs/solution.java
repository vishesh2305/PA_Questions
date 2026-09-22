// 493. Reverse Pairs
// https://leetcode.com/problems/reverse-pairs/
// Difficulty: Hard
// Language:   Java
// Submitted:  2026-07-18 04:25:09
// Runtime:    77 ms (beats 20.85%)
// Memory:     58.8 MB (beats 95.80%)
// Topics:     Array, Binary Search, Divide and Conquer, Binary Indexed Tree, Segment Tree, Merge Sort, Ordered Set, Treap

class Solution {
    public int reversePairs(int[] nums) {
        return mergeSort(nums, 0, nums.length-1);
    }

    public static void Merge(int[] arr, int low, int mid, int high){
        ArrayList<Integer> temp = new ArrayList<>();

        int left = low;
        int right = mid+1;

        while(left <= mid && right<= high ){

            if(arr[left] <= arr[right]){
                temp.add(arr[left]);
                left++;
            }else{
                temp.add(arr[right++]);
            }

        }

        while(left <=mid ){
            temp.add(arr[left++]);
        }

        while(right <= high){
            temp.add(arr[right++]);
        }

        for(int i=low; i<=high; i++){
            arr[i] = temp.get(i - low);
        }
    }

    public static int CountPairs(int[] arr, int low, int mid, int high){
        int count =0;
        int right = mid+1;

        for(int i=low; i<= mid; i++){
            while(right <= high && (long) arr[i] > 2L*arr[right]){
                right++;
            }
            count+= (right - (mid+1));
        }

        return count;
    }

    public static int mergeSort(int[] arr, int low, int high){
        if(low >= high) return 0;

        int mid = low + (high-low)/2;

        int count = mergeSort(arr, low, mid);

        count+= mergeSort(arr, mid+1, high);

        count+= CountPairs(arr, low, mid, high);

        Merge(arr, low, mid, high);
        return count;

    }
}
