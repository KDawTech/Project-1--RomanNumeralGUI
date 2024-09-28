
//gui that will be used to construct program
import java.awt.*;
import javax.swing.*;
import java.io.*;

public class RomanANumeralGUI extends JFrame {// JFrame for Roman Numerals

    public RomanANumeralGUI() { // constructor

        // Initialize
        super("Roman Numerals to Arabic");
        // Initialize the frame
        // setTitle("Roman Numerals to Arabic");
        // Set the size of the frame

        setSize(500, 600);

        // Set the location of the frame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);// Default
        setResizable(true);// Default
        setLayout(new GridLayout(1, 2));
        setBackground(getForeground());

        Container contentPane = getContentPane();
        String inputFilePath = ("C:\\Users\\jamja\\Desktop\\usb documents\\P1\\input3.txt" );// Path to the input file

        TextArea romanTextArea = new TextArea("Roman Numerals: " + "\n");
        TextArea arbicTextArea = new TextArea("Arabic Numerals: " + "\n");

        try (BufferedReader br = new BufferedReader(new FileReader(inputFilePath))) {
            String line;// = br.readLine();
            while ((line = br.readLine()) != null) { //
                String[] romanNumerals = line.split(",");//
                for (String romanNumeral : romanNumerals) {

                    romanTextArea.append(romanNumeral + "\n");
                    arbicTextArea.append(valueOf(romanNumeral) + "\n");

                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        contentPane.add(romanTextArea);
        contentPane.add(arbicTextArea);
        romanTextArea.setEditable(false);
        arbicTextArea.setEditable(false);
        setContentPane(contentPane);

    }

    public static int valueOf(String romanNumeral) {
        int arabicValue = 0;

        for (int i = 0; i < romanNumeral.length(); i++) {// For each character in the romanNumeral

            char currentChar = romanNumeral.charAt(i);// Get the current char

            switch (currentChar) {
                case 'M':
                    arabicValue += 1000;
                    break;
                case 'D':
                    arabicValue += 500;
                    break;
                case 'C':
                    if (i < romanNumeral.length() - 1 && romanNumeral.charAt(i + 1) == 'M') {
                        arabicValue += 900;
                        i++;
                    } else if (i < romanNumeral.length() - 1 && romanNumeral.charAt(i + 1) == 'D') {
                        arabicValue += 400;
                        i++;
                    } else {
                        arabicValue += 100;
                    }
                    break;
                case 'L':
                    arabicValue += 50;
                    break;
                case 'X':
                    if (i < romanNumeral.length() - 1 && romanNumeral.charAt(i + 1) == 'C') {
                        arabicValue += 90;
                        i++;
                    } else if (i < romanNumeral.length() - 1 && romanNumeral.charAt(i + 1) == 'L') {
                        arabicValue += 40;
                        i++;
                    } else {
                        arabicValue += 10;
                    }
                    break;
                case 'V':
                    arabicValue += 5;
                    break;
                case 'I':
                    if (i < romanNumeral.length() - 1 && romanNumeral.charAt(i + 1) == 'X') {
                        arabicValue += 9;
                        i++;
                    } else if (i < romanNumeral.length() - 1 && romanNumeral.charAt(i + 1) == 'V') {
                        arabicValue += 4;
                        i++;
                    } else {
                        arabicValue += 1;
                    }
                    break;
            }
        }
        return arabicValue;
        // return arabicValue;

    }
}
