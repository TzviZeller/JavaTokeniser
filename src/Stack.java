// Tzvi Zeller
// 12/10
//stack for storige
public class Stack {
    private String[] elements;
    private int top;

    public Stack() {
        elements = new String[10];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull()  {
        return top == 9;
    }

    public void push(String item) {
        if (top == 9)
            System.out.println("* STACK FULL- CANNOT PUSH *");
        else
        {
            top = top + 1;
            elements[top] = item;
        }
    }

    public String pop() {
        if (top == -1){
            System.out.println("* STACK EMPTY - CANNOT POP *");
            return null;
        }
        else
        {
            String top_item = elements[top];
            top = top - 1;

            return top_item;
        }
    }
        
}