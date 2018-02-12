package FirstHomework.Tests;

import FirstHomework.Tree.MyTree;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class TreeTest {

    @Test
    public void TestTreeGetAllString() {
        MyTree d = new MyTree();
        d.setAllString("q", "qwer", "qweg", "qw", "qwaaccc");
        d.removeString("qwaaccc");

        ArrayList<String> end = new ArrayList<String>();
        end.add("qwer");
        end.add("qweg");
        end.add("qw");

        if (end.size() != d.getString("qw").size()) Assert.fail();
        for (String r : end) {
            if (!d.getString("qw").contains(r)) {
                Assert.fail();
            }
        }
    }

    @Test
    public void TestTreeIsPresent() {
        MyTree d = new MyTree();
        d.setAllString("qw", "qwaaccc");
        if (!d.isPresent("qw")) Assert.fail();
    }
    @Test
    public void TestTreeRemoveString() {
        MyTree d = new MyTree();
        d.setAllString("qw", "qwaaccc");
        d.removeString("qwaaccc");
        if (d.isPresent("qwaaccc")) Assert.fail();
    }
}
