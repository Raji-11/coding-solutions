class Solution {
    static ArrayList<Integer> leaders(int arr[]) {

        ArrayList<Integer> al = new ArrayList<>();

        int max = arr[arr.length - 1];
        al.add(max);  // rightmost is always a leader

        for (int i = arr.length - 2; i >= 0; i--) {

            if (arr[i] >= max) {
                al.add(arr[i]);
                max = arr[i];
            }
        }

        Collections.reverse(al);

        return al;
    }
}