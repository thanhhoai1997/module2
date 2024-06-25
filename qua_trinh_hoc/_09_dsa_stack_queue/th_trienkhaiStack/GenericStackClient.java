package _09_dsa_stack_queue.th_trienkhaiStack;

public class GenericStackClient {
    public static void stackOfiStrings(){
        MyGenericStack<String> stack = new MyGenericStack<>();
        stack.push("five");
        stack.push("four");
        stack.push("three");
        stack.push("tow");
        stack.push("one");
        System.out.println("do dai" + stack.size());
        System.out.print("lay gia tri cua stack");
        while (!stack.isEmty()){
            System.out.print(" " + stack.pop());
        }
        System.out.println("do dai sau khi lay ra " + stack.size());

    }
    public static void stackOfIntegers(){
        MyGenericStack<Integer> stack = new MyGenericStack<>();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        System.out.println("do dai cua stack : " + stack.size());
        System.out.println("lay cac phan tu cua stack");
        while (!stack.isEmty()){
            System.out.print(  " " + stack.pop());
        }
        System.out.println("do dai sau khi lay " + stack.size());
    }

    public static void main(String[] args) {
        System.out.println("1. stack String");
        stackOfiStrings();
        System.out.println("2. stack Interge");
        stackOfIntegers();
    }
}
