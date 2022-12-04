package assignment_2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Packaging {
	public static void main(String[] args) throws IOException {
		
		// Open the input, output, and a writer to write to the output file.
        FileInputStream inputFile = new FileInputStream("dimensions.txt");
        Scanner scanner = new Scanner(inputFile);
        FileOutputStream outputFile = new FileOutputStream("result.txt");
        PrintWriter writer = new PrintWriter(outputFile);
 
        // Read the input file's input.
        int smallBox = scanner.nextInt();
        int bigBoxLength = scanner.nextInt();
        int bigBoxHeight = scanner.nextInt();
        int bigBoxWidth = scanner.nextInt();

        // Takes the input file's inputs and does a simple calculation to determine how many small boxes fit in the big box.
        // On the assignment module you mention that "81" is incorrect. That's because the computer rounds down. We aren't dealing
        // with doubles here either because there are no partial boxes, only 100% whole boxes.
        int totalBoxes = ((bigBoxLength / smallBox) * (bigBoxHeight / smallBox) * (bigBoxWidth / smallBox));
        
        // Writes the output value into the result file to display the total boxes.
        writer.println(totalBoxes);
        
        // Closes the input, output, and writer.
        writer.close();
        outputFile.close();
        scanner.close();
        inputFile.close();
    }
}
