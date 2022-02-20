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
public class TapChi extends TaiLieu {
    int soPH;
    int thangPH;

    public TapChi() {
    }

    public TapChi(int soPH, int thangPH) {
        this.soPH = soPH;
        this.thangPH = thangPH;
    }

    public TapChi(int soPH, int thangPH, String maTaiLieu, String tenNXB, int sobanPhatHanh) {
        super(maTaiLieu, tenNXB, sobanPhatHanh);
        this.soPH = soPH;
        this.thangPH = thangPH;
    }

    public int getSoPH() {
        return soPH;
    }

    public void setSoPH(int soPH) {
        this.soPH = soPH;
    }

    public int getThangPH() {
        return thangPH;
    }

    public void setThangPH(int thangPH) {
        this.thangPH = thangPH;
    }
    @Override
    public void Nhap(){
        super.Nhap();
        Scanner Input=new Scanner(System.in);
        System.out.println("Nhap so phat hanh");
        this.soPH=Input.nextInt();
        System.out.println("Nhap thang phat hanh");
        this.thangPH=Input.nextInt();
        Input.nextLine();
    }

    @Override
    public String toString() {
        return "TapChi{" +super.toString() + ", soPH=" + soPH + ", thangPH=" + thangPH + '}';
    }
    
}
