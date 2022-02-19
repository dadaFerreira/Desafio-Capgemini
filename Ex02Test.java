import com.ifood.iFood.adapter.Ex02;
import junit.framework.TestCase;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Ex02Test extends TestCase {

    @Test
    @DisplayName("Testa senha válida")
    public void testaSenhaValida(){
        assertTrue(Ex02.senhaValida("And12@"));
    }

    @Test
    @DisplayName("Testa senha válida com outro caractere especial.")
    public void testaSenhaValidaOutroCaractere(){
        assertTrue(Ex02.senhaValida("And!12"));
    }

    @Test
    @DisplayName("Testa senha vazia.")
    public void testaSenhaVazia(){
        assertFalse(Ex02.senhaValida(""));
    }

    @Test
    @DisplayName("Testa senha só de números.")
    public void testaSenhaNumeros(){
        assertFalse(Ex02.senhaValida("123456"));
    }

    @Test
    @DisplayName("Testa senha sem dígito.")
    public void testaSenhaSemDigito(){
        assertFalse(Ex02.senhaValida("Ander@"));
    }

    @Test
    @DisplayName("Testa senha sem letra maiúscula.")
    public void testaSenhaSemMaiuscula(){
        assertFalse(Ex02.senhaValida("and12@"));
    }

    @Test
    @DisplayName("Testa senha sem letra minúscula.")
    public void testaSenhaSemMinuscula(){
        assertFalse(Ex02.senhaValida("AND12@"));
    }

    @Test
    @DisplayName("Testa senha com mínimo de 6 caracteres.")
    public void testaSenhaMinimoCaracteres(){
        assertFalse(Ex02.senhaValida("AN12@"));
    }

    @Test
    @DisplayName("Testa número de caracteres faltantes com mínimo de 6.")
    public void testaMinimoCaracteres(){
        assertEquals(1, Ex02.numeroMinimo("AN12@"));
        assertEquals(3, Ex02.numeroMinimo("A2@"));
        assertEquals(4, Ex02.numeroMinimo("A2"));
        assertEquals(5, Ex02.numeroMinimo("A"));

    }



}



