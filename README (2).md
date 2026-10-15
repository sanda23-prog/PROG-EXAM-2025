# Q.1.2 — ProductSales Class

This README documents the solution to Question 1.2: a `ProductSales` class
that implements the `IProductSales` interface, plus a step-by-step tutorial
for building it yourself.

## Files

| File | Purpose |
|---|---|
| `IProductSales.java` | The interface contract — method signatures only |
| `ProductSales.java` | The class that implements the interface |

## The Interface Contract

```java
public interface IProductSales {
    int TotalSales(int[][] productSales);
    double AverageSales(int[][] productSales);
    int MaxSale(int[][] productSales);
    int MinSale(int[][] productSales);
}
```

Every method takes the full two-dimensional product sales array
(rows = years, columns = quarters) and returns one calculated statistic.

## Expected Output

Using the Q1.1 sales data:

```java
int[][] productSales = {
    {300, 150, 700},   // Year 1: Q1, Q2, Q3
    {250, 200, 600}    // Year 2: Q1, Q2, Q3
};
```

Calling each method produces:

```
Total:   2200
Average: 366.6666666666667
Max:     700
Min:     150
```

(`AverageSales` returns a `double` as required by the interface, so it is
not rounded here — rounding, if wanted, happens where the value is
displayed, not inside the calculation method.)

## Step-by-Step Tutorial

1. **Read the interface contract.**
   Study `IProductSales` carefully: it names four methods — `TotalSales`,
   `AverageSales`, `MaxSale`, `MinSale` — each taking a two-dimensional
   `int` array (`int[][]`) and returning `int`, `double`, `int` and `int`
   respectively. `ProductSales` must provide a body for every one of them
   with those exact names, parameter types and return types, or it won't
   compile.

2. **Write the interface file.**
   In `IProductSales.java`, declare `public interface IProductSales { ... }`
   and list the four method signatures exactly as given, each ending in a
   semicolon with no body. Interfaces only state what a method must do,
   never how it does it.

3. **Declare the class.**
   In `ProductSales.java`, write
   `public class ProductSales implements IProductSales { }`.
   The `implements` keyword is a promise to the compiler — Java will now
   refuse to build until every interface method has a matching, fully
   written method in this class.

4. **Implement `TotalSales`.**
   Use a nested loop: an outer loop over each row (year) and an inner loop
   over each value in that row (quarter). Add every value into a running
   `int total`, then return it once both loops finish.

5. **Implement `AverageSales`.**
   Call your own `TotalSales` method to get the sum, then count how many
   individual sales figures exist by adding up each row's length as you
   loop through. Cast the total to `(double)` before dividing, so decimal
   places are kept, and return that as a `double`.

6. **Implement `MaxSale`.**
   Start a `max` variable equal to the very first value,
   `productSales[0][0]`. Loop through every value in the array, and
   whenever you find one bigger than `max`, replace it. Return `max` once
   the loops are done.

7. **Implement `MinSale`.**
   Same pattern as `MaxSale`, but in reverse: start `min` at
   `productSales[0][0]`, and replace it whenever you find a smaller value
   while looping through the whole array. Return `min` at the end.

8. **Compile and test.**
   Compile both files together:
   ```
   javac IProductSales.java ProductSales.java
   ```
   Then write a small throwaway class with a `main` method that creates a
   `ProductSales` object, passes in a 2D array like the one from the
   question, and prints the result of each method so you can check the
   numbers by hand.

## How to Compile and Run a Quick Test

```java
public class Test {
    public static void main(String[] args) {
        int[][] productSales = {
            {300, 150, 700},
            {250, 200, 600}
        };

        IProductSales ps = new ProductSales();
        System.out.println("Total:   " + ps.TotalSales(productSales));
        System.out.println("Average: " + ps.AverageSales(productSales));
        System.out.println("Max:     " + ps.MaxSale(productSales));
        System.out.println("Min:     " + ps.MinSale(productSales));
    }
}
```

```
javac IProductSales.java ProductSales.java Test.java
java Test
```

## Note on Naming

The question's prose says the class "must implement an `IProductSales`
interface," while the code block in the original paper shows
`public interface IProduct { ... }`. This README and the accompanying
files use **`IProductSales`**, matching the prose and the `ProductSales`
class name. If your module's template specifically requires the shorter
name `IProduct`, rename the interface file and its `implements` clause
accordingly.
