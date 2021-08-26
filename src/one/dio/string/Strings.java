package one.dio.string;

public class Strings {

    public static void main(String[] args) {

        var nome = "Junior";
        var sobreNome = "Luz";
        final var nomeCompleto= nome + sobreNome;

        /*maneiras de mostrar na tela*/
        System.out.print(nome + " ");
        System.out.println(sobreNome);

        System.out.println(nome + sobreNome);

        final var mensagem= String.format("Meu primeiro nome é %s e o segundo é %s.",  nome , sobreNome);
        System.out.println(mensagem);

    }

}
