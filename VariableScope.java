public class VariableScope {
    public static int tryToModify(int o){
        return(o + 10);
    }
    public static int[] processArray(int[] p){
        for(int i = 0; i < p.length; i++){
            p[i] *= 2;
        }
        return p;
    }
    public static void demonstrateScope(){
        int x = 100;
        for(int i = 0; i < 3; i++){
            int y = i * 10;
            System.out.println(x);
            System.out.println(y);
        }
        System.out.println(x);
        ///System.out.println(y);
    }
        public static void main(String[] args) {
            int number = 5;
            System.out.println("Before method call: " + number);
            number = tryToModify(number);
            System.out.println("After method call: " + number);
            int[] arr = {1, 2, 3, 4, 5};
            System.out.print("Before: ");
            for(int val : arr) System.out.print(val + " ");
            System.out.println();

            processArray(arr);

            System.out.print("After: ");
            for(int val : arr) System.out.print(val + " ");
            System.out.println();

            demonstrateScope();
    }
}
