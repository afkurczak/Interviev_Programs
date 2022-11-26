package MyStack;

 class StackElement {
    StackElement prevElement;
    String dataElement;

    StackElement(StackElement prevElement, String dataElement) {
        this.prevElement = prevElement;
        this.dataElement = dataElement;
    }

    StackElement getPrevElement() {
        return prevElement;
    }

    String getDataElement() {
        return dataElement;
    }
}
