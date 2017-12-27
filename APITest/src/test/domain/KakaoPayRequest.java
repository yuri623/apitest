package test.domain;

public class KakaoPayRequest {
	private String cid;
	private String tid;
	private String pgToken;
	private String partnerOrderId;
	private String partnerUserId;
	private String itemName;
	private String itemCode;
	private int quantity;
	private int totalAmount;
	private int taxFreeAmount;
	private int vatAmount;
	private String approvalURL;
	private String cancelURL;
	private String failURL;
	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
	public String getTid() {
		return tid;
	}
	public void setTid(String tid) {
		this.tid = tid;
	}
	public String getPgToken() {
		return pgToken;
	}
	public void setPgToken(String pgToken) {
		this.pgToken = pgToken;
	}
	public String getPartnerOrderId() {
		return partnerOrderId;
	}
	public void setPartnerOrderId(String partnerOrderId) {
		this.partnerOrderId = partnerOrderId;
	}
	public String getPartnerUserId() {
		return partnerUserId;
	}
	public void setPartnerUserId(String partnerUserId) {
		this.partnerUserId = partnerUserId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getItemCode() {
		return itemCode;
	}
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(int totalAmount) {
		this.totalAmount = totalAmount;
	}
	public int getTaxFreeAmount() {
		return taxFreeAmount;
	}
	public void setTaxFreeAmount(int taxFreeAmount) {
		this.taxFreeAmount = taxFreeAmount;
	}
	public int getVatAmount() {
		return vatAmount;
	}
	public void setVatAmount(int vatAmount) {
		this.vatAmount = vatAmount;
	}
	public String getApprovalURL() {
		return approvalURL;
	}
	public void setApprovalURL(String approvalURL) {
		this.approvalURL = approvalURL;
	}
	public String getCancelURL() {
		return cancelURL;
	}
	public void setCancelURL(String cancelURL) {
		this.cancelURL = cancelURL;
	}
	public String getFailURL() {
		return failURL;
	}
	public void setFailURL(String failURL) {
		this.failURL = failURL;
	}
	@Override
	public String toString() {
		return "KakaoPayRequest [cid=" + cid + ", tid=" + tid + ", pgToken=" + pgToken + ", partnerOrderId="
				+ partnerOrderId + ", quantity=" + quantity + ", totalAmount=" + totalAmount + ", approvalURL="
				+ approvalURL + ", cancelURL=" + cancelURL + ", failURL=" + failURL + "]";
	}
	
	
}
