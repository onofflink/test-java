class P {  // Define a class named P
  public int calc(int n) {  // Define a public method calc that takes an integer n and returns an integer
    if (n <= 1) return n;  // Base case: if n is 0 or 1, return n
    return calc(n - 1) + calc(n - 2);  // Recursive case: return the sum of calc(n-1) and calc(n-2)
  }
}

class C extends P {  // Define a class named C that extends class P
  public int calc(int n) {  // Override the calc method in class P
    if (n <= 1) return n;  // Base case: if n is 0 or 1, return n
    return calc(n - 1) + calc(n - 3);  // Recursive case: return the sum of calc(n-1) and calc(n-3)
  }
}

public class Test {  // Define a public class named Test
  public static void main(String[] args) {  // Define the main method, the entry point of the program
    P obj = new C();  // Create an instance of class C and assign it to a reference of type P
    System.out.print(obj.calc(7));  // Call the calc method on obj with argument 7 and print the result
  }
}

// Output:
// 13


// class P {
//   public int calc (int n) {
//     if (n <= 1) return n;
//     return calc (n - 1) + calc (n - 2);
//   }
// }
// class C extends P {
//   public int calc (int n) {
//     if (n <= 1) return n;
//     return calc (n - 1) + calc (n - 3);
//   }
// }
//
// public class Test {
//   public static void main(String[] args) {
//     P obj = new C();
//     System.out.print(obj.calc(7));
//   }
// }

//output
// 13
