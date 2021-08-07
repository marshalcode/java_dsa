package data_structures.stack;

// TIME COMPLEXITY
/* 
    initialize : O(1)
    push : O(1)
    pop : O(1)
    size: O(1)
    printStack: O(n) where n is number of elements present in stack
*/

/* 
    Push: Add an element to the top of a stack
    Pop: Remove an element from the top of a stack
    IsEmpty: Check if the stack is empty
    IsFull: Check if the stack is full
    Peek: Get the value of the top element without removing it
*/

/* 
    Algo :-
    - A pointer called TOP is used to keep track of the top element in the stack.
    - When initializing the stack, we set its value to -1 so that we can check if the stack is empty by comparing TOP == -1.
    - On pushing an element, we increase the value of TOP and place the new element in the position pointed to by TOP.
    - On popping an element, we return the element pointed to by TOP and reduce its value.
    - Before pushing, we check if the stack is already full
    - Before popping, we check if the stack is already empty
*/

public class Stack {
    private int top;
    private int arr[];
    private int capacity;
    
    Stack(int size){
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    public void Push(int x){
        if (isFull()) {
            System.out.println("OverFlow\nProgram Terminated\n");
            System.exit(1);
        }
      
        System.out.println("Inserting " + x);
        arr[++top] = x;
    }

    public int pop() {
        if (isEmpty()) {
          System.out.println("STACK EMPTY");
          System.exit(1);
        }
        return arr[top--];
    }

    public int size() {
        return top + 1;
    }

    public Boolean isEmpty() {
        return top == -1;
    }

    public Boolean isFull() {
        return top == capacity - 1;
    }

    public void printStack() {
        for (int i = 0; i <= top; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5);
    
        stack.Push(1);
        stack.Push(2);
        stack.Push(3);
        stack.Push(4);
    
        stack.pop();
        System.out.println("\nAfter popping out");
    
        stack.printStack();
    
    }
}
