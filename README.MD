### Reflection Questions
1. Why doesn't the integer change after the method call?
   2. Because the integer is in the local scope of the tryToModify method but not in the main method, you cannot access changes outside the scope.
3. Why does the array change after the method call?
   4. The array changes because it modifies the parameter itself, compared to the previous method which just returns the modifies statement.
5. What happens when you try to access y outside the loop?
   6. You cannot access the y outside the loop since it is a *local variable*, as they can only be referenced inside the loop
   ```java  int x = 100;
        for(int i = 0; i < 3; i++){
            int y = i * 10;
            System.out.println(x);
            System.out.println(y);
        }
        System.out.println(x);
        ///System.out.println(y); causes an error
in this situation, x which is in the method scope can be accessed anywhere **inside the method**, but y **cannot.** 