package MyStack;

public class StackElement {
    public StackElement prevElement;
    public String dataElement;

    public StackElement(StackElement prevElement, String dataElement) {
        this.prevElement = prevElement;
        this.dataElement = dataElement;
    }

    public StackElement getPrevElement() {
        return prevElement;
    }

    public String getDataElement() {
        return dataElement;
    }
}
