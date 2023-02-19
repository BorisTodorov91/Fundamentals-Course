package vector;

import com.sun.source.tree.BinaryTree;
import org.w3c.dom.Node;

import java.util.Scanner;
import java.util.Vector;

public class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Vector<String> stringVector = new Vector<>();

        stringVector.add("Boris ");

        for (String s : stringVector) {
            System.out.printf(s);
        }

    }
}
