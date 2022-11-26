package MyStack;

public class MyStack {

    public  StackElement topElement;

    public  MyStack() {
        topElement = null;
    }

    public  void push(String newData) {
        StackElement stackTemp = new StackElement(topElement, newData);
        topElement = stackTemp;
    }

    public void pop() {
        if (topElement != null) {
            topElement = topElement.getPrevElement();
        } else {
            System.out.println("Stack is Empty");
        }
    }

    public void peek() {
        if (topElement != null) {
            System.out.println(topElement.getDataElement());
        } else {
            System.out.println("Stack is Empty");
        }
    }

    public void allStack(){
        if (topElement != null) {
            StackElement stackTemp = topElement;
            while (stackTemp != null) {
                System.out.println(stackTemp.getDataElement() + " ");
                stackTemp = stackTemp.getPrevElement();
            }
        } else {
            System.out.println("Stack is Empty");
        }
    }
}
