

import java.util.*;

public class Node {
    private Character name;
    private Node parent;
    private boolean end = false;
    private Integer count = 0;
    private HashMap<Character,Node> children = new HashMap<Character,Node>();


    public  Node() { //create root node
    }

    public Node(Character symbol, Node setParent, boolean end){
        this.name = symbol;
        this.parent = setParent;
        this.end = end;
    }

    public void addChild(Node child) {
    if (!children.containsKey(child.name)) children.put(child.name,child);
    this.count++;
    }

    public boolean removeChild(Character child) {
        this.count--;
        return count == 0;
    }
    public void deleteChild(Character child) {
        children.remove(child);
    }

    public Node getChild(Character e) {
        return children.get(e);
    }

    public Character getName() {
        return name;
    }

    public Node getParent() {
        return parent;
    }

    public boolean isEnd() {
        return end;
    }
    public Collection<Node> getNodeChildren() {
        return children.values();
    }


}
