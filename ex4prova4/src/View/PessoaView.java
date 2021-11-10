package View;

import Model.Pessoa;
import java.util.Scanner;
import java.io.IOException;
import Controller.PessoaController;

public class PessoaView {
    Scanner entrada = new Scanner(System.in);
    PessoaController pessoaController = new PessoaController();
    MensagemView mensagemView = new MensagemView();

    public void cadastrarPessoa(){

        Pessoa pessoa = new Pessoa();

        System.out.print("Digite o ID:");
        pessoa.setIdPessoa(entrada.nextLong());

        entrada.nextLine();

        System.out.print("Digite o nome da Pessoa:");
        pessoa.setNome(entrada.next());

        entrada.nextLine();


        System.out.println("Pessoa cadastrada com sucesso! \n" + pessoa);

        pessoaController.cadastrar(pessoa);

    }
    public void listarPessoas(){

        System.out.println(pessoaController.listar());

    }

    public Long selecionaPessoa(){

        this.listarPessoas();

        System.out.println("Digite o codigo da pessoa que deseja selecionar.");

        Long idSelecionado = entrada.nextLong();



        return null;

    }

    public void menuPessoa(){

        System.out.println("1 - Listar pessoas\n2 - Cadastrar pessoas\n3 - seleccionar pessoa");

        switch (entrada.nextInt()){

            case 1:
                this.listarPessoas();
                this.menuPessoa();
                break;

            case 2:
                this.cadastrarPessoa();
                this.menuPessoa();
                break;

            case 3:
                pessoaController.setPessoaSelecionado(selecionaPessoa());
                menuInterno(PessoaController.getPessoaSelecionado());
                break;

        }

    }


    public void menuInterno(Long pessoaSelecionado){

        System.out.println("1 - Listar mensagens\n2 - Cadastrar mensagem\n3 - Sair");

        switch (entrada.nextInt()){

            case 1:

                mensagemView.listarMensagensByIdPessoa(pessoaSelecionado);
                menuInterno(pessoaSelecionado);

                break;
            case 2:

                mensagemView.cadastrarMensagem(pessoaSelecionado);
                menuInterno(pessoaSelecionado);

                break;

            case 3:

                menuPessoa();

                break;

        }

    }

    public void carregarPessoas() throws IOException {

        System.out.println(pessoaController.carregarPessoas());

    }
}
