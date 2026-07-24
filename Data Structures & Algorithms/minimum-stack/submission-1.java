
class MinStack { 
    private Stack<Integer> st = new Stack<>(); 
    private Stack<Integer> minSt = new Stack<>(); 

    public MinStack() { } 

    public void push(int val) { 
        st.push(val); 
        // Corrected .top() to .peek()
        if (minSt.isEmpty() || val <= minSt.peek()) { 
            minSt.push(val); 
        } 
    } 

    public void pop() { 
        if (st.isEmpty()) { 
            return; 
        } 
        // Fixed logical bug: only pop minSt if the values match
        if (st.peek().equals(minSt.peek())) { 
            minSt.pop(); 
        }
        st.pop(); 
    } 

    public int top() { 
        if (st.isEmpty()) { 
            return -1; 
        } 
        // Corrected .top() to .peek()
        return st.peek(); 
    } 

    public int getMin() { 
        if (minSt.isEmpty()) { 
            return -1; 
        } 
        // Corrected .top() to .peek()
        return minSt.peek(); 
    } 
}
