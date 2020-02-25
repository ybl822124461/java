package com.java.handier;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicProxyHandler implements InvocationHandler {
	private Object object;
	public DynamicProxyHandler(Object object) {
		this.object=object;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("��ǰ׼��");
		Object re = method.invoke(object, args);
		System.out.println("�򷿺�װ��");
		return re;
	}

}
