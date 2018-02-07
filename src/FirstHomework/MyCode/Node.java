package FirstHomework.MyCode;

import java.util.*;

public class Node {
    private Character name;
    private Node parent;
    private HashMap<Node,Integer> children = new HashMap<Node,Integer>();

    public  Node() { //create root node
    }

    public Node(Character symbol, Node setParent){
        this.name = symbol;
        this.parent = setParent;
    }


    public void addChild(Node child) {
    if (children.get(child) == null) children.put(child,1);
    else {
        Integer x = children.get(child) + 1;
        children.put(child,x);
    }
    }

    public Node getChild(Character e){
        for (Node i: children.keySet()) {
            if (i.name == e) return i;
        }
        //else
        return null;
    }

    public Character getName() {
        return name;
    }

    public HashSet<Node> getChildren(){
        HashSet<Node> allChars = new HashSet<Node>();
        for (Node e : children.keySet()) {
            allChars.add(e);
        }
        return allChars;
    }

}
