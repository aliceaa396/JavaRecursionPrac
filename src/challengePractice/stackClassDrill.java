package challengePractice;

 class Stack {
    //Stack challenge, Implement the Stack data structure
    //structure works on first in last out, last thing put in is the last thing removed,
    // first thing put in stack is the last thing removed
    //API's: Push(), Pop(), Peek()

    private int array[];
    private int top;
    private int capacity;

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull(){
        return top == capacity - 1;
    }

    Stack (int capacity) {
        this.array = new int [capacity];
        this.capacity = capacity;
        this.top = -1;
    }

    public void push(int item){
        if(isFull()){
            throw new RuntimeException("Stack is full");
        }
        array[++top]=item;
    }

    public int pop(){
        if(isEmpty()){
            throw new RuntimeException("Stack is full");
        }
        return array[top--];
    }
    public int peek(){
        if (isEmpty()){
            throw new RuntimeException("Stack is Full");
        }
        return array[top];
    }
}
