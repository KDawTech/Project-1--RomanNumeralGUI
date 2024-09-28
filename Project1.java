
//main file
//name:Kevon Dawkins
import java.io.*;
import javax.swing.*;

public class Project1 {
    public static void main(String[] args) { // main method

        String inputFilePath = ("C:\\Users\\jamja\\Desktop\\usb documents\\P1\\input3.txt" );// file path to input file

        try (BufferedReader br = new BufferedReader(new FileReader(inputFilePath))) { // try-with-resources statement

            br.readLine();

            String line;// String[] lineArray;

            while ((line = br.readLine()) != null) { // System.out.println(line);

                String[] romanNumerals = line.split(",");// Split the line by commas that are seperated by spaces

                for (String romanNumeral : romanNumerals) {

                    int arabicValue = RomanANumeralGUI.valueOf(romanNumeral);

                    System.out.println(romanNumeral + " " + arabicValue);
                    System.out.println(RomanANumeralGUI.valueOf(romanNumeral));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
            return;
            // throw new RuntimeException(e);
            // return;

        }
        RomanANumeralGUI gui = new RomanANumeralGUI(); // new RomanANumeralGUI2();
        gui.setBounds(100, 100, 300, 300);
        gui.setVisible(true);
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}
