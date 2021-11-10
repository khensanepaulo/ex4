package Controller;

import DAO.PessoaDAO;
import Model.Pessoa;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PessoaController {

    private static Long pessoaSelecionado;
    private List<Pessoa> pessoas = new ArrayList<>();

    private PessoaDAO pessoaDao = new PessoaDAO();
    private Object Pessoa;
    private PessoaDAO PessoaDao;

    public static Long getPessoaSelecionado() {
        return pessoaSelecionado;
    }

    public void setPessoaSelecionado(Long PessoaSelecionado) {
        this.pessoaSelecionado = pessoaSelecionado;
    }

    public void cadastrar(Pessoa pessoa){




            PessoaDao.cadastrarPessoa(pessoas);



            System.out.println("Cadastre outro Id.");



    }



    public List<Pessoa> listar(){

        return pessoas;

    }

    public List<Pessoa> carregarPessoas() throws IOException {

        this.pessoas = PessoaDao.carregarPessoas();
        return pessoas;

    }
}

