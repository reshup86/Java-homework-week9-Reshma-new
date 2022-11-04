/*
Write a Java program to reverse an array of integer values.
*/

public class Programme_3_ReverseArray {
    public static void main(String[] args) {
        // ArrayList <Integer> list = new ArrayList<>(Arrays.asList(1,3,5,7,9));

        int list[] = {1, 3, 5, 7, 9};
        System.out.println("Original array value is:");
        for (int data : list) {
            System.out.print("\t" + data);
        }
        System.out.println("\nArray value in reverse order is:");
        for (int i = list.length - 1; i >= 0; i--) {
            System.out.print("\t" + list[i]);
        }
    }
}

    /*public static void main(String[] args) {
        int arr[] = {1,3,5,7,9};
        System.out.println("Original array value is: ");
        for(int i=0;i<arr.length;i++){
            System.out.print("\t" +arr[i]);
        }
        System.out.println("\n\nArray value in reverse order");
        for (int i=arr.length-1; i >= 0; i--){
            System.out.print("\t" +arr[i]);
        }
    }
}
*/

// System.out.println("\nArray value in reverse order is:");
//Collections.reverse(Arrays.asList(list));
//System.out.print("\t" +Arrays.asList(list));