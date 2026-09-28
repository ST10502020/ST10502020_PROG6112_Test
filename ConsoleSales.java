/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.st10502020_prog6112_test;

/**
 *
 * @author Student
 */
public class ConsoleSales extends Console{
    
    public ConsoleSales(String deviceType, String storeName, int totalSales) {
        super(deviceType, storeName, totalSales);
    }
    public void printReport(){
        System.out.print("Device Type :" + deviceType +
                "Store Name :" + storeName +
                "Total Sales :" + totalSales 
        );
    }
    
}
