package NguyenMinhNgan.com.model;

public class SanPham {
	protected String ma;
	protected String ten;
	protected int soLuong;
	protected double gia;
	protected double thue;
	public String getMa() {
		return ma;
	}
	public double getThue() {
		return thue;
	}
	public void setThue(double thue) {
		this.thue = thue;
	}
	public void setMa(String ma) {
		this.ma = ma;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	public double getGia() {
		return gia;
	}
	public void setGia(double gia) {
		this.gia = gia;
	}
	public SanPham(String ma, String ten, int soLuong, double gia) {
		super();
		this.ma = ma;
		this.ten = ten;
		this.soLuong = soLuong;
		this.gia = gia;
		thue=0;
	}
	public SanPham() {
		super();
	}
	@Override
	public String toString() {
		return "Tên: "+ten+", mã: "+ma+",số Lượng: "+soLuong+",giá: "+gia;
	}
}
