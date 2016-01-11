package homework_02;

import java.util.Stack;

public class StackTest {

    public static void main(String[] args) {

        System.out.println("Create Integer stack:");
        Stack<Integer> myStack = new Stack<>();
        Stack<String> myStackString = new Stack<>();

        Integer i1 = 1, i2 = 2, i3 = 3, i4 = 4;

        myStack.push(i1);
        myStack.push(i2);
        myStack.push(i3);
        myStack.push(i4);

        for (int i = 0; i < 4; i++) {
//            myStack.pop() вытаскивает из вершины стека элемент и удаляет его
            System.out.println(myStack.pop());
        }

        System.out.println("Create string stack:");

        /*
        *
        * Изначальный размер стека равен 10 елементам
        * При превыешнии стек увеличиватся еще на 10 элементов
        *
        */

        System.out.println("Capacity empty stack: " + myStackString.capacity());
        String string;
        System.out.println("Push into stack 12 string element");
        for (int i = 0; i < 12; i++) {
            string = "element_" + i;
            myStackString.push(string);
        }
        System.out.println("Capacity with 12 element: " + myStackString.capacity());
        for (int i = 0; i < 6; i++) {
            myStackString.pop();
        }

        /*
        * После удаления 6 елементов емкость остается максимально
        * */
        System.out.println("After remove 6 element: " + myStackString.capacity());

        /*
        * Так же мы можем вернуть верхний элемент стека не смещая очередь
        * */
        System.out.println("Top element: " + myStackString.peek());

        /*
        * А еще можем найти позицию элемента в стеке
        * */
        System.out.println("Search element_3 position: " + myStackString.search("element_3"));

        /*
        * Посмотрим содержимое стека
        * */
        System.out.println("Show stack: " + myStackString);

        /*
        * И опустошим стек
        * */
        System.out.println("Pull out stack");

        while (true){
            System.out.println(myStackString.pop());
            if (myStackString.empty()) break;
        }

        System.out.println("My stack is empty.");

    }
}
