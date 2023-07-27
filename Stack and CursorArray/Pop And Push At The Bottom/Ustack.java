import java.util.Stack;

public class Ustack<T> extends Stack<T> {
    Stack<T> stack1 = new Stack<>();
    private Stack<T> stack2 = new Stack<>();

    public void pushBottom(T data) {
        if (stack1.isEmpty())
            stack1.push(data);
        else {
            while (!stack1.isEmpty())
                stack2.push(stack1.pop());
            stack2.push(data);
            while (!stack2.isEmpty())
                stack1.push(stack2.pop());
        }
    }

    public T popBottom() {
        T data;
        if (stack1.isEmpty())
            return null;
        else {
            while (!stack1.isEmpty())
                stack2.push(stack1.pop());
            data = stack2.pop();
            while (!stack2.isEmpty())
                stack1.push(stack2.pop());
        }
        return data;
    }
}
