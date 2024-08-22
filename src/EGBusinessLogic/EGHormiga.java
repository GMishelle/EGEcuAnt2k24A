package EGBusinessLogic;

public abstract class EGHormiga {
    private String tipo;
    private int id;
    private String sexo;
    private String estado;

    public EGHormiga(String tipo, int id, String sexo, String estado) {
        this.tipo = tipo;
        this.id = id;
        this.sexo = sexo;
        this.estado = estado;
    }

    public void comer(EGIngestaNativa ingNat) {

    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "EGHormiga [tipo=" + tipo + ", id=" + id + ", sexo=" + sexo + ", estado=" + estado + "]";
    }

}
