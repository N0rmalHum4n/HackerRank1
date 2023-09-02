import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class AscendingBinarySorter {

    private static final int[] input = {7, 8, 6, 5};

    private int[] rearrange (int[] elements) {
        Map<Integer, ArrayList<String>> infiniteMap = new HashMap<>();
        int[] output = new int[elements.length];
        String[] list = new String[elements.length];
        for (int i = 0; i < elements.length; i++){
          list[i] = dectoBinary(elements[i]);
          ArrayList<String> internalArray;
          int oneNumber = numberOfOnes(list[i]);
          if (infiniteMap.containsKey(oneNumber)) {
              internalArray = infiniteMap.get(oneNumber);
              System.out.println("for element = " + elements[i] + " internalArray = " + internalArray);
          }
          else {
              internalArray = new ArrayList<>();
              System.out.println("else, for element = " + elements[i] + " internalArray = " + internalArray);
          }
          internalArray.add(list[i]);
          infiniteMap.put(oneNumber, internalArray);
          System.out.println("later, for element = " + elements[i] + " internalArray = " + internalArray + " and infiniteMap = " + infiniteMap);
       }
        System.out.println(infiniteMap);
        return output;
    }

    private int numberOfOnes (String myString) {
        int oneCount = 0;
        for (int i = 0; i < myString.length(); i++) {
            if (myString.charAt(i) == '1') {
                oneCount++;
            }
        }
        return oneCount;
    }

    private String dectoBinary (int number) {
        return Integer.toBinaryString(number);

    }

    private void print (Object[] listOfInt) {
        for (int i = 0; i < listOfInt.length; i++) {
            System.out.println(listOfInt[i]);
        }
    }

    public static void main (String[] args) {
        AscendingBinarySorter sorter = new AscendingBinarySorter();
        sorter.rearrange(input);
    }

}
