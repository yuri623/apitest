package test.kakaoPay;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

import test.domain.KakaoPayRequest;
import test.domain.KakaoPayResponse;

public class KakaoPayTest {
	public static void main(String[] args) throws Exception {
		KakaoPayTest.readyPay();
	}
	
	public static void readyPay() throws Exception {
		HttpClient httpClient = new DefaultHttpClient();
		
		String url = "https://kapi.kakao.com/v1/payment/ready";
		HttpPost httpPost = new HttpPost(url);
		httpPost.setHeader("Accept", "application/json");
		httpPost.setHeader("Content-Type", "application/x-www-form-urlencoded;charset=utf-8");
		httpPost.setHeader("Authorization", "KakaoAK 4b28333571585dcb2ddd1265aa46c29b");
		System.out.println(httpPost);
		
		KakaoPayRequest sendObject = new KakaoPayRequest();
		sendObject.setCid("TC0ONETIME");
		sendObject.setPartnerOrderId("user01");
		sendObject.setPartnerUserId("user01");
		sendObject.setItemName("ÄÄÇ»ÅÍ");
		sendObject.setQuantity(1);
		sendObject.setTotalAmount(2200);
		sendObject.setVatAmount(200);
		sendObject.setTaxFreeAmount(0);
		sendObject.setApprovalURL("http://127.0.0.1:8080");
		sendObject.setFailURL("http://127.0.0.1:8080");
		sendObject.setCancelURL("http://127.0.0.1:8080");
		
		ObjectMapper objectMapper = new ObjectMapper();
		String jsonValue = objectMapper.writeValueAsString(sendObject);
		System.out.println("####"+jsonValue);
		HttpEntity httpEntity = new StringEntity(jsonValue, "utf-8");
		
		httpPost.setEntity(httpEntity);
		System.out.println("::::"+httpPost);
		HttpResponse httpResponse = httpClient.execute(httpPost);
		
		System.out.println(httpResponse);
		System.out.println();
		
		HttpEntity httpEntity01 = httpResponse.getEntity();
		
		InputStream is = httpEntity01.getContent();
		BufferedReader br = new BufferedReader(new InputStreamReader(is, "utf-8"));
		
		JSONObject resObject = (JSONObject)JSONValue.parse(br);
		System.out.println(resObject);
		ObjectMapper objectMapper01 = new ObjectMapper();
		KakaoPayResponse responseDomain = objectMapper01.readValue(resObject.toString(), KakaoPayResponse.class);
		System.out.println(responseDomain);
		
	}
	
	public void connectPay() {
		
	}
	
	public void allowPay() {
		
	}
}
