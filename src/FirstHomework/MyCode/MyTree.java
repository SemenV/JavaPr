package FirstHomework.MyCode;

import java.util.ArrayList;
import java.util.HashSet;

public class MyTree {
    private Node root = new Node(); //Node with empty data

    public void setString(String str) {
        Node e = root;
        for (int i = 0; i < str.length(); i++) {
            Character iSymbol = str.charAt(i);
            Node x = new Node(iSymbol,e);
            e.addChild(x);
            e = e.getChild(iSymbol);
        }
    }

    // 4 serch
    public Node getLastNode(String str) {
        Node e = root;
        for (int i = 0; i < str.length(); i++) {
            Character iSymbol = str.charAt(i);
            e = e.getChild(iSymbol);
        }
        return e;
    }

    //get all tree ends
    //remove option


}