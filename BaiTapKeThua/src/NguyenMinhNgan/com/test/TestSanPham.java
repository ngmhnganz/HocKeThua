package NguyenMinhNgan.com.test;

import NguyenMinhNgan.com.model.SanPham;
import NguyenMinhNgan.com.model.SanPhamChinhHang;
import NguyenMinhNgan.com.model.SanPhamXachTay;

public class TestSanPham {

	public static void main(String[] args) {
		SanPhamChinhHang son = new SanPhamChinhHang();
		son.setGia(20000);
		son.setMa("2");
		son.setSoLuong(3);
		son.setTen("Son");
		son.setThue(0.1);
		System.out.println(son);
		
		SanPhamXachTay tuixach = new SanPhamXachTay();
		tuixach.setGia(45000);
		tuixach.setMa("2");
		tuixach.setSoLuong(3);
		tuixach.setTen("Túi Xách");
		System.out.println(tuixach);
		
		SanPham ao = new SanPham();
		ao.setGia(17000);
		ao.setMa("4");
		ao.setSoLuong(2);
		ao.setTen("Áo");
		System.out.println(ao);
		
		ao = new SanPhamChinhHang();
		ao.setGia(17000);
		ao.setMa("4");
		ao.setSoLuong(2);
		ao.setThue(0.2);
		System.out.println(ao);
	}

}
