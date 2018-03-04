
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class MyTree {
    private Node root = new Node(); //Node with empty data

    public void setAllString(String... e){
        for (String element: e) {
            setString(element);
        }
    }

    public void setString(String str) {
        Node e = root;
        for (int i = 0; i < str.length() - 1; i++) {
            Character iSymbol = str.charAt(i);
            Node x = new Node(iSymbol,e,false);
            e.addChild(x);
            e = e.getChild(iSymbol);
        }
        e.addChild(new Node(str.charAt(str.length() - 1),e,true));
    }

    public Node getLastNode(String str) {
        Node e = root;
        for (int i = 0; i < str.length(); i++) {
            Character iSymbol = str.charAt(i);
            e = e.getChild(iSymbol);
        }
        return e;
    }

    public void removeString(String str) {
        Node e = getLastNode(str);
        while (e.getParent() != null) {
            Character symbol = e.getName();
            boolean x = e.removeChild(symbol);
            e = e.getParent();
            if (x) e.deleteChild(symbol);
        }
        e.removeChild(str.charAt(str.length() - 1));
    }

    public ArrayList<Node> getEndsNodes(String str) {
        Node e = getLastNode(str);
        ArrayList<Node> ends = new ArrayList<Node>();

        ArrayList<Node> unused = new ArrayList<Node>();
        unused.add(e);
        while (!unused.isEmpty()) {
            for (int i = 0; i < unused.size(); i++) {
                Node k = unused.get(i);
                if (k.isEnd()) {
                    ends.add(k);
                }
                unused.addAll(k.getNodeChildren());
                unused.remove(k);
            }
        }
        return ends;
    }

    public Set<String> getString(String line) {
        ArrayList<Node> nodeList = this.getEndsNodes(line);
        Set<String> end = new HashSet<>();
        for (int i = 0; i < nodeList.size(); i++) {
            Node element = nodeList.get(i);
            StringBuilder str = new StringBuilder();
            while (element.getParent() != null) {
                str.append(element.getName());
                element = element.getParent();
            }
            end.add(str.reverse().toString());
        }
        return end;
    }

    public boolean isPresent(String str) {
        try {
            Node e = getLastNode(str);
            e.getParent();
        } catch (Exception e) {
            return false;
        }
        return getLastNode(str).isEnd();
    }
}