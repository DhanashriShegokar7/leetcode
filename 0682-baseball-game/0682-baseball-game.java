class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < operations.length; i++) {
            String el = operations[i];
            if(el.equals("C")) {
                st.pop();
            } else if(el.equals("D")) {
                int x = st.peek();
                st.push(2*x);
            } else if(el.equals("+")) {
                int a = st.pop();
                int b = st.peek();

                st.push(a);
                st.push(a+b);
            } else {
                st.push(Integer.parseInt(el));
            }

        }
        int sum = 0;
        while(!st.isEmpty()) {
            sum += st.pop();
        }
        return sum;
    }
}