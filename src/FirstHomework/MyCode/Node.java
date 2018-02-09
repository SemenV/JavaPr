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
    if (!this.getChildren().keySet().contains(child.getName())) {
        children.put(child,1);
    }
    else {
        Integer x = children.get(this.getChildren().get(child.name)) + 1;
        children.put(this.getChildren().get(child.name),x);
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


    public HashMap<Character, Node> getChildren(){
        HashMap<Character,Node> allChars = new HashMap<Character,Node>();
        for (Node e : children.keySet()) {
            allChars.put(e.getName(),e);
        }
        return allChars;
    }


}
