package Assignment_trungnqPH45090_MD18401;

import java.util.ArrayList;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        menu();
    }

    private static void menu() {
        ArrayList<nhanVien> listNhanVien = new ArrayList<>();
        ChucNang chucNang = new ChucNang();
        do {
            System.out.println("|||Truong Chinh Quan Ly Nhan Su va Tien Luong|||");
            System.out.println("+============MENU============+");
            System.out.println("1.Nhap danh sach nhan vien tu ban phim.");
            System.out.println("2.Xuat danh sach nhan vien tu ban phim.");
            System.out.println("3.Tim va hien thi nhan vien theo ma nhap tu ban phim.");
            System.out.println("4.Xoa nhan vien theo mã nhập tu ban phim.");
            System.out.println("5.Cap nhat thong tin nhan vien theo ma nhap tu ban phim.");
            System.out.println("6.Tim cac nhan vien theo khoang luong nhap tu ban phim.");
            System.out.println("7.Sap xep nhan vien theo ho va ten.");
            System.out.println("8.Sap xep nhan vien theo thu nhap.");
            System.out.println("9.Xuat 5 nhan vien co thu nhap cao nhat.");
            System.out.println("0.Thoat");
            System.out.println("+=============================+");
            System.out.print("Moi ban nhap :");
            int userChoose = input.nextInt();
            switch (userChoose){
                case 1:
                    chucNang.NhapDanhSachNV(listNhanVien);
                    break;
                case 2:
                    chucNang.XuatDanhSachNV(listNhanVien);
                    break;
                case 3:
                    chucNang.TimVaHienThiTheoMaNV(listNhanVien);
                    break;
                case 4:
                    chucNang.XoaNVTheoMa(listNhanVien);
                    break;
                case 5:
                    chucNang.CapNhatThongTinNVTheoMa(listNhanVien);
                    break;
                case 6:
                    chucNang.TimCacNhanVienTheoLuong(listNhanVien);
                    break;
                case 7:
                    chucNang.SapXepNVTheoHoTen(listNhanVien);
                    break;
                case 8:
                    chucNang.SapXepNVTheoLuong(listNhanVien);
                    break;
                case 9:
                    chucNang.Top5NVThuNhaoCao(listNhanVien);
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Nhap sai !!! vui long nhap lai");
                    break;
            }
        }while (true);
    }

}