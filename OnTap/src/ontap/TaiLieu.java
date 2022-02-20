/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ontap;

import java.util.Scanner;

/**
 *
 * @author at160
 */
public class TaiLieu {
    String maTaiLieu;
    String tenNXB;
    int sobanPhatHanh;

    public TaiLieu() {
    }

    public TaiLieu(String maTaiLieu, String tenNXB, int sobanPhatHanh) {
        this.maTaiLieu = maTaiLieu;
        this.tenNXB = tenNXB;
        this.sobanPhatHanh = sobanPhatHanh;
    }

    public String getMaTaiLieu() {
        return maTaiLieu;
    }

    public void setMaTaiLieu(String maTaiLieu) {
        this.maTaiLieu = maTaiLieu;
    }

    public String getTenNXB() {
        return tenNXB;
    }

    public void setTenNXB(String tenNXB) {
        this.tenNXB = tenNXB;
    }

    public int getSobanPhatHanh() {
        return sobanPhatHanh;
    }

    public void setSobanPhatHanh(int sobanPhatHanh) {
        this.sobanPhatHanh = sobanPhatHanh;
    }
    public void Nhap(){
        Scanner Input=new Scanner(System.in);
        System.out.println("Nhap ma tai lieu");
        this.maTaiLieu=Input.nextLine();
        System.out.println("Nhap ten nha xuat ban");
        this.tenNXB=Input.nextLine();
        System.out.println("Nhap so ban phat hanh");
        this.sobanPhatHanh=Input.nextInt();
        Input.nextLine();
    }

    @Override
    public String toString() {
        return "maTaiLieu=" + maTaiLieu + ", tenNXB=" + tenNXB + ", sobanPhatHanh=" + sobanPhatHanh ;
    }
    
}
