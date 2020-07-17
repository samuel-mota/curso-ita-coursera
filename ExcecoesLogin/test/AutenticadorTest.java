import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AutenticadorTest {
    @Test
    public void loginComSucesso() throws LoginException {
        Autenticador a = new Autenticador();
        Usuario u = a.logar("guerra", "senhadoguerra");
        Assertions.assertEquals("guerra", u.getLogin());
    }

    @Test
    public void loginFalho() throws LoginException {
        Assertions.assertThrows(LoginException.class, () -> {
            Autenticador a = new Autenticador();
            Usuario u = a.logar("guerra", "senhadoguerraaaaaaa");
        });
    }

    @Test
    public void informacaoDoErro() {
        Autenticador a = new Autenticador();
        try {
            Usuario u = a.logar("guerra", "senhadoguerraaaaaaa");
            Assertions.fail();
        } catch (LoginException e) {
            Assertions.assertEquals("guerra", e.getLogin());
        }
    }
}