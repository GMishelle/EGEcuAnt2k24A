package EGBusinessLogic;

public abstract class EGIngestaNativa extends EGAlimento {
    EGGenoAlimento aGeno;

    public EGIngestaNativa(String tipo) {
        super(tipo);
    }

    public boolean inyectar(EGGenoAlimento geno) {
        aGeno = geno;
        return aGeno != null;
    }
}
