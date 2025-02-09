public class Array {
    public static void main(String[] args) {
        // Linear Search example
        int[] myarr = { 5, 7, 9, 12, 17 };
        int target = 12;
        int ans = LinearSearch(myarr, target);
        System.out.println("Index of target is: " + ans);
        int binarySearchAns = BinarySearch(myarr, target);
        System.out.println("Index of target is: " + binarySearchAns);
    }

    /**
     * very slow linear search
     * time complexity O(n)
     * space complexity O(1)
     * 
     * @param myarr
     * @param target
     * @return
     */
    public static int LinearSearch(int[] myarr, int target) {
        if (myarr.length == 0) {
            return -1;
        }
        for (int i = 0; i < myarr.length; i++) {
            if (myarr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    /**
     * binary search
     * time complexity O(log n)
     * space complexity O(1)
     * 
     * @param myarr
     * @param target
     * @return
     */
    public static int BinarySearch(int[] myarr, int target) {
        int start = 0;
        int end = myarr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (myarr[mid] < target) {
                start = mid + 1;
            } else if (myarr[mid] > target) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

}