package Arrays;

public class FindPeakElementGreaterThanItsNeighbours {

    /**Given an array arr of n elements that is first strictly increasing and then maybe strictly decreasing,
     *  find the maximum element in the array.
     *  */

    /**
     * Input: array[]= {5, 10, 20, 15}
     * Output: 20
     * Explanation: The element 20 has neighbors 10 and 15, both of them are less than 20.
     */

    public static void main(String[] args) {
//        int arr[] = {2, 3, 2, 1, 6, 7, 5, 9};
        int arr[] = {9,8,6,7,4,6,3,2,6,2,8,5};

        getPeakElement(arr);

    }

    public static int getPeakElement(int[] arr) {

        int peak = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if ((arr[i + 1] > arr[i] && arr[i] < arr[i + 1]) && arr[i + 1] != arr[arr.length - 1]) {
                System.out.println(arr[i + 1]);
                peak = arr[i + 1];
            }
        }
        return peak;
    }

}