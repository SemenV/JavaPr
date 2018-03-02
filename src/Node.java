

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
    if (!getChildren().containsKey(child.getName())) {
        children.put(child,1);
    }
    else {
        Integer x = children.get(getChildren().get(child.name)) + 1;
        children.put(getChildren().get(child.name),x);
    }
    }

    public void removeChild(Character child) {
        Integer x = children.get(getChildren().get(child)) - 1;
        if (x == 0) children.remove(getChildren().get(child));
        else children.put(getChildren().get(child),x);
    }

    public Node getChild(Character e){
        return getChildren().get(e);
    }

    public int getChildCount(Character e) {
        for (Node k : children.keySet()) {
            if (k.name == e) return children.get(k);
        }
        return 0;
    }

    public Character getName() {
        return name;
    }

    public Node getParent() {
        return parent;
    }

    public HashMap<Character, Node> getChildren(){
        HashMap<Character,Node> allChars = new HashMap<Character,Node>();
        for (Node e : children.keySet()) {
            allChars.put(e.getName(),e);
        }
        return allChars;
    }

    public int getCountEnds() {
        int count = 0;
        for (Node e: children.keySet()) {
            count += children.get(e);
        }
        return count;
    }


}
