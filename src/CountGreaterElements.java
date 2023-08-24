public class CountGreaterElements {
    public static int countElementsWithGreater(int[] A) {
        int count = 0;

        for (int i = 0; i < A.length; i++) {
            boolean hasGreater = false;
            for (int j = 0; j < A.length; j++) {
                if (A[j] > A[i]) {
                    hasGreater = true;
                    break;
                }
            }
            if (hasGreater) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] A1 = {3, 1, 2};
        System.out.println("Output for A1: " + countElementsWithGreater(A1)); // Output: 2

        int[] A2 = {5, 5, 3};
        System.out.println("Output for A2: " + countElementsWithGreater(A2)); // Output: 1
    }
}
