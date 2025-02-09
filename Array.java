public class Array {
    public static void main(String[] args) {
        // Linear Search example
        int[] myarr = new int[10000];
        int target = 600;
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
        int steps = 0;
        if (myarr.length == 0) {
            System.out.println("Array is empty");
            return -1;
        }
        for (int i = 0; i < myarr.length; i++) {
            steps++; // Increment steps for each iteration
            if (myarr[i] == target) {
                System.out.println("Number of steps: " + steps);
                return i;
            }
        }
        System.out.println("Number of steps: " + steps);
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
        int steps = 0;
        int start = 0;
        int end = myarr.length - 1;
        while (start <= end) {
            steps++; // Increment steps for each iteration
            int mid = (start + end) / 2;
            if (myarr[mid] < target) {
                start = mid + 1;
            } else if (myarr[mid] > target) {
                end = mid - 1;
            } else {
                System.out.println("Number of steps: " + steps);
                return mid;
            }
        }
        System.out.println("Number of steps: " + steps);
        return -1;
    }

}