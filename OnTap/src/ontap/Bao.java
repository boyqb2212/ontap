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
public class Bao extends TaiLieu {
    String ngayPH;

    public Bao() {
    }

    public Bao(String ngayPH) {
        this.ngayPH = ngayPH;
    }

    public Bao(String ngayPH, String maTaiLieu, String tenNXB, int sobanPhatHanh) {
        super(maTaiLieu, tenNXB, sobanPhatHanh);
        this.ngayPH = ngayPH;
    }

    public String getNgayPH() {
        return ngayPH;
    }

    public void setNgayPH(String ngayPH) {
        this.ngayPH = ngayPH;
    }
    @Override
    public void Nhap(){
       super.Nhap();
       Scanner Input=new Scanner(System.in);
       System.out.println("Nhap ngay phat hanh");
       this.ngayPH=Input.nextLine();
    }

    @Override
    public String toString() {
        return "Bao{" + super.toString()+ ", ngayPH=" + ngayPH + '}';
    }
    
}
