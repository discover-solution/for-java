package practice.dsa;

public class DuplicateElement {
    public static void main(String... args) {
        int array[] = {0, 4, 3, 2, 7, 8, 2, 3, 4};
        System.out.println("array length "+array.length);
        for (int i = 0; i < array.length; i++) {
            array[array[i] % array.length] = array[array[i] % array.length] + array.length;
        }

        for (int i = 0; i < array.length; i++) {
            if(array[i] < array.length*2){
                System.out.print(array[i] + " ");
            }
        }
    }
}
