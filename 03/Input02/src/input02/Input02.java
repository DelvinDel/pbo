package input02;

import javax.swing.JOptionPane;

public class Input02 {
    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null,
                "There's no input here, just a message",
                "Judul",
                3);

        
        String input1 = (String)JOptionPane.showInputDialog(null,
                "What is this?",
                "Dialog Title",
                3,
                null,
                null,
                "Type something here.");
        
        
        String[] acceptableValues = {"ayam", "bebek", "ikan"};
        String input2 = (String)JOptionPane.showInputDialog(null,
                "Lebih enak?",
                "Makanan",
                3,
                null,
                acceptableValues,
                acceptableValues[1]);
                
    }
}
