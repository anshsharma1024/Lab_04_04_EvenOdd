public class Main {
    public static void main(String[] args) {
        int numToExamine = 7;

        int result = numToExamine % 2;

        if (result == 0) {
            System.out.println(numToExamine + " is even.");
        } else {
            System.out.println(numToExamine + " is odd.");
        }
    }
}