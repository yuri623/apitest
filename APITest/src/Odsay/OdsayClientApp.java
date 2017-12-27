package Odsay;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URLEncoder;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.codehaus.jackson.map.ObjectMapper;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

public class OdsayClientApp {

	public static void main(String[] args) throws Exception{
		OdsayClientApp.getTrainInfo();

	}
	
	public static void getTrainInfo() throws Exception{
		HttpClient httpclient = new DefaultHttpClient();
		
		String url = "https://api.odsay.com/api/trainServiceTime?apiKey=0ObaGjz7q8kLrzbsVutNT0qpRKpduNy7cnS9HDogmsk"
				+ "&startStationID=3300128"
				+ "&endStationID=3300108";
		
		HttpGet httpGet = new HttpGet(url);
		httpGet.setHeader("Accept", "application/json");
		httpGet.setHeader("Content-Type", "application/json;charset=utf-8");
		
		HttpResponse res = httpclient.execute(httpGet);
		
		System.out.println(res);
		System.out.println();
		
		HttpEntity httpEntity = res.getEntity();
		
		InputStream is = httpEntity.getContent();
		BufferedReader br = new BufferedReader(new InputStreamReader(is, "utf-8"));
		
		JSONObject jsonobj = (JSONObject)JSONValue.parse(br);
		System.out.println(jsonobj);
	}

}
