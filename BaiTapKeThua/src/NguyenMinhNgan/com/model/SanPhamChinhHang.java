package NguyenMinhNgan.com.model;

public class SanPhamChinhHang extends SanPham {
	public String toString() {
		String s = super.toString();
		return "Sản phẩm chính hãng, thông tin: "+s+",thuế: "+super.thue;
	}
}
