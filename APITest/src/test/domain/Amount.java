package test.domain;

public class Amount {
	private int total;
	private int taxFree;
	private int vat;
	private int point;
	private int discount;
	
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getTaxFree() {
		return taxFree;
	}
	public void setTaxFree(int taxFree) {
		this.taxFree = taxFree;
	}
	public int getVat() {
		return vat;
	}
	public void setVat(int vat) {
		this.vat = vat;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	
}
