package View;

import Controller.MensagemController;
import Model.Pessoa;
import Model.Mensagem;

import java.util.Scanner;

public class MensagemView {
    Scanner entrada = new Scanner(System.in);
    MensagemController mensagemController = new MensagemController();

    public void cadastrarMensagem(Long idPessoa) {

        Mensagem mensagem = new Mensagem();

        System.out.print("Digite a mensagem:");
        mensagem.setMensagemt(entrada.next());

        entrada.nextLine();

        System.out.print("Id da pessoa.");
        mensagem.setIdPessoa(idPessoa);

        System.out.println("Mensagem cadastrada com sucesso! \n" + mensagem);
        mensagemController.cadastrar(mensagem);

    }
    public void listarMensagens(){

        System.out.println(mensagemController.getMensagens());

    }

    public void listarMensagensByIdPessoa(Long pessoaSelecionado) {
    }
}
