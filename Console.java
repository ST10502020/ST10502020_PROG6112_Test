/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.st10502020_prog6112_test;

/**
 *
 * @author Student
 */
public abstract class Console{
    String deviceType;
    String storeName;
    int totalSales;

    public Console(String deviceType, String storeName, int totalSales) {
        this.deviceType = deviceType;
        this.storeName = storeName;
        this.totalSales = totalSales;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public String getStoreName() {
        return storeName;
    }

    public int getTotalSales() {
        return totalSales;
    }
    
    
    
}
