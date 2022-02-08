package lab04;

public class StackOfIntegers {
    private int[] elements;
    private int size;

    public StackOfIntegers() {
        this.elements = new int[16];
        this.size = -1;
    }

    public StackOfIntegers(int capacity) {
        this.elements = new int[capacity];
    }

    public boolean empty() {
        boolean isEmpty = false;
        if (size == -1) {
            isEmpty = true;
        }
        return isEmpty;
    }

    public int peek() {
        return this.elements[size];
    }

    public void push(int value) {
        if (this.getSize() != size) {
            System.out.println("Inserting " + value + " into stack.");
            this.elements[++size] = value;
        }
    }

    public int pop() {
        int res = 0;
        if (!this.empty()) {
            res = this.elements[size--];
        }
        return res;
    }

    public int getSize() {
        return size + 1;
    }
}
