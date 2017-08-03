package com.erp.admin.factory;

import com.erp.admin.pojo.sys.SysUser;

public class Test {
	
	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			SingLeton s = SingLeton.getInstance();
			System.out.println(s);
		}
		
		System.out.println("----------------------");
		
		for (int i = 0; i < 10; i++) {
			SysUser user = new SysUser();
			System.out.println(user);
		}
	}

}
