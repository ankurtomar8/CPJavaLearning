

public class StringLengthCharAt {
      public static void main(String[] args){

     String str = "Ankur";
        int counter = 0;

                try {
            while (true) {
                str.charAt(counter); // Access character at index
                counter++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // End of string reached
        }

        System.out.println("Length of the string: " + counter);




        
      }
    
}
