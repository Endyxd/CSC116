public class Oops6 {
    public static void main(String[] args) {
        Scanner in = new Scanner("example.txt");
        countWords( in );
    }
    // Counts total lines and words in the input scanner.
    public static void countWords(Scanner input) {
        Scanner input = new Scanner("example.txt");
        //scanner already defined
        int lineCount = 0;
        int wordCount = 0;
        while (input.nextLine()) {
            //change to next()
            String line = input.line(); // read one line
            //.line is not a real method
            lineCount++;
            while (line.next()) { // tokens in line
                //line.next is not real it is hasNext
                String word = line.hasNext;
                //has next line
                wordCount++;
            }
        }
    }
}