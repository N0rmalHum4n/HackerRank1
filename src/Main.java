//import java.util.Arrays;
//import java.util.Comparator;
//
//public class Main {
//    public static void main(String[] args) {
//        int[] arr = {7, 8, 9, 10, 11, 12, 13};
//        int[] rearranged = rearrange(arr);
//        System.out.println(Arrays.toString(rearranged));
//    }
//
//    public static int[] rearrange(int[] arr) {
//
//
//
//
//


       /* //convert integer to binary strings
        String[] binaryStrings = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            binaryStrings[i] = Integer.toBinaryString(arr[i]);
        }

        //used Comparator because Google told me
        Comparator<String> binaryComparator = new Comparator<String>() {
            @Override
            public int compare(String str1, String str2) {
                //code ripped off Google (too difficult)
                int count1 = (int) str1.chars().filter(ch -> ch == '1').count();
                int count2 = (int) str2.chars().filter(ch -> ch == '1').count();
                if (count1 != count2) {
                    return Integer.compare(count1, count2);=4

                } else {
                    return str1.compareTo(str2);
                }
            }
        };

        Arrays.sort(binaryStrings, binaryComparator);

        int[] rearranged = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            rearranged[i] = Integer.parseInt(binaryStrings[i], 2);
        }

        return rearranged;
    }
}
*/