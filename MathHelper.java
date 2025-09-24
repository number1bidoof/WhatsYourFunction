public class MathHelper {
    public static int calculateSum(int i, int j) {
        return i + j;
    }
    public static int findMin(int z, int y) { // finds the minimum manually
        int miniNum;
        if (z > y){ // if it is greater, then it prints the lowest integer
            miniNum = y;
        } else { // if the first condition is not true
            miniNum = z;
        }
        return miniNum; // returns the number
    }
    public static void printResult(int x){
        System.out.println("The result is... " + x);
    }

    public static void main(String[] args) {
        int sum = calculateSum(15, 25); // finds the sum of 15 and 25
        int min = findMin(10, 20); // finds the minimum of 10 and 15
        // formats output
        printResult(sum);
        printResult(min);
    }
}
