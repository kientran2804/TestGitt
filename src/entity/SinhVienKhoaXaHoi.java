package entity;

public class SinhVienKhoaXaHoi extends SinhVien{
	private Double Van;
	private Double Su;
	private Double Dia;
	public Double getVan() {
		return Van;
	}
	public void setVan(Double van) {
		Van = van;
	}
	public Double getSu() {
		return Su;
	}
	public void setSu(Double su) {
		Su = su;
	}
	public Double getDia() {
		return Dia;
	}
	public void setDia(Double dia) {
		Dia = dia;
	}
	public SinhVienKhoaXaHoi(String Ten, String Khoa, Double Van, Double Su, Double Dia) {
		super(Ten, Khoa);
		this.Van=Van;
		this.Su=Su;
		this.Dia=Dia;
		}
	public void outputXH() {
		System.out.println("Truong" + super.Truong +
						"Ten" + super.getTen() + "," +
						"Khoa" + super.getKhoa() + "," +
						"Toan" + this.getVan() + "," +
						"Ly" + this.getSu() + "," +
						"Hoa" + this.getDia());
	}
}
