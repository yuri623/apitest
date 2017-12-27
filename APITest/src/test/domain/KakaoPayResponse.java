package test.domain;

import java.util.Date;

public class KakaoPayResponse {
	private String aid;
	private String cid;
	private String tid;
	private String sid;
	private String partnerOrderId;
	private String partnerUserId;
	private String paymentMethodType;
	private Amount amount;
	private CardInfo cardInfo;
	private String itemName;
	private String itmeCode;
	private int quantity;
	private Date approvedAt;
	private String payLoad;
	private String nextRedirectAppURL;
	private String nextRedirectMobileURL;
	private String nextRedirectPcURL;
	private String androidAppScheme;
	private String iosAppScheme;
	private Date createAt;
	private String msg;
	
	
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	private int code;
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getAid() {
		return aid;
	}
	public void setAid(String aid) {
		this.aid = aid;
	}
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
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
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
	public String getPaymentMethodType() {
		return paymentMethodType;
	}
	public void setPaymentMethodType(String paymentMethodType) {
		this.paymentMethodType = paymentMethodType;
	}
	public Amount getAmount() {
		return amount;
	}
	public void setAmount(Amount amount) {
		this.amount = amount;
	}
	public CardInfo getCardInfo() {
		return cardInfo;
	}
	public void setCardInfo(CardInfo cardInfo) {
		this.cardInfo = cardInfo;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getItmeCode() {
		return itmeCode;
	}
	public void setItmeCode(String itmeCode) {
		this.itmeCode = itmeCode;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Date getApprovedAt() {
		return approvedAt;
	}
	public void setApprovedAt(Date approvedAt) {
		this.approvedAt = approvedAt;
	}
	public String getPayLoad() {
		return payLoad;
	}
	public void setPayLoad(String payLoad) {
		this.payLoad = payLoad;
	}
	public String getNextRedirectAppURL() {
		return nextRedirectAppURL;
	}
	public void setNextRedirectAppURL(String nextRedirectAppURL) {
		this.nextRedirectAppURL = nextRedirectAppURL;
	}
	public String getNextRedirectMobileURL() {
		return nextRedirectMobileURL;
	}
	public void setNextRedirectMobileURL(String nextRedirectMobileURL) {
		this.nextRedirectMobileURL = nextRedirectMobileURL;
	}
	public String getNextRedirectPcURL() {
		return nextRedirectPcURL;
	}
	public void setNextRedirectPcURL(String nextRedirectPcURL) {
		this.nextRedirectPcURL = nextRedirectPcURL;
	}
	public String getAndroidAppScheme() {
		return androidAppScheme;
	}
	public void setAndroidAppScheme(String androidAppScheme) {
		this.androidAppScheme = androidAppScheme;
	}
	public String getIosAppScheme() {
		return iosAppScheme;
	}
	public void setIosAppScheme(String iosAppScheme) {
		this.iosAppScheme = iosAppScheme;
	}
	public Date getCreateAt() {
		return createAt;
	}
	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}
	@Override
	public String toString() {
		return "KakaoPayResponse [cid="+cid+", partnerOrderId=" + partnerOrderId + ", partnerUserId=" + partnerUserId
				+ ", paymentMethodType=" + paymentMethodType + ", amount=" + amount + ", cardInfo=" + cardInfo
				+ ", itemName=" + itemName + ", itmeCode=" + itmeCode + ", createAt=" + createAt + ", msg=" + msg
				+ ", code=" + code + "]";
	}
	
	
}
