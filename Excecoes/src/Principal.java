public class Principal {
    public static void main(String[] args) throws Exception {
        a(100);
    }

    public static void a(int i) throws Exception {
        System.out.println("executando a() com " + i);
        try {
            b(i);
        } catch (Exception e) {
        System.out.println("tratando a excecao: " + e.getMessage());
        }
    }

    public static void b(int i) throws Exception {
        System.out.println("executando b() com " + i);
        if (i > 0)
            throw new Exception("mensagem");
        System.out.println("terminando execucao de b() ");
    }
}
