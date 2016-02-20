package com.rs.controllers;

import java.io.FileReader;

import javax.servlet.http.HttpServletRequest;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rs.manager.UserDao;
import com.rs.model.User;


@Controller
@RequestMapping(value={"/posters"})
@ComponentScan("com.rs")
public class FirstController {
	@Autowired
	UserDao userDao;
	
	@RequestMapping(value = {"/list"}, method = RequestMethod.GET)
//@ResponseBody
	public String getListOfPosters(Model model){
		//String file = "C:\\Users\\Srikanth\\file.json";		
	//	String jsonStr = getJsonString(file);	
		//User user = new User("Jasdeep","Jaljeera","jdbhalla");
	//	userDao.saveUser(user);
		System.out.println("Success");
		
		//return jsonStr;
		return "index";
	}	

/*	@RequestMapping(value = {""}, method = RequestMethod.GET)
	@ResponseBody
	public String getPoster(Model model, HttpServletRequest request){
		String folderSeparator = "\\";
		String filepath = request.getParameter("folderName")+folderSeparator+request.getParameter("ccName");
		String jsonStr = getJsonString(filepath);		
		return jsonStr;
	}

	private String getJsonString(String file) {
		JSONObject jsonObject = null;
		try {
			FileReader reader = new FileReader(file);
			JSONParser jsonParser = new JSONParser();			
			jsonObject = (JSONObject) jsonParser.parse(reader);	
			String str = jsonObject.toString();
			 return str;				
			} catch (Exception e) {				
				e.printStackTrace();	
				}	
		return null;
	}*/
	
/*	public String lookupAndReturn(String folderPath ,String fileName){
		File dir = new File(folderPath);
	      String[] children = dir.list();
	      if (children == null) {
	         System.out.println("does not exist or is not a directory");
	      }
	      else {
	         for (int i = 0; i < children.length; i++) {
	            if(fileName.equals(children[i])){	            	
	            	return new File(children[i]).getAbsolutePath();
	            } 
	         }
	      }
		return null;
	}*/
}
