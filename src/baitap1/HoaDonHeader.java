/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap1;

/**
 *
 * @author Nhan
 */
public class HoaDonHeader {
    String IDOder, Date, NameCustomer;

    public HoaDonHeader(String IDOder, String Date, String NameCustomer) {
        this.IDOder = IDOder;
        this.Date = Date;
        this.NameCustomer = NameCustomer;
    }

    @Override
    public String toString() {
        return "HoaDonHeader{" + "Mã Khách Hàng:=" + IDOder + ", Ngày bán:=" + Date + ", Họ tên khách hàng=" + NameCustomer + '}';
    }
    
    
}

