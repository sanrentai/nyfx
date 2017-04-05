

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.json.JSONException;
import org.json.JSONObject;

//import com.kaifu.util.HttpBase;
//import com.kaifu.util.Utils;
import com.sun.corba.se.impl.javax.rmi.CORBA.Util;

import jdk.nashorn.internal.ir.Terminal;


public class orderDemo {

	public static String url = "https://order.global2ch.com/payform/unionpay_online";
	public static final String merchantId = "898210173990915";
	private static final String termNo = "78900915";
	private static final String mackey = "123456789012345";
	
	public static void main(String[] args) throws Exception {
		
		test2();
	}
	
	public static void test1() throws Exception{
		SimpleDateFormat dateFormat1 = new SimpleDateFormat("yyyyMMddHHmmss");
		SimpleDateFormat dateFormat2 = new SimpleDateFormat("yyyyMMddHHmmssSSS");
		JSONObject json = new JSONObject();
		json.put("sendTime", dateFormat1.format(new Date()));
		json.put("sendSeqId", dateFormat2.format(new Date()));
		json.put("transType", "B001");
		json.put("merchantId", merchantId);
		json.put("termNo", termNo);
		json.put("transAmt", "1");
		json.put("orderType", "1001");
		json.put("body", URLEncoder.encode("消费测试订单2,消费测试订单2,消费测试订单2", "UTF-8"));
		//json.put("cardNo", "622884514");
		//json.put("notifyUrl", "http://220.249.19.38:8082/payform_online/unionpay_backNotify_test");
		json.put("notifyUrl", "http://211.137.43.254:10009/payform_online/unionpay_backNotify_test");
		json.put("frontNotifyUrl", "http://220.249.19.38:8082/payform_online/unionpay_frontNotify_test");
		json.put("mac", makeMac(json, mackey));
		
		
		HashMap<String, String> params = new HashMap<>();
		params.put("data", json.toString());
		
		url += "?data=" + json.toString();
		doGet(url);
//		HttpBase.doPost(url, params);
	}
	
	public static void test2() throws Exception{
		SimpleDateFormat dateFormat1 = new SimpleDateFormat("yyyyMMddHHmmss");
		SimpleDateFormat dateFormat2 = new SimpleDateFormat("yyyyMMddHHmmssSSS");
		JSONObject json = new JSONObject();
		json.put("sendTime", dateFormat1.format(new Date()));
		json.put("sendSeqId", dateFormat2.format(new Date()));
		json.put("transType", "B003");
		json.put("merchantId", merchantId);
		json.put("termNo", termNo);
		json.put("orgPlatOrderId", "20170401144009749121361");
		json.put("mac", makeMac(json, mackey));
		
		url += "?data=" + json.toString();
		
		doGet(url);
	}
	
	public static void test3() throws Exception{
		SimpleDateFormat dateFormat1 = new SimpleDateFormat("yyyyMMddHHmmss");
		SimpleDateFormat dateFormat2 = new SimpleDateFormat("yyyyMMddHHmmssSSS");
		JSONObject json = new JSONObject();
		json.put("sendTime", dateFormat1.format(new Date()));
		json.put("sendSeqId", dateFormat2.format(new Date()));
		json.put("transType", "B002");
		json.put("merchantId", merchantId);
		json.put("termNo", termNo);
		json.put("transAmt", "2");
		json.put("orderType", "1001");
		json.put("body", URLEncoder.encode("消费测试订单2", "UTF-8"));
		//json.put("cardNo", "622847");
		json.put("notifyUrl", "http://220.249.19.38:8082/payform/unionpay_backNotify_test");
		json.put("frontNotifyUrl", "http://220.249.19.38:8082/payform/unionpay_frontNotify_test");
		json.put("orgPlatOrderId", "20161124183414023000416");
		json.put("mac", makeMac(json, mackey));
		
		url += "?data=" + json.toString();
		
		doGet(url);
	}
	
	public static void test4() throws Exception{
		SimpleDateFormat dateFormat1 = new SimpleDateFormat("yyyyMMddHHmmss");
		SimpleDateFormat dateFormat2 = new SimpleDateFormat("yyyyMMddHHmmssSSS");
		JSONObject json = new JSONObject();
		json.put("sendTime", dateFormat1.format(new Date()));
		json.put("sendSeqId", dateFormat2.format(new Date()));
		json.put("transType", "B004");
		json.put("merchantId", merchantId);
		json.put("termNo", termNo);
		json.put("orgPlatOrderId", "20161124183414023000416");
		json.put("mac", makeMac(json, mackey));
		
		url += "?data=" + json.toString();
		
		doGet(url);
	}
	
	public static String doGet(String url) throws Exception{
		URL url2 = new URL(url);
		HttpURLConnection connection2 = (HttpURLConnection) url2.openConnection();
		connection2.setDoOutput(true);
		connection2.setDoInput(true);
		connection2.setReadTimeout(60 * 1000);
		connection2.setRequestProperty("Content-type", "text/html");
		connection2.setRequestProperty("Accept-Charset", "UTF-8");
		connection2.setRequestProperty("contentType", "UTF-8");
		connection2.setRequestMethod("GET");
		connection2.connect();
		
		InputStream in2 = connection2.getInputStream();
		BufferedReader reader2 = new BufferedReader(new InputStreamReader(in2));
		String line = null,retData = "";
		while((line = reader2.readLine()) != null){
			retData += line;
		}
		
		System.err.println("request:" + url);
		System.err.println("response:" + retData);
		
		return retData;
	}
	
	public static String makeMac(JSONObject json,String macKey){
		Map<String, String> contentData = (Map<String, String>) parserToMap(json.toString());
		String macStr="";
		Object[] key_arr = contentData.keySet().toArray();
		Arrays.sort(key_arr);
		for (Object key : key_arr) {
			Object value = contentData.get(key);
			if (value != null ) {
				if (!key.equals("mac") && !key.equals("body")) {
					macStr+= value.toString();
				}
			}
		}
		System.err.println("macStr:" + macStr + macKey);
		String mac = getMD5Str(macStr + macKey);
		System.err.println("mac:" + mac);
		return mac;
	}
	public static HashMap<String, String> parserToMap(String s){  
	    Map map=new HashMap();  
	    JSONObject json;
		try {
			json = new JSONObject(s);
			Iterator keys=json.keys();  
		    while(keys.hasNext()){  
		        String key=(String) keys.next();  
		        String value=json.get(key).toString();    
		        map.put(key, value); 
		    }  
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    return (HashMap<String, String>)map;  
	}
	
	public static String getMD5Str(String str) {
		MessageDigest messageDigest = null;
		try {
			messageDigest = MessageDigest.getInstance("MD5");
			messageDigest.reset();
			messageDigest.update(str.getBytes("UTF-8"));
		} catch (NoSuchAlgorithmException e) {
			System.out.println("NoSuchAlgorithmException caught!");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		byte[] byteArray = messageDigest.digest();
		StringBuffer md5StrBuff = new StringBuffer();
		for (int i = 0; i < byteArray.length; i++) {
			if (Integer.toHexString(0xFF & byteArray[i]).length() == 1)
				md5StrBuff.append("0").append(
						Integer.toHexString(0xFF & byteArray[i]));
			else
				md5StrBuff.append(Integer.toHexString(0xFF & byteArray[i]));
		}
		return md5StrBuff.toString();
	}
	
}
