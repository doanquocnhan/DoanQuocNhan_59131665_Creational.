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
public class BuildMain {
    public static void main(String[] args) {
        HoaDon hoaDon = new HoaDon.HoaDonBulder()
                            .addHoaDonHearder(new HoaDonHeader("HD00001", "12/5/1999", "Nguyễn Thế Phong"))
                            .addCTHD(new CTHD("Áo sơ mi nam tay dài", 1, 150000, 10))
                            .Build();
        System.out.println(hoaDon.toString());
    }
}
