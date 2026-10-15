/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.productsalesreport;

/**
 *
 * @author Student
 */
public class ProductSalesReport {

    public static void main(String[] args) {
         // -----------------------------------------------------------
        // STEP 1: Store the quarterly sales data in a two-dimensional
        // array. Each ROW represents a year and each COLUMN represents
        // a quarter.
        //   Row 0 = Year 1 -> Quarter 1, Quarter 2, Quarter 3
        //   Row 1 = Year 2 -> Quarter 1, Quarter 2, Quarter 3
        // -----------------------------------------------------------
int[][] quarterlySales = {
            {300, 150, 700},   // Year 1 sales: Q1, Q2, Q3
            {250, 200, 600}    // Year 2 sales: Q1, Q2, Q3
        };
 
        int numYears = quarterlySales.length;          // number of rows (years)
        int numQuarters = quarterlySales[0].length;     // number of columns (quarters)
        int totalEntries = numYears * numQuarters;       // total number of sales figures
 
        // -----------------------------------------------------------
        // STEP 2: Copy every value from the 2D array into a single
        // (one-dimensional) array. Working with one flat array makes
        // it straightforward to calculate the total, average, maximum
        // and minimum across the entire two-year period.
        // -----------------------------------------------------------
        int[] allSales = new int[totalEntries];
        int index = 0;
 
        for (int year = 0; year < numYears; year++) {
            for (int quarter = 0; quarter < numQuarters; quarter++) {
                allSales[index] = quarterlySales[year][quarter];
                index++;
            }
        }
 
        // -----------------------------------------------------------
        // STEP 3: Calculate the TOTAL sales by adding up every value
        // in the single-dimensional array.
        // -----------------------------------------------------------
        int totalSales = 0;
        for (int i = 0; i < allSales.length; i++) {
            totalSales += allSales[i];
        }
 
        // -----------------------------------------------------------
        // STEP 4: Calculate the AVERAGE sales. The total is cast to a
        // double before dividing so the result keeps its decimal
        // precision instead of being truncated by integer division.
        // -----------------------------------------------------------
        double averageSales = (double) totalSales / allSales.length;
 
        // -----------------------------------------------------------
        // STEP 5: Find the MAXIMUM sale by scanning the array and
        // keeping track of the largest value found so far.
        // -----------------------------------------------------------
        int maximumSale = allSales[0];
        for (int i = 1; i < allSales.length; i++) {
            if (allSales[i] > maximumSale) {
                maximumSale = allSales[i];
            }
        }
 
        // -----------------------------------------------------------
        // STEP 6: Find the MINIMUM sale by scanning the array and
        // keeping track of the smallest value found so far.
        // -----------------------------------------------------------
        int minimumSale = allSales[0];
        for (int i = 1; i < allSales.length; i++) {
            if (allSales[i] < minimumSale) {
                minimumSale = allSales[i];
            }
        }
 
        // -----------------------------------------------------------
        // STEP 7: Display the source data as a table, reading straight
        // from the original two-dimensional array.
        // -----------------------------------------------------------
        System.out.println("QUARTERLY SALES DATA");
        System.out.println("---------------------------------------------");
        System.out.printf("%-10s%-12s%-12s%-12s%n", "", "QUARTER 1", "QUARTER 2", "QUARTER 3");
        for (int year = 0; year < numYears; year++) {
            System.out.printf("%-10s", "YEAR " + (year + 1));
            for (int quarter = 0; quarter < numQuarters; quarter++) {
                System.out.printf("%-12d", quarterlySales[year][quarter]);
            }
            System.out.println();
        }
        System.out.println();
 
        // -----------------------------------------------------------
        // STEP 8: Display the final Product Sales Report in the
        // format required by the assignment.
        // -----------------------------------------------------------
        System.out.println("PRODUCT SALES REPORT - 2025");
        System.out.println("---------------------------------------------");
        System.out.println("Total sales:     " + totalSales);
        System.out.println("Average sales:   " + Math.round(averageSales));
        System.out.println("Maximum sale:    " + maximumSale);
        System.out.println("Minimum sale:    " + minimumSale);
        System.out.println("---------------------------------------------");
    }
}
 