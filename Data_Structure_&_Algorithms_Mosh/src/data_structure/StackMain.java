package data_structure;

public class  StackMain {
    public static void main(String[] args) {
        var stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        stack.pop();
        stack.pop();

        System.out.println(stack.peak());

        System.out.println(stack);
    }
}
