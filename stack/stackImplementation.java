import java.io.*;
import java.util.*;

public class stackImplementation {
    public static void main(String[] args) {

        Stack<Integer> obj = new Stack<Integer>();
        obj.push(10);
        obj.push(20);
        obj.push(30);
        int eleement = obj.pop();
        System.out.println(eleement);
    }
}