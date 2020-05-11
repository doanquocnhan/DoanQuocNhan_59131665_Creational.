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
public class CTHD {
    String SanPham;
    int Soluong;
    float DonGia, Chietkhau;

    public CTHD(String SanPham, int Soluong, float DonGia, float Chietkhau) {
        this.SanPham = SanPham;
        this.Soluong = Soluong;
        this.DonGia = DonGia;
        this.Chietkhau = Chietkhau;
    }

    public CTHD() {
    }

    public String getSanPham() {
        return SanPham;
    }

    public void setSanPham(String SanPham) {
        this.SanPham = SanPham;
    }

    public int getSoluong() {
        return Soluong;
    }

    public void setSoluong(int Soluong) {
        this.Soluong = Soluong;
    }

    public float getDonGia() {
        return DonGia;
    }

    public void setDonGia(float DonGia) {
        this.DonGia = DonGia;
    }

    public float getChietkhau() {
        return Chietkhau;
    }

    public void setChietkhau(float Chietkhau) {
        this.Chietkhau = Chietkhau;
    }
    

    @Override
    public String toString() {
        return "\n Chi Tiet Hoa don{" + "Sảm phẩm :" + SanPham + ", Số Lượng: " + Soluong + ", Đơn Giá: " + DonGia + ", Chiết Khấu: " + Chietkhau + '}';
    }
    
          
    
}
