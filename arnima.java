// Online Java Compiler
// Use this editor to write, compile and run your Java code online
public class RemoveDuplicatesManual {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 1, 2, 4, 5};
        int length = array.length;

        // Remove duplicates
        int[] result = new int[length];
        int newLength = 0;

        for (int i = 0; i < length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < newLength; j++) {
                if (array[i] == result[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                result[newLength++] = array[i];
            }
        }

        // Print the array without duplicates
        System.out.print("Array without duplicates: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
