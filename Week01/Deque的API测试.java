import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class test {
    public static void main(String[] args) {
        Deque<String> sayHi = new LinkedList<>();
        sayHi.addFirst("Hello");
        sayHi.addFirst("World");
        sayHi.addLast("Hi");
        sayHi.addLast("Ethan");
        for (String s : sayHi) {
            System.out.println(s);

        }
    }
}

