

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TreeTest {

    @Test
    public void TestTreeGetAllString() {
        MyTree d = new MyTree();
        d.setAllString("q", "qwer", "qweg","qwegg", "qw", "qwaaccc");
        d.removeString("qwaaccc");

        Set<String> end = new HashSet<>(Arrays.asList("qwer", "qweg","qwegg", "qw"));
        Assert.assertEquals(end, d.getString("qw"));
    }

    @Test
    public void TestTreeIsPresent() {
        MyTree d = new MyTree();
        d.setAllString("qw", "qwaaccc");
        Assert.assertTrue( d.isPresent("qw"));
    }

    @Test
    public void TestTreeRemoveString() {
        MyTree d = new MyTree();
        d.setAllString("qw", "qwaaccc");
        d.removeString("qwaaccc");
        Assert.assertFalse(d.isPresent("qwaaccc"));
    }
}
