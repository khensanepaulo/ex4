import View.PessoaView;

import java.io.IOException;

public class Main {

    public static void main (String[] args) throws IOException {
        PessoaView pessoaView = new PessoaView();

        pessoaView.carregarPessoas();
        pessoaView.menuPessoa();
    }
}
