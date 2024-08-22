package EGBusinessLogic;

public abstract class EGAlimento {
    protected String tipo;

    public EGAlimento(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        if (tipo == null)
            tipo = "";
        return tipo.toUpperCase();
    }
}
