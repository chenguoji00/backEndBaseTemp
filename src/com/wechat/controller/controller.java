package com.wechat.controller;

import java.io.IOException;
import java.io.InputStream;
import java.io.Writer;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wechat.common.R;
import com.wechat.po.user;
import com.wechat.service.userService;

import com.aliyuncs.CommonRequest;
import com.aliyuncs.CommonResponse;
import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.profile.DefaultProfile;

@Controller
public class controller {
	@Autowired
	private userService userService;

	@RequestMapping({ "/add_user" })
	@ResponseBody
	public void add_user(user u, HttpServletResponse response, HttpServletRequest request)
			throws ServletException, IOException {
		response.setContentType("text/json;charset=UTF-8");
		response.setContentType("text/html;charset=utf-8");

		response.setHeader("Access-Control-Allow-Origin", "*");

		response.setHeader("Access-Control-Allow-Methods", "GET,POST");
		this.userService.add_user(u);
		Writer out = response.getWriter();
		out.flush();
	}

	// 查找用户信息
	@RequestMapping({ "/select_oneUser" })
	@ResponseBody
	public List<user> select_one(String nickName, HttpServletResponse response, HttpServletRequest request)
			throws ServletException, IOException {
		return this.userService.select_one(nickName);
	}

	// 根据openid查找用户信息
	@RequestMapping({ "/select_openiduser" })
	@ResponseBody
	public user select_openiduser(user u) throws ServletException, IOException {
		return userService.select_openiduser(u);
	}

	// 删除用户信息
	@RequestMapping({ "/delete_user" })
	@ResponseBody
	public void delete_user(String openids) {
		userService.delete_u_user(openids);
	}

	// 修改用户信息
	@RequestMapping({ "/update_user" })
	@ResponseBody
	public R update_user(user u) {
		int a = userService.update_user(u);
		return R.ok();
	}

	// 查找是否有相同的用户
	@RequestMapping({ "/haveopenid" })
	@ResponseBody
	public user haveopenid(String openid) {
		return userService.haveopenid(openid);
	}

	// 修改用户信息 用于减少用于金额
	@RequestMapping({ "/update_del_user" })
	@ResponseBody
	public R update_del_user(user u) {
		int a = userService.update_del_user(u);
		return R.ok();
	}

	// 获取用户的openid
	@RequestMapping({ "/get_openid" })
	@ResponseBody
	public String get_openid(String login_code, HttpServletResponse response, HttpServletRequest request)
			throws ServletException, IOException {
		response.setContentType("text/json;charset=UTF-8");
		response.setContentType("text/html;charset=utf-8");
		response.setHeader("Access-Control-Allow-Origin", "*");
		response.setHeader("Access-Control-Allow-Methods", "GET,POST");
		String message = null;
		String url = "https://api.weixin.qq.com/sns/jscode2session?appid=wx0f794538250d565d&secret=e8490976645bf3e0e63fa6f52be2edf7&js_code="
				+ login_code + "&grant_type=authorization_code";
		try {
			URL urlGet = new URL(url);
			HttpURLConnection http = (HttpURLConnection) urlGet.openConnection();
			http.setRequestMethod("GET");
			http.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
			http.setDoOutput(true);
			http.setDoInput(true);

			System.setProperty("sun.net.client.defaultConnectTimeout", "30000");
			System.setProperty("sun.net.client.defaultReadTimeout", "30000");

			http.connect();

			InputStream is = http.getInputStream();
			int size = is.available();

			byte[] jsonBytes = new byte[size];
			is.read(jsonBytes);
			message = new String(jsonBytes, "UTF-8");

			is.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(message);
		return message;
	}

	// 获取用户的openid
	@RequestMapping({ "/get_openid1" })
	@ResponseBody
	public String get_openid1(String login_code, HttpServletResponse response, HttpServletRequest request)
			throws ServletException, IOException {
		response.setContentType("text/json;charset=UTF-8");
		response.setContentType("text/html;charset=utf-8");
		response.setHeader("Access-Control-Allow-Origin", "*");
		response.setHeader("Access-Control-Allow-Methods", "GET,POST");
		String message = null;
		String url = "https://api.weixin.qq.com/sns/jscode2session?appid=wx00903017be29fed3&secret=e8490976645bf3e0e63fa6f52be2edf7&js_code="
				+ login_code + "&grant_type=authorization_code";
		try {
			URL urlGet = new URL(url);
			HttpURLConnection http = (HttpURLConnection) urlGet.openConnection();
			http.setRequestMethod("GET");
			http.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
			http.setDoOutput(true);
			http.setDoInput(true);

			System.setProperty("sun.net.client.defaultConnectTimeout", "30000");
			System.setProperty("sun.net.client.defaultReadTimeout", "30000");

			http.connect();

			InputStream is = http.getInputStream();
			int size = is.available();

			byte[] jsonBytes = new byte[size];
			is.read(jsonBytes);
			message = new String(jsonBytes, "UTF-8");

			is.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(message);
		return message;
	}

	// 获取男女比例信息
	@RequestMapping({ "/get_malefemaleratio" })
	@ResponseBody
	public List<Map<String, Object>> get_malefemaleratio() {
		return userService.get_malefemaleratio();
	}

	// 获取不同城市的比例信息
	@RequestMapping({ "/get_Differentregions" })
	@ResponseBody
	public List<Map<String, Object>> get_Differentregions() {
		return userService.get_Differentregions();
	}

	// 增加访问数到用户表
	@RequestMapping({ "/update_visit_num" })
	@ResponseBody
	public int update_visit_num(user u) {
		return userService.update_visit_num(u);
	}
	
	// 增加访问数到用户表
		@RequestMapping({ "/alimessage" })
		@ResponseBody
		public void alimessage() {
			System.out.println("战神就是我");
			DefaultProfile profile = DefaultProfile.getProfile("cn-hangzhou", "LTAI5MRqIFENHdHe", "e6CrIldes022GdBvY8KMaW4SfFl0kd");
		    IAcsClient client = new DefaultAcsClient(profile);
		    
		    CommonRequest request = new CommonRequest();
		    //request.setProtocol(ProtocolType.HTTPS);
		    request.setMethod(MethodType.POST);
		    request.setDomain("dysmsapi.aliyuncs.com");
		    request.setVersion("2017-05-25");
		    request.setAction("SendSms");
		    request.putQueryParameter("RegionId", "cn-hangzhou");
		    request.putQueryParameter("PhoneNumbers", "15625523289");
		    request.putQueryParameter("SignName", "Onetemplate");
		    request.putQueryParameter("TemplateCode", "SMS_164513776");
		    request.putQueryParameter("TemplateParam", "{\"code\":\"1111\"}");
		    try {
		        CommonResponse response = client.getCommonResponse(request);
		        System.out.println(response.getData());
		    } catch (ServerException e) {
		        e.printStackTrace();
		    } catch (ClientException e) {
		        e.printStackTrace();
		    }
		}
	
	
	
	
	
	
	
	
}
