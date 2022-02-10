package lab04;

public class TestStackOfIntegers {
    public static void main(String[] args) {
        StackOfIntegers stack = new StackOfIntegers();
        
        for (int i = 0; i < 10; i++) {
            stack.push(i);
        }
        // System.out.println(stack.peek());
        // System.out.println(stack.getSize());
        while (!stack.empty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}
