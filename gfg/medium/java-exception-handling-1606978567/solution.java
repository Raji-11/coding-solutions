class Solution {
    public int findMin(int a, int b) {
        // code here
        int result = a + b;

                try {
                    if (a - b < result) {
                        result = a - b;
                    }

                    if (a * b < result) {
                        result = a * b;
                    }

                    int div = a / b;

                    if (div < result) {
                        result = div;
                    }
                } catch (ArithmeticException e) {
                    // Division by zero occurred
                }

                return result;
    }
}