
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SolutionTest {

    private Solution solution;

    @Before
    public void setUp() {
        this.solution = new Solution();
    }

    @Test
    public void getUniqueCharTest() {
        String text = """
                The Tao gave birth to machine language.  Machine language gave birth
                to the assembler.
                The assembler gave birth to the compiler.  Now there are ten thousand
                languages.
                Each language has its purpose, however humble.  Each language
                expresses the Yin and Yang of software.  Each language has its place within
                the Tao.
                But do not program in COBOL if you can avoid it.
                        -- Geoffrey James, "The Tao of Programming"
                """;
        String result = solution.getUniqueChar(text);
        Assert.assertEquals("m", result);
    }

    @Test
    public void getUniqueCharWithSymbolsTest() {
        String text = """
                C makes it easy for yo\nu to shoot\n yourself in the foot. 
                C++ make,,,s tha>>t harder, but when you... do, it b!lows!! away your whole leg. 
                (с) Bjarne Stroustrup * /
                       """;
        String result = solution.getUniqueChar(text);
        Assert.assertEquals("e", result);
    }

//    @Test
//    public void getUniqueCharWithoutUniqueTest() {
//        String text = "adadfgfg";
//        String result = solution.getUniqueChar(text);
//        Assert.assertEquals("No unique chars!", result);
//    }

    @Test
    public void getUniqueCharEmptyTest() {
        String text = "";
        String result = solution.getUniqueChar(text);
        Assert.assertEquals("Object is Empty!", result);
    }

    @Test
    public void getUniqueCharNullTest() {
        String text = null;
        String result = solution.getUniqueChar(text);
        Assert.assertEquals("Object is Empty!", result);
    }
}
