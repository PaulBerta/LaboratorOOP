package Proiect2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ZooApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Zoo Management");
        frame.setSize(400, 300);
        frame.setLayout(new FlowLayout());

        Zoo zoo = new Zoo();
        JLabel label = new JLabel("Animals in " + zoo.getName() + ":");
        frame.add(label);

        JButton addButton = new JButton("Add Animal");
        JTextArea outputArea = new JTextArea(10, 30);
        outputArea.setEditable(false);

        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    if(Zoo.animalCount >= zoo.getCapacity()) {
                        throw new Exception("Zoo is full");
                    }
                    String type = JOptionPane.showInputDialog("Enter Animal Type (Bird/Reptilian)");
                    if(type.isEmpty()) {
                        throw new Exception("Fields cannot be empty");
                    }
                    
                    if(!type.equals("Bird") && !type.equals("Reptilian")) {
                        throw new Exception("Invalid animal type");
                    }

                    String name = JOptionPane.showInputDialog("Enter Animal Name");
                    if(name.isEmpty()) {
                        throw new Exception("Fields cannot be empty");
                    }
                    Zoo.animalCount++;
                    Animal newAnimal = null;
                    if (type.equalsIgnoreCase("Bird")) {
                        boolean canFly = JOptionPane.showConfirmDialog(null, "Can it fly?") == JOptionPane.YES_OPTION;
                        newAnimal = new Bird(name, canFly);
                    } else if (type.equalsIgnoreCase("Reptilian")) {
                        boolean isVenomous = JOptionPane.showConfirmDialog(null, "Is it venomous?") == JOptionPane.YES_OPTION;
                        newAnimal = new Reptilian(name, isVenomous);
                    }

                    if (newAnimal != null) {
                        zoo.addAnimal(newAnimal);
                    }

                    outputArea.setText("");
                    for(Animal animal : zoo.getAnimals()) {
                        outputArea.append(animal.toString() + "\n");
                    }
                } catch(Exception ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
            }
        });

        frame.add(addButton);
        frame.add(outputArea);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

