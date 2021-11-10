package Model;

public class Pessoa {
    private Long idPessoa;
    private String nome;

    public Pessoa() {
    }

    public Long getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(Long idPessoa) {
        this.idPessoa = idPessoa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return idPessoa + ";" + nome;
    }

    public void setId(long idPessoa) {
    }
}

