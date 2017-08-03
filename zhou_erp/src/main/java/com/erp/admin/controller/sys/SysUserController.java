package com.erp.admin.controller.sys;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.erp.admin.pojo.sys.SysUser;
import com.erp.admin.service.sys.SysUserService;
import com.erp.admin.util.PageUtil;

@Controller
@RequestMapping("/sys/user")
public class SysUserController {
	
	@Autowired
	private SysUserService sysUserService;

	@RequestMapping("/select")
	@ResponseBody
	public String selectSysUser(String name) {
		
		return "aaaaa";
	}
	
	
	@RequestMapping("/insert")
	@ResponseBody
	public String insert(SysUser user) {
		Map<String, Object> map = sysUserService.insert(user);
		System.out.println(map);
		return "bbbb";
	}
	
	@RequestMapping("get")
	@ResponseBody
	public Map<String, Object> get(String name){
		HashMap<String, Object> map = new HashMap<String,Object>();
		map.put("name", "hahaha");
		return map;
	}

}
