package one.dio.classes.usuario;

public class ProgramaDoSuperUsuario {

    public static void main(String[] args) {
        final var superUsuario = new SuperUsuario( login: "root", senha: "1234@#$");

        superUsuario.getLogin();

        superUsuario.getSenha();

    }

}