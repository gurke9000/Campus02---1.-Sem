public class StackGen<T> {

    private T [] elements;
    private int counter;

    public StackGen(T [] elements)
    {
        this.elements = elements;
        counter = -1;
    }
    /*
        public int[] getElements() {
            return elements;
        }

        public void setElements(int[] elements) {
            this.elements = elements;
        }
    */
    public T pop()
    {
        if (counter >= 0) {
            T erg = elements[counter];
            counter -= counter;
            return erg;
        }
        return null;
    }

    public void push(T value)
    {
        if(counter < elements.length) {
            counter++;
            elements[counter] = value;
        }
    }
/*
    public void print(int value)
    {
        System.out.println(elements[value]);
    }

 */
}


