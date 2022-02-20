import junit.framework.TestCase;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class Ex03Test extends TestCase {

    @Test
    @DisplayName("Testa Anagrama.")
    public void testaAnagrama(){
        int result = Ex03.imprimeAnagrama("ifailuhkqq");
        assertEquals(3,result );
    }










}
