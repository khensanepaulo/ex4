package DAO;

import Model.Pessoa;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class PessoaDAO {

    public void cadastrarPessoa(List<Pessoa> pessoas){

        File pessoaFile = new File("pessoa.txt");

        if(!pessoaFile.isFile()){

            try {
                pessoaFile.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

        try {
            FileWriter fileWriter = new FileWriter(pessoaFile);
            PrintWriter printWriter  = new PrintWriter(fileWriter);

            for(int i = 0; i < pessoas.size(); i++){

                printWriter.println(pessoas.get(i));

            }

            fileWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void listarPessoa(){



    }

    public List<Pessoa> carregarPessoas() throws IOException {

        List<String> listaDoArquivoPessoa = new ArrayList<>();
        List<Pessoa> listaDePessoas = new ArrayList<>();

        FileReader arquivoFuncionarios = new FileReader("pessoa.txt");
        BufferedReader leArquivoFuncionarios = new BufferedReader(arquivoFuncionarios);

        Path path = Paths.get("pessoa.txt");
        listaDoArquivoPessoa = Files.readAllLines(path);

        for(int i = 0; i < listaDoArquivoPessoa.size(); i++){

            String pessoaString = listaDoArquivoPessoa.get(i);
            String[] dadosPessoa = pessoaString.split(";");

            if(isNumeric(dadosPessoa[0])){

                long idPessoa = (Long.parseLong(dadosPessoa[0]));

                Pessoa pessoa = new Pessoa();

                pessoa.setId(idPessoa);
                pessoa.setNome(dadosPessoa[1]);


                listaDePessoas.add(pessoa);

            }

        }

        return listaDePessoas;

    }

    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

}

