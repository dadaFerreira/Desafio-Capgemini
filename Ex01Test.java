import Ex01;
import junit.framework.TestCase;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class Ex01Test extends TestCase {

    @Test
    @DisplayName("Testa se árvore vem com conteúdo.")
    public void testaArvore(){

        String arvore = Ex01.montaArvore(6);
        assertNotNull(arvore);

    }

    @Test
    @DisplayName("Testa se árvore vem preenchida corretamente.")
    public void testaConteudoArvore(){

        String arvore = Ex01.montaArvore(6);

        String outraArvore = "     *\n" +
                             "    **\n" +
                             "   ***\n" +
                             "  ****\n" +
                             " *****\n" +
                             "******\n";

        assertEquals(arvore, outraArvore);

    }









}
