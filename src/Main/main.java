package Main;

import java.util.ArrayList;

import entity.SinhVien;
import entity.SinhVienKhoaTuNhien;
import entity.SinhVienKhoaXaHoi;

public class main {
	public static void main(String args[]) {
		//Sinh Vien Khoa Tu Nhien
		SinhVienKhoaTuNhien sv1=new SinhVienKhoaTuNhien("Nam","Khoa Tu Nhien",9.0,5.0,10.0);
		SinhVienKhoaTuNhien sv2=new SinhVienKhoaTuNhien("Sang","Khoa Tu Nhien",9.0,5.0,10.0);
		SinhVienKhoaTuNhien sv3=new SinhVienKhoaTuNhien("Vinh","Khoa Tu Nhien",9.0,5.0,10.0);
		SinhVienKhoaTuNhien sv4=new SinhVienKhoaTuNhien("Thang","Khoa Tu Nhien",9.0,5.0,10.0);
		SinhVienKhoaTuNhien sv5=new SinhVienKhoaTuNhien("Dat","Khoa Tu Nhien",9.0,5.0,10.0);
		
		ArrayList<SinhVienKhoaTuNhien> arrListSVKTN =new ArrayList<>();
		arrListSVKTN.add(sv1);
		arrListSVKTN.add(sv2);
		arrListSVKTN.add(sv3);
		arrListSVKTN.add(sv4);
		arrListSVKTN.add(sv5);
		
		//Sinh Vien Khoa Xa Hoi
		SinhVienKhoaXaHoi sv6=new SinhVienKhoaXaHoi("Kien","Khoa Xa Hoi",9.0,5.0,10.0);
		SinhVienKhoaXaHoi sv7=new SinhVienKhoaXaHoi("Lai","Khoa Xa Hoi",9.0,5.0,10.0);
		SinhVienKhoaXaHoi sv8=new SinhVienKhoaXaHoi("Thanh","Khoa Xa Hoi",9.0,5.0,10.0);
		SinhVienKhoaXaHoi sv9=new SinhVienKhoaXaHoi("Khanh","Khoa Xa Hoi",9.0,5.0,10.0);
		SinhVienKhoaXaHoi sv10=new SinhVienKhoaXaHoi("Tan","Khoa Xa Hoi",9.0,5.0,10.0);
		
		ArrayList<SinhVienKhoaXaHoi> arrListSVKXH =new ArrayList<>();
		arrListSVKXH.add(sv6);
		arrListSVKXH.add(sv7);
		arrListSVKXH.add(sv8);
		arrListSVKXH.add(sv9);
		arrListSVKXH.add(sv10);
		
		
		
//		SinhVien SV[]= {arrListSVKXH,arrListSVKTN};
//		
//		System.out.println(">> Truong "+SinhVien.Truong);
//		System.out.println(">> Ten "+sv1.getTen());
//		System.out.println(">> Ten "+sv2.getTen());
//		
//		SinhVienKhoaTuNhien arr[]= new SinhVienKhoaTuNhien[2];
//		arr[0] =sv1;
//		arr[1] =sv2;
//		
//		SinhVienKhoaTuNhien arr2[] = {sv1,sv2};
//		System.out.println(">> arr2.02.getTen = "+arr2[1].getTen());
//		
//		System.out.println(">>Get(0): "+arrListSVKTN.get(0));
//		System.out.println(">>Get(1): "+arrListSVKTN.get(1));
//		System.out.println(">>Size: "+arrListSVKTN.size());
		
		System.out.println("Khoa Tu Nhien");
		for(SinhVienKhoaTuNhien e : arrListSVKTN) {
			e.output();
		}
		System.out.println(">>Size: "+arrListSVKTN.size());
		for(SinhVienKhoaTuNhien tb : arrListSVKTN) {
			tb.DTB();
		}
		
		System.out.println("Khoa Tu Xa Hoi");
		for(SinhVienKhoaXaHoi e : arrListSVKXH) {
			e.outputXH();
			
		}
		System.out.println(">>Size: "+arrListSVKXH.size());
		
		
		
//		System.out.println("Java 8");
//		arrListSVKTN.forEach(e->{
//			e.output();
//		});
		
//		Bài Tập:
//			Tạo các methods cho SVKXH
//			Tạo 5 SV:2XH/3TN note giá trị bắt kì
//			Đếm SV Khoa
//			Tìm Sv TN( trên TB/Dưới Tb)
//			Tìm SV XH(Tên)
		
	}
	
}