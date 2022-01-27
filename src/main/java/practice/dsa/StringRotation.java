package practice.dsa;

public class StringRotation {
    public static void main(String[] args) {
        String input = "waterbottle";
        String output = "erbottlewat";

        if (rotateString(input,output)) {
            System.out.println("It's a substring");
        } else {
            System.err.println("Not a substring");
        }
    }

    private static boolean rotateString(String input, String output){
        if (input.length()==output.length()) {
            return (input + input).contains(output);
        }else{
            return false;
        }
    }
}