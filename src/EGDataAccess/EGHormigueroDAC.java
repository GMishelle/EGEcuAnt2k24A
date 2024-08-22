package EGDataAccess;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import EGBusinessLogic.EGHormiga;

public class EGHormigueroDAC {
    public void saveHormigueroCSV(String listaHormigas) {
        try (FileWriter writer = new FileWriter("src/Data/hormiguero.csv")) {
            writer.write(listaHormigas);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
