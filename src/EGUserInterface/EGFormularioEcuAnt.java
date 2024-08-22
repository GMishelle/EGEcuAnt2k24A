package EGUserInterface;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class EGFormularioEcuAnt {

    public static void main(String[] args) {
        JFrame frame = new JFrame("EcuAnt 2k24");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);
        frame.setLayout(new BorderLayout());

        // Panel superior con la imagen y el título
        JPanel topPanel = new JPanel(new BorderLayout());
        JLabel imgLabel = new JLabel(new ImageIcon("src\\EGUserInterface\\EGResources\\logo1.png"));
        JLabel titleLabel = new JLabel("Homiguero Virtual", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 16));
        topPanel.add(imgLabel, BorderLayout.NORTH);
        topPanel.add(titleLabel, BorderLayout.SOUTH);

        // Panel para la grilla
        String[] columnNames = {"RegNo", "TipHomAmiga", "Ubicación", "Sexo", "IngestaNativa", "GenoAlimento", "Estado"};
        Object[][] data = new Object[8][7]; // 8 filas, 7 columnas
        JTable table = new JTable(data, columnNames);
        JScrollPane scrollPane = new JScrollPane(table);

        // Panel para los combos
        JPanel comboPanel = new JPanel();
        String[] genoOptions = {"X", "XX", "XY"};
        JComboBox<String> genoCombo = new JComboBox<>(genoOptions);
// ================================================
        // ArrayList<GenoAlimento> lstAlimento = new ArrayList<>();
        // lstAlimento.add(new X());
        // lstAlimento.add(new XX());
        // lstAlimento.add(new XY());
        
        // JComboBox<GenoAlimento> genoCombo = new JComboBox<>(lstAlimento.toArray(new GenoAlimento[0]));
        // genoCombo.addActionListener(new ActionListener() {
        //    @Override
        //    public void actionPerformed(ActionEvent e) {
        //        GenoAlimento a = (GenoAlimento) genoCombo.getSelectedItem();
        //         if (a != null) {
        //    System.out.println("ID seleccionado: " + a.getClass());
        //}
    //}
    //});

         String[] ingestaOptions = {"Carnívoro", "Herbívoro", "Omnívoro", "Insectívoro", "Nectarívoros"};
         JComboBox<String> ingestaCombo = new JComboBox<>(ingestaOptions);
         comboPanel.add(genoCombo);
         comboPanel.add(ingestaCombo);
         
         // Panel para los botones
         JPanel buttonPanel = new JPanel(new GridLayout(1, 4, 5, 5)); // 1 fila, 4 columnas, con espacio entre componentes
         JButton createButton = new JButton("Crear Larva");
         JButton feedButton = new JButton("Alimentar");
         JButton deleteButton = new JButton("Eliminar");
         JButton saveButton = new JButton("Guardar");
         
         buttonPanel.add(createButton);
         buttonPanel.add(feedButton);
         buttonPanel.add(deleteButton);
         buttonPanel.add(saveButton);
         
         // Panel combinado para los combos y botones
         JPanel comboButtonPanel = new JPanel(new BorderLayout());
         comboButtonPanel.add(comboPanel, BorderLayout.NORTH);
         comboButtonPanel.add(buttonPanel, BorderLayout.SOUTH);
         
         // Panel principal que contiene la tabla y el panel de control (combos y botones)
         JPanel mainPanel = new JPanel(new BorderLayout());
         mainPanel.add(scrollPane, BorderLayout.CENTER); // Añadir la grilla (tabla)
         mainPanel.add(comboButtonPanel, BorderLayout.SOUTH); // Añadir el panel de combos y botones
         
         // Barra de estado en la parte inferior con separadores
         JPanel statusBar = new JPanel(new FlowLayout(FlowLayout.LEFT));
         JLabel programLabel = new JLabel("Programación II");
         JLabel cedulaLabel = new JLabel("Cédula: 1726714890");
         JLabel nameLabel = new JLabel("Nombres: Gabriela Echeverria");
         
         statusBar.add(programLabel);
         statusBar.add(new JLabel(" | ")); // Primer separador
         statusBar.add(cedulaLabel);
         statusBar.add(new JLabel(" | ")); // Segundo separador
         statusBar.add(nameLabel);
         
         // Añadir los paneles al frame principal
         frame.add(topPanel, BorderLayout.NORTH); // Panel superior con la imagen y el título
         frame.add(mainPanel, BorderLayout.CENTER); // Panel con la tabla, combos y botones
         frame.add(statusBar, BorderLayout.PAGE_END); // Barra de estado al final
         
         // Mostrar la ventana
         
         frame.setVisible(true);
   }
}
