import edu.kirkwood.demos.IfElse;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



public class IfElseTest {

    @Test
    public void getGrade() {
        IfElse ifElse = new IfElse(); // Assuming IfElse is your class that contains the getGrade method.

        Assertions.assertEquals("A", ifElse.getGrade(90));
        Assertions.assertEquals("B", ifElse.getGrade(89));
        Assertions.assertEquals("B", ifElse.getGrade(80));
        Assertions.assertEquals("C", ifElse.getGrade(79));
        Assertions.assertEquals("C", ifElse.getGrade(70));
        Assertions.assertEquals("D", ifElse.getGrade(69));
        Assertions.assertEquals("D", ifElse.getGrade(60));
        Assertions.assertEquals("F", ifElse.getGrade(59));
    }
}

