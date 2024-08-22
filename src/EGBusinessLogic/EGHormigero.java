package EGBusinessLogic;

import EGDataAccess.*;
import java.util.ArrayList;

public class EGHormigero {
    public ArrayList<EGHormiga> lstHormiguero = new ArrayList<EGHormiga>();

    public String crearLarva() {
        EGHormiga hormiga = new EGHLarva(lstHormiguero.size() + 1);
        lstHormiguero.add(hormiga);
        return "Larva creada, agregada al hormiguero";
    }

    public String eliminarHormiga(int id) throws Exception {
        for (EGHormiga hormiga : lstHormiguero) {
            if (hormiga.getId() == id) {
                lstHormiguero.remove(hormiga);
                return "Hormiga eliminada";
            }
        }
        return "Hormiga no encontrada";
    }

    public String guardarHormiguero() throws Exception {
        String FullDataHormiga = "";
        for (EGHormiga hormiga : lstHormiguero)
            FullDataHormiga += hormiga.toString() + "\n";
        new EGHormigueroDAC().saveHormigueroCSV(FullDataHormiga);
        return "Hormiguero guardado";
    }

    public String alimentarHormiga(int id, String alimentoGeno, String alimentoNativo) throws Exception {
        int indexlist = 0;
        EGGenoAlimento aGeno = null;
        EGIngestaNativa aNativo = null;
        EGHormiga hormiga = null;
        switch (alimentoGeno) {
            case "XX":
                aGeno = new EGXX("");
                break;
            case "XY":
                aGeno = new EGXY("");
                break;

            default:
                aGeno = new EGX("");
                break;
        }
        // creando IngestaNativa
        switch (alimentoNativo) {
            case "Omnivoro":
                aNativo = new EGOmnivoros("");
                break;
            case "Nectivoros":
                aNativo = new EGNectivoros("");
                break;
        }

        for (indexlist = 0; indexlist < lstHormiguero.size(); indexlist++) {
            if (lstHormiguero.get(indexlist).getId() == id) {
                hormiga = lstHormiguero.get(indexlist);
                break;
            }
        }
        // validamos
        if (aNativo == null || aGeno == null || hormiga == null || hormiga.getEstado() == "Muerta")
            return "Ups..!! alimento u hormiga no validos";
        if (aNativo.inyectar(aGeno)) {
            hormiga.comer(aNativo);
            lstHormiguero.set(indexlist, hormiga);
        } else {
            return hormiga.getTipo() + " no puede alimentarse";
        }
        return lstHormiguero.get(indexlist).getTipo() + " alimentada";
    }

    public void imprimirHormigas() {
        for (EGHormiga hormiga : lstHormiguero) {
            System.out.println(hormiga.toString());
        }
    }
}
