class MinStack {
    Stack<Long> st;
    long min;

    public MinStack() {
        st = new Stack<>();
        min = Long.MAX_VALUE;
    }

    public void push(int val) {
        if (st.isEmpty()) {
            st.push((long) val);
            min = val;
        } 
        else if (val >= min) {
            st.push((long) val);
        } 
        else {
            st.push(2L * val - min); // encoding
            min = val;
        }
    }

    public void pop() {
        if (st.peek() < min) {
            min = 2 * min - st.peek(); // decoding
        }
        st.pop();
    }

    public int top() {
        long a = st.peek();
        if (a < min) return (int) min;
        else return (int) a;
    }

    public int getMin() {
        return (int) min;
    }
}
/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */