public class TesteJavaBean {

    public static void main(String[] args) {

        PessoaBean pessoa = new PessoaBean();
        pessoa.setNome("Maria Francisca Silva");
        pessoa.setIdade(35);

        System.out.println(pessoa.getNome() + ", tem " + pessoa.getIdade() + " anos.");


    }
}
