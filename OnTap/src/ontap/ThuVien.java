/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ontap;

import static java.lang.System.exit;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author at160
 */
public class ThuVien {
    ArrayList<TaiLieu> thuvien=new ArrayList<>();

    public ThuVien() {
    }
    public void MeNu(){
        Scanner Input=new Scanner(System.in);
        while(true){
            System.out.println("1.Nhap thong tin");
            System.out.println("2.Hien thi thong tin");
            System.out.println("3.Tim kiem tai lieu");
            System.out.println("0.Thoat");
            int luachon=Input.nextInt();
            switch(luachon){
                case 1:{
                    System.out.println("1.Sach");
                    System.out.println("2.Tap Chi");
                    System.out.println("3.Bao");
                    int luachon1=Input.nextInt();
                    switch(luachon1){
                        case 1:{
                            Sach s=new Sach();
                            s.Nhap();
                            this.thuvien.add(s);
                        }break;
                        case 2:{
                            TapChi s=new TapChi();
                            s.Nhap();
                            this.thuvien.add(s);
                        }break;
                        case 3:{
                            Bao s=new Bao();
                            s.Nhap();
                            this.thuvien.add(s);
                        }break;
                    }
                }break;
                case 2:{
                    System.out.println("1.Sach");
                    System.out.println("2.Tap Chi");
                    System.out.println("3.Bao");
                    int luachon2=Input.nextInt();
                     switch(luachon2){
                        case 1:{
                            for(TaiLieu x:thuvien){
                                if( x instanceof Sach){
                                   System.out.println(x.toString());
                                }
                            }
                        }break;
                        case 2:{
                            for(TaiLieu x:thuvien){
                                if( x instanceof TapChi){
                                   System.out.println(x.toString());
                                }
                            }
                        }break;
                        case 3:{
                            for(TaiLieu x:thuvien){
                                if( x instanceof Bao){
                                   System.out.println(x.toString());
                                }
                            }
                        }break;
                    }
                }break;
                case 3:{
                    System.out.println("1.Sach");
                    System.out.println("2.Tap Chi");
                    System.out.println("3.Bao");
                    int luachon3=Input.nextInt();
                    Input.nextLine();
                    switch(luachon3){
                        case 1:{
                            
                            System.out.println("Nhap ma Sach muon tim kiem");
                            String str=Input.nextLine();
                             
                        
                            for(TaiLieu x:thuvien){
                                if( x instanceof Sach){
                                   if(((Sach) x).maTaiLieu.equalsIgnoreCase(str)){
                                       System.out.println(x.toString());
                                       break;
                                   }
                                }
                            }
                        }break;
                        case 2:{
                            
                            System.out.println("Nhap ma TapChi muon tim kiem");
                            String str=Input.nextLine();
                             
                        
                            for(TaiLieu x:thuvien){
                                if( x instanceof TapChi){
                                   if(((TapChi) x).maTaiLieu.equalsIgnoreCase(str)){
                                       System.out.println(x.toString());
                                       break;
                                   }
                                }
                            }
                        }break;
                        case 3:{
                            
                            System.out.println("Nhap ma Bao muon tim kiem");
                            String str=Input.nextLine();
                             
                        
                            for(TaiLieu x:thuvien){
                                if( x instanceof Sach){
                                   if(((Bao) x).maTaiLieu.equalsIgnoreCase(str)){
                                       System.out.println(x.toString());
                                       break;
                                   }
                                }
                            }
                        }break;
                }
                
            }break;
            case 0:{
                    exit(0);
                }break;
        }
    }
}
}
