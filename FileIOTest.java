import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;

public class FileIOTest {

    static StringBuffer stringBufferOfData = new StringBuffer();
    static String filename = null;
    static Scanner sc = new Scanner(System.in);//initiliaze scanner to get user input

    public static void main(String[] args) {

        boolean fileRead = readFile();//call the method to read the file with the files name

        if (fileRead) {//if the read file was successfull
            replacement();//call method to get text to replace, replacement text and output replaced String buffer

            writeToFile();

        }

        System.exit(0);//exit once app is done
    }

    private static boolean readFile() {
        System.out.println("Please enter your files name and path i.e C:\\test.txt: ");//prompt for file name
        filename = sc.nextLine();//read in the file name
        Scanner fileToRead = null;
        try {
            fileToRead = new Scanner(new File(filename)); //point the scanner method to a file

            //check if there is a next line and it is not null and then read it in
            for (String line; fileToRead.hasNextLine() && (line = fileToRead.nextLine()) != null; ) {
                System.out.println(line);//print each line as its read

                stringBufferOfData.append(line).append("\r\n");//this small line here is to appened all text read in from the file to a string buffer which will be used to edit the contents of the file
            }
            fileToRead.close();//this is used to release the scanner from file
            return true;
        } catch (FileNotFoundException ex) {//if the file cannot be found an exception will be thrown
            System.out.println("The file " + filename + " could not be found! " + ex.getMessage());
            return false;

        } finally {//if an error occurs now we close the file to exit gracefully
            fileToRead.close();
            return true;
        }
        /* The below is another way in which to read the file, however i think the shorter method would be the scanner class
        The reason for this is the below commented method uses 5 extra imports:
        import java.io.BufferedReader;
        import java.io.DataInputStream;
        import java.io.FileInputStream;
        import java.io.IOException;
        import java.io.InputStreamReader;
         *//*
        try {
        BufferedReader reader = new BufferedReader(new InputStreamReader(new DataInputStream(new FileInputStream(filename))));
        for (String line; (line = reader.readLine()) != null;) {
        System.out.println(line);
        sb.append(line).append("\r\n");//this small line here is to appened all text read in from the file to a string buffer which will be used to edit the contents of the file
        
        }
        } catch (IOException ex) {
        System.out.println("The file " + filename + " could not be found or opened! "+ex.getMessage());
        System.exit(0);
        }
         */
    }

    private static void writeToFile() {
        try {
            BufferedWriter bufwriter = new BufferedWriter(new FileWriter(filename));
            bufwriter.write(stringBufferOfData.toString());//writes the edited string buffer to the new file
            bufwriter.close();//closes the file

        } catch (Exception e) {//if an exception occurs
            System.out.println("Error occured while attempting to write to file: " + e.getMessage());
        }
    }

    private static void replacement() {
        System.out.println("Please enter the contents of a line you would like to edit: ");//prompt for a line in file to edit
        String lineToEdit = sc.nextLine();//read the line to edit

        System.out.println("Please enter the the replacement text: ");//prompt for a line in file to replace
        String replacementText = sc.nextLine();//read the line to replace

        //System.out.println(sb);//used for debugging to check that my stringbuffer has correct contents and spacing

        int startIndex = stringBufferOfData.indexOf(lineToEdit);//now we get the starting point of the text we want to edit
        int endIndex = startIndex + lineToEdit.length();//now we add the staring index of the text with text length to get the end index

        stringBufferOfData.replace(startIndex, endIndex, replacementText);//this is where the actual replacement of the text happens

        System.out.println("Here is the new edited text:\n" + stringBufferOfData); //used to debug and check the string was replaced


    }
}