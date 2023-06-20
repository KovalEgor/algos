public class StackArray {
    //isEmpty(), push(), pop(), peek()
    //int size, int{} array, int top

    private int size;
    private int[] array;
    private int top;

    public StackArray(int s) {
        size = s;
        array = new int[size];
        top = -1;
    }

    public boolean isEmpty(){
        return (top == -1);
    }

    public void push (int a) {
        int i = ++top;
        array[i] = a;
        System.out.println("Top is " + top);
    }

    public int pop(){
        if (isEmpty()){
            System.out.println("Stack is empty");
            return 0;
        }
        else{
            System.out.println("Top is " + top);
            return array[top--];
        }

    }

    public int pick(){
        if (isEmpty()){
            System.out.println("Stack is empty");
            return 0;
        }
        else{
            System.out.println("Top is " + top);
            return array[top];
        }
    }

    public static void main (String[] args) {
        StackArray stack = new StackArray(5);
        System.out.println(stack.top);
        stack.push(3);
        stack.push(1);
        stack.push(8);

        System.out.println(stack.pick()); //смотрим на первый компонент
        System.out.println(stack.pop()); //смотрим и убираем первый компонент
        System.out.println(stack.pick()); //смотрим на новый первый компонент


        stack.pop();
        stack.pop();
        //stack.pop(); //можно убрать, чтобы убедиться в пустом стеке
    }

}