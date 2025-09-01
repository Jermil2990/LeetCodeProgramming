public class CommonProblems {
    public static void main(String[] args) {
        System.out.println("Hello World");
        int[] array = { 1, 4, 2, 2, 4, 6, 1 };
        System.out.println(removeElement(array, 4));
    }

    // Two Pointers
    // Used with Arrays and LinkedList
    // Converging Pointers is when two pointers come to meet one another

    // Parellel Pointers this is used with sliding window technique - used to find
    // sub-arrays and substrings "ab-scs-ds"

    public static int removeElement(int[] nums, int val) {
        // Given array remove the occurenes of val
        // Return number of elements in nums

        // Two pointers

        int i = 0; // slow pointer
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i; // new length
    }

}