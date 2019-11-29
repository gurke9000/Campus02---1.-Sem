public class Stack {

    private int [] elements;
    private int counter;

    public Stack(int [] elements)
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
    public int pop()
    {
        if (counter >= 0) {
            int erg = elements[counter];
            counter -= counter;
            return erg;
        }
        return -1;
    }

    public void push(int value)
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


