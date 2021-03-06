
import java.util.Arrays;
public class BinaryConverter {
    /**
     * Converts an int number to a binary number, using the fact that (#IF NO REMAINDER => #BINARY=0), (#IF REMAINDER => #BINARY=1)
     * @param intNumber the integer to convert
     * @return a new array pattern representing the binary format.
     */
    public static int[] convertToBinary(int intNumber){
        //attrs
        int[] binary = new int[0];
        int position = 0;
        double numerator = intNumber; //first numerator to go into the loop..
        //ensure we haven't reached the last binary value, since numerator != 0
        while (numerator != 0) {
            //run an expandable version of the array #binary
            binary = expand(binary, 1, position);
            if (numerator % 2 == 0) {
                //no remainder -> #Binary = 0
                binary[position] = 0;
            } else {
                //remainder -> #Binary = 1
                binary[position] = 1;
            }
            //prepare the new numerator for the nex loop
            numerator = Math.floor(numerator / 2);
            ++position;
        }
        return reverse(binary);
    }

    /**
     * Converts an input string to a binary format.
     * @param text the input.
     * @return a new String array representing the binary format.
     */
    public static String[] convertToBinary(String text){
            //attrs
            String[] binary = new String[text.length()];
            for(int i = 0; i < text.length(); i++) {
                binary[i] = Arrays.toString(convertToBinary(text.charAt(i)));
            }
        return binary;
    }

    /**
     * Reverses a linked list, since lastIndex = length - 1, then the index of the reversed array = (length - 1) - reversedPosition
     * @param array the array to be reversed
     * @return a reversed array copy.
     */
    public static int[] reverse(int[] array){
        int[] reverse = new int[array.length];
        //downgrade looping
        for(int i = array.length - 1; i >= 0; i--){
            //assigning the opposite values to one another
            reverse[(array.length-1) - i] = array[i];
        }
        return reverse;
    }
    /**
     * Reverses a linked list, since lastIndex = length - 1, then the index of the reversed array = (length - 1) - reversedPosition
     * @param array the array to be reversed
     * @return a reversed array copy.
     */
    public static double[] reverse(double[] array){
        double[] reverse = new double[array.length];
        for(int i = array.length - 1; i >= 0; i--){
            reverse[(array.length-1) - i] = array[i];
        }
        return reverse;
    }
    /**
     * Expands the array with a delta number, or shrinks it with -delta.
     * @param array the array to expand.
     * @param delta the value of expansion.
     * @param lastIndex the last index of the previous array.
     * @return a new expanded array.
     */
    public static double[] expand(double[] array, int delta, int lastIndex){
            if(lastIndex > array.length - 1){
                double[] tempCopy = array;
                array = new double[array.length + delta];
                for(int i = 0; i < Math.min(tempCopy.length, array.length); i++){
                    array[i] = tempCopy[i];
                }
            }
        return array;
    }
    /**
     * Expands the array with a delta number, or shrinks it with -delta.
     * @param array the array to expand.
     * @param delta the value of expansion.
     * @param lastIndex the last index of the previous array.
     * @return a new expanded array.
     */
    public static int[] expand(int[] array, int delta, int lastIndex){
        if(lastIndex > array.length - 1){
            int[] tempCopy = array;
            array = new int[array.length + delta];
            for(int i = 0; i < Math.min(tempCopy.length, array.length); i++){
                array[i] = tempCopy[i];
            }
        }
        return array;
    }
}