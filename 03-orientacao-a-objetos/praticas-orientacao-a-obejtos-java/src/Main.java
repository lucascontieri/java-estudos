import br.com.lucascontieri.exercicioAlura160625.model.Aluno;
import br.com.lucascontieri.exercicioAlura160625.model.IdadePessoa;
import br.com.lucascontieri.exercicioAlura160625.model.Produto;

public class Main {
    public static void main(String[] args) {
        //IdadePessoa idade1 = new IdadePessoa();
        //idade1.setNome("Lucas");
        //idade1.setIdade(15);

        //idade1.imprimirInformacoes();
        //idade1.verificarIdade(idade1.getIdade());

        //Produto produto1 = new Produto();
        //produto1.setNome("Borracha");
        //produto1.setPreco(859.96);

        //produto1.aplicarDesconto(10);

        Aluno aluno1 = new Aluno();
        aluno1.setNome("Lucas");
        aluno1.setNotas(10);
        //aluno1.setNotas(5);
        //aluno1.setNotas(8);
        //aluno1.calcularMedia(5);
        aluno1.imprimeMedia();
    }
}
