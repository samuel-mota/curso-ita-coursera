public class LoginException extends Exception {

    private String login;

    public LoginException(String message, String login) {
        super(message);
    }

    public String getLogin() {
        return login;
    }
}
