package Controller;

import DAO.MensagemDAO;
import Model.Pessoa;
import Model.Mensagem;

import java.util.ArrayList;
import java.util.List;

public class MensagemController {

    public List<Mensagem> sessoes = new ArrayList<>();
    public MensagemDAO mensagemDAO = new MensagemDAO();

    public void cadastrar(Mensagem mensagem){



            sessoes.add(mensagem);
            mensagemDAO.cadastrarMensagem(sessoes);



            System.out.println("Cadastre outro Id.");



    }


    public List<Mensagem> getSessoes() {

        return this.sessoes;

    }

    public boolean getMensagens() {
        return false;
    }
}

