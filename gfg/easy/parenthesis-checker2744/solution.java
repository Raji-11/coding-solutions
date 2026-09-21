class Solution {
    public boolean isBalanced(String s) {
        // code here
        Stack <Character> st = new Stack<>();
        char[] str = s.toCharArray();
        for(int i=0;i<str.length;i++)
        {
            char ch = str[i];
            if(ch == '('||ch=='{'||ch=='[')
            {
              st.push(ch);
            }
            else if(ch==')'||ch=='}'||ch==']')
            {
            if(st.isEmpty())
            {
                return false;
            }
            char top = st.pop();
            if((ch==')'&&top!='(')||(ch=='}'&&top!='{')||(ch==']'&&top!='['))
            {
                return false;
            }
            }
        }
        return st.isEmpty();
    }
}
