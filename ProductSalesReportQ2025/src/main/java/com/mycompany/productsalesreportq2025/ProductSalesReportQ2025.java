/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.productsalesreportq2025;

/**
 *
 * @author Student
 */
public class ProductSalesReportQ2025 {

    public static void main(String[] args) {
          
        // Two-dimensional array storing the supplied quarterly sales data
        int[][] salesData = {
            {300, 150, 700}, // YEAR 1: Q1, Q2, Q3
            {250, 200, 600}  // YEAR 2: Q1, Q2, Q3
        };

        int totalSales = 0;
        int maxSale = salesData[0][0];
        int minSale = salesData[0][0];
        int count = 0;

        // Iterate through the 2D array to process total, max, and min
        for (int i = 0; i < salesData.length; i++) {
            for (int j = 0; j < salesData[i].length; j++) {
                int currentSale = salesData[i][j];
                
                totalSales += currentSale; // Accumulate total
                
                if (currentSale > maxSale) {
                    maxSale = currentSale; // Find maximum
                }
                if (currentSale < minSale) {
                    minSale = currentSale; // Find minimum
                }
                count++; // Track number of elements for the average
            }
        }

        // Calculate average and round to the nearest whole number (to get 367)
        int averageSales = Math.round((float) totalSales / count);

        // Single-dimensional arrays to fulfill the prompt's array requirement for the report
        String[] reportLabels = {"Total sales:", "Average sales:", "Maximum sale:", "Minimum sale:"};
        int[] reportStats = {totalSales, averageSales, maxSale, minSale};

        // Output formatting to match the required report design
        System.out.println("PRODUCT SALES REPORT - 2025");
        System.out.println("-----------------------------------");
        
        // Loop through the 1D arrays to print the aligned rows
        for (int i = 0; i < reportStats.length; i++) {
            // %-17s ensures the label is left-aligned to 17 characters for a neat column
            System.out.printf("%-17s %d%n", reportLabels[i], reportStats[i]);
        }
        
        System.out.println("-----------------------------------");
    }
}
