package MyStack;

 class MyStack {

    StackElement topElement;

    MyStack() {
        topElement = null;
    }

    void push(String newData) {
        StackElement stackTemp = new StackElement(topElement, newData);
        topElement = stackTemp;
    }


    void pop() {
        if (topElement != null) {
            topElement = topElement.getPrevElement();
        } else {
            System.out.println("Stack is Empty");
        }
    }

    String peek() {
        if (topElement != null) {
            return (topElement.getDataElement().toString());
        } else {
            return ("Stack is Empty");
        }
    }

    void allStack(){
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
