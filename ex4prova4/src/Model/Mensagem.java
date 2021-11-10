package Model;

public class Mensagem {
    private String mensagemt;
    private Long idPessoa;

    public Mensagem() {
    }

    public Mensagem(String mensagem, Long idPessoa) {
        this.mensagemt = mensagem;
        this.idPessoa = idPessoa;
    }

    public String getMensagemt() {
        return mensagemt;
    }

    public void setMensagemt(String mensagemt) {
        this.mensagemt = mensagemt;
    }

    public Long getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(Long idPessoa) {
        this.idPessoa = idPessoa;
    }

    @Override
    public String toString() {
        return mensagemt + ";" + idPessoa;
    }

}
