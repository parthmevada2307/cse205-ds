class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i<operations.length;i++) {
            if (operations[i].equals("C")) {
                stack.pop();
            }
            else if (operations[i].equals("D")) {
                stack.push(2*stack.peek());
            }
            else if (operations[i].equals("+")) {
                int A = stack.pop();
                int B = stack.pop();
                int C = A + B;
                stack.push(B);
                stack.push(A);
                stack.push(C);
            }
            else {
                stack.push(Integer.parseInt(operations[i]));
            }
        }
        int sum = 0;
        while(!stack.isEmpty()) {
            sum = sum + stack.pop();
        } 
        return sum;
    }
}