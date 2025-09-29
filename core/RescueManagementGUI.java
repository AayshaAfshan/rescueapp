package com.rescueapp.core;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class RescueManagementGUI extends JFrame {
    public RescueManagementGUI() {
        setTitle("Stray Animal Rescue Management");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(900, 600);

        JTabbedPane tabs = new JTabbedPane();

        tabs.add("Stray Animals", createStrayAnimalPanel());
        tabs.add("Adoption Requests", createAdoptionRequestPanel());
        tabs.add("Reports", createReportPanel());
        tabs.add("Users", createUserPanel());

        add(tabs);
        setVisible(true);
    }

    private JPanel createStrayAnimalPanel() {
        String[] columns = {"Animal ID", "Name", "Species", "Status", "Location"};
        DefaultTableModel model = new DefaultTableModel(columns, 0);
        JTable table = new JTable(model);

        JPanel panel = new JPanel(new BorderLayout());
        panel.add(new JScrollPane(table), BorderLayout.CENTER);

        // Sample entry form at bottom (for manual entry)
        JPanel form = new JPanel();
        JTextField animalId = new JTextField(8);
        JTextField name = new JTextField(8);
        JTextField species = new JTextField(8);
        JTextField status = new JTextField(8);
        JTextField location = new JTextField(10);
        JButton addBtn = new JButton("Add");

        form.add(new JLabel("ID:"));
        form.add(animalId);
        form.add(new JLabel("Name:"));
        form.add(name);
        form.add(new JLabel("Species:"));
        form.add(species);
        form.add(new JLabel("Status:"));
        form.add(status);
        form.add(new JLabel("Location:"));
        form.add(location);
        form.add(addBtn);

        addBtn.addActionListener(e -> {
            model.addRow(new Object[]{
                animalId.getText(), name.getText(),
                species.getText(), status.getText(), location.getText()
            });
        });

        panel.add(form, BorderLayout.SOUTH);
        return panel;
    }

    private JPanel createAdoptionRequestPanel() {
        String[] columns = {"Request ID", "Animal", "Adopter", "Date", "Status"};
        DefaultTableModel model = new DefaultTableModel(columns, 0);
        JTable table = new JTable(model);
        JPanel panel = new JPanel(new BorderLayout());
        panel.add(new JScrollPane(table), BorderLayout.CENTER);
        // Add sample form code for adding requests here similarly
        return panel;
    }

    private JPanel createReportPanel() {
        String[] columns = {"Report ID", "Animal", "Reporter", "Date", "Description"};
        DefaultTableModel model = new DefaultTableModel(columns, 0);
        JTable table = new JTable(model);
        JPanel panel = new JPanel(new BorderLayout());
        panel.add(new JScrollPane(table), BorderLayout.CENTER);
        // Add sample form code for adding reports here similarly
        return panel;
    }

    private JPanel createUserPanel() {
        String[] columns = {"User ID", "Name", "Email", "Role"};
        DefaultTableModel model = new DefaultTableModel(columns, 0);
        JTable table = new JTable(model);
        JPanel panel = new JPanel(new BorderLayout());
        panel.add(new JScrollPane(table), BorderLayout.CENTER);
        // Add sample form code for adding users here similarly
        return panel;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(RescueManagementGUI::new);
    }
}
