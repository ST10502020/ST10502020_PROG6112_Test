/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.st10502020_prog6112_test;

/**
 *
 * @author Student
 */
import java.util.*;
public class ST10502020_PROG6112_Test {
    public static int total = 0;
    public static String mostSales;

    public static void main(String[] args) {
        int rows = 3;
        int columns = 3;
        
        String[] cities = {"Cape Town", "Port Elizabeth", "Pretoria"};
        String[] console = {"PS5", "XBOX", "SWITCH"};
        int[][] yearlySales = {{1000, 2000, 3000},
                               {2000, 3000, 4000},
                               {1500, 1100, 1200}};
        
        System.out.println("----------------------------------");
        System.out.println("GAMING CONSOLE REPORT");
        System.out.println("----------------------------------");
        System.out.println("                PS5   XBOX SWITCH");
        System.out.println("Cape Town       " + yearlySales[0][0] + "  " + yearlySales[0][1] + " " + yearlySales[0][2]);
        System.out.println("PORT ELIZABETH  " + yearlySales[1][0] + "  " + yearlySales[1][1] + " " + yearlySales[1][2]) ;
        System.out.println("PRETORIA        " +yearlySales[2][0] + "  " + yearlySales[1][1] + " " + yearlySales[2][2]);
        
        System.out.println("----------------------------------");
        System.out.println("CONSOLE SALES TOTAL FOR WACH CITY");
        System.out.println("----------------------------------");
        for(int i = 0; i<rows; i++){
            for(int p = 0; p<columns; p++){
                total = total + yearlySales[p][p];
            }
            System.out.println(cities[i] + " " + total);
        }
    }
}
