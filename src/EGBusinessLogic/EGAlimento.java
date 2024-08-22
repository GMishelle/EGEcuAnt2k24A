package EGBusinessLogic;

public abstract class EGAlimento {
    protected String tipo;

    @Override
    public String toString(){
        if (tipo == null)
        tipo = "";
        return tipo.toUpperCase();
    }
}
