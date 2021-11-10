package DAO;

import Model.Pessoa;
import Model.Mensagem;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class MensagemDAO {

    public void cadastrarMensagem(List<Mensagem> sessoes){

        File mensagemFile = new File("sessoes.txt");

        if(!mensagemFile.isFile()){

            try {
                mensagemFile.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

        try {
            FileWriter fileWriter = new FileWriter(mensagemFile);
            PrintWriter printWriter  = new PrintWriter(fileWriter);

            for(int i = 0; i < sessoes.size(); i++){

                printWriter.println(sessoes.get(i));

            }

            fileWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}

