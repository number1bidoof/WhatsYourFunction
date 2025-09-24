public class MathHelper {
    public static int calculateSum(int i, int j) {
        return i + j;
    }
    public static int findMin(int z, int y) {
        int miniNum;
        if (z > y){
            miniNum = y;
        } else {
            miniNum = z;
        }
        return miniNum;
    }
    public static void printResult(int x){
        System.out.println("The result is... " + x);
    }

    public static void main(String[] args) {
        int sum = calculateSum(15, 25);
        int min = findMin(10, 20);
        printResult(sum);
        printResult(min);
    }
}
