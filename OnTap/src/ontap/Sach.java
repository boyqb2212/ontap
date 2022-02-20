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
public class Sach extends TaiLieu{
    String tenTG;
    int soTrang;

    public Sach() {
    }

    public Sach(String tenTG, int soTrang) {
        this.tenTG = tenTG;
        this.soTrang = soTrang;
    }

    public Sach(String tenTG, int soTrang, String maTaiLieu, String tenNXB, int sobanPhatHanh) {
        super(maTaiLieu, tenNXB, sobanPhatHanh);
        this.tenTG = tenTG;
        this.soTrang = soTrang;
    }

    public String getTenTG() {
        return tenTG;
    }

    public void setTenTG(String tenTG) {
        this.tenTG = tenTG;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }
    @Override
    public void Nhap(){
        super.Nhap();
        Scanner Input=new Scanner(System.in);
        System.out.println("Nhap ten tac gia");
        this.tenTG=Input.nextLine();
        System.out.println("Nhap so trang");
        this.soTrang=Input.nextInt();
        Input.nextLine();
    }

    @Override
    public String toString() {
        return "Sach{" + super.toString()+ ", tenTG=" + tenTG + ", soTrang=" + soTrang + '}';
    }
    
}
