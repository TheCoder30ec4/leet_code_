class Solution {
    public boolean isValid(String s) {

       Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);

            if (currentChar == '(' || currentChar == '[' || currentChar == '{') {
                st.push(currentChar);
            } else {
                if (st.isEmpty()) {
                    return false;
                }

                char ch = st.peek();
                st.pop();
                if ((currentChar == ')' && ch == '(') || (currentChar == ']' && ch == '[') || (currentChar == '}' && ch == '{')) {
                    continue;
                } else {
                    return false;
                }
            }
        }

        return st.isEmpty();
                    
    }
}