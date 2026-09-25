import java.util.*;

class Codechef {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            String s = sc.next();

            Stack<Character> st = new Stack<>();
            boolean valid = true;

            for (int i = 0; i < s.length(); i++) {

                char ch = s.charAt(i);

                if (ch == '(') {
                    st.push(ch);
                } 
                else {

                    if (st.isEmpty()) {
                        valid = false;
                        break;
                    }

                    st.pop();
                }
            }

            if (!st.isEmpty()) {
                valid = false;
            }

            System.out.println(valid ? 1 : 0);
        }
    }
}