package com.erp.admin.factory;

/**
 * 
 * 饿汉式单例模式
 * 
 * @author zhouzhou
 *
 */
public class SingLeton1 {

	// 无参构造器
	private SingLeton1() {}

	// 创建SingLeton1实例
	private static final SingLeton1 sing = new SingLeton1();

	// 静态工厂
	public SingLeton1 getSingLeton() {
		return sing;
	}

}


