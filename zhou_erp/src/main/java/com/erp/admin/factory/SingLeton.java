package com.erp.admin.factory;

/**
 * 懒汉式单例模式
 * 
 * @author zhouzhou
 *
 */
public class SingLeton {

	private static class LazyHolder{
		private static final SingLeton INSTANCE = new SingLeton();
	}
	
	private SingLeton(){}
	
	public static SingLeton getInstance(){
		return LazyHolder.INSTANCE;
	}
}





