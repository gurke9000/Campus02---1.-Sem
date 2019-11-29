public class StackDemo {

    public static void main(String[] args) {

        String[] arr = new String[10];
        StackGen<String> stack = new StackGen<>(arr);

        stack.push("lol");
        stack.push("haha");
        stack.push("mhmmm");

        stack.pop();

        System.out.println(stack.pop());

    }
/*
        int [] arr = new int [10];
        Stack stack = new Stack[arr];

        stack.push(3);
        stack.push(7);

        stack.pop();
    }

 */

}
