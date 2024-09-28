# Project-1--RomanNumeralGUI


Write a main application called Project1.java, and a GUI (that extends JFrame) called 
RomanNumeralGUI.java. The main program should open a file called “input.txt” which will contain 
Roman numerals. There may be more than one Roman numeral on a line, and they will be separated 
by commas.  
The GUI should have a grid layout of one row and two columns (column 0 and 1). Column 0 should 
contain each individual Roman numeral from the file. Column 1 should have corresponding lines that 
give the Arabic value of the Roman numeral.  For example, if the input file contains 
IX 
MMXXIII,VII 
Then the content pane of the GUI should contain 
IX   
MMXXIII 
VII  
9 
2023 
7 
The core of this project is the conversion of a Roman numeral to an Arabic numeral. It is suggested 
you write this method first and test it. Let’s call it valueOf which, when given a String representing a 
Roman numeral will return an int for its integer Arabic value. That is, valueOf(“VII”) returns 7. A nice 
tutorial on Roman numerals and conversion to Arabic can be found at 
https://tutorialhorizon.com/algorithms/convert-roman-number-to-integer/.
