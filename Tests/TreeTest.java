

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TreeTest {

    @Test
    public void TestTreeGetAllString() {
        MyTree d = new MyTree();
        d.setAllString("asdf","asff","aaaa","askdr","assssssss");
        d.removeString("assssssss");
        d.removeString("asff");
        Set<String> end = new HashSet<>(Arrays.asList("asdf", "askdr"));
        Assert.assertEquals(end, d.getString("as"));
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
