# Product Sales Report - 2025

## Overview
This is a simple Java console application designed to process and report on product sales data for a local retail company. It analyzes quarterly sales data spanning a two-year period using two-dimensional arrays for data storage and single-dimensional arrays for formatting the final report.

## Features
The program calculates the following metrics based on the hardcoded sales data:
*   **Total sales:** The sum of all sales across all quarters and years.
*   **Average sales:** The mean sales value, rounded to the nearest whole number.
*   **Maximum sale:** The highest single quarterly sale figure.
*   **Minimum sale:** The lowest single quarterly sale figure.

## Data Provided
|        | QUARTER 1 | QUARTER 2 | QUARTER 3 |
|--------|-----------|-----------|-----------|
| YEAR 1 | 300       | 150       | 700       |
| YEAR 2 | 250       | 200       | 600       |

## Expected Result
When you compile and run `ProductSalesReport.java`, the terminal or console output will exactly match the required format below:

```text
PRODUCT SALES REPORT - 2025
-----------------------------------
Total sales:      2200
Average sales:    367
Maximum sale:     700
Minimum sale:     150
-----------------------------------
```

## How to Run
1. Ensure you have the Java Development Kit (JDK) installed on your system.
2. Save the provided Java code in a file named `ProductSalesReport.java`.
3. Open your terminal or command prompt and navigate to the directory where the file is saved.
4. Compile the file using the command: `javac ProductSalesReport.java`
5. Run the compiled application using the command: `java ProductSalesReport`