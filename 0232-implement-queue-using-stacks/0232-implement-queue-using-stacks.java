class CustomStack {
    private List<Integer> stackList;

    public CustomStack() {
        stackList = new ArrayList<>();
    }

    public boolean isEmpty() {
        return stackList.isEmpty();
    }

    public int top() {
        if (isEmpty()) {
            return -1; // Assuming -1 indicates an empty stack
        }
        return stackList.get(stackList.size() - 1);
    }

    public int size() {
        return stackList.size();
    }

    public void push(int value) {
        stackList.add(value);
    }

    public int pop() {
        if (isEmpty()) {
            return -1; // Assuming -1 indicates an empty stack
        }
        int topValue = stackList.get(stackList.size() - 1);
        stackList.remove(stackList.size() - 1);
        return topValue;
    }
}

class MyQueue {
    private CustomStack stack1;
    private CustomStack stack2;

    public MyQueue() {
        stack1 = new CustomStack();
        stack2 = new CustomStack();
    }

    public void push(int x) {
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        stack1.push(x);
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
    }

    public int pop() {
        return stack1.pop();
    }

    public int peek() {
        return stack1.top();
    }

    public boolean empty() {
        return stack1.isEmpty();
    }
}

