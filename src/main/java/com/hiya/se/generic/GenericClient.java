package com.hiya.se.generic;

import com.hiya.se.generic.inter.ITextInterface;
import com.hiya.se.generic.inter.TextNumber;
import com.hiya.se.generic.inter.TextString;

public class GenericClient
{
	/**
	 * K 表示键(Key)
		V 表示值（Value）
		T 表示类型(Type)
		E 表示集合元素类型（Entity）
		? 表示不确定的类型 
		<? super T> 表示包括T在内的任何T的父类
		<? extends T> 表示包括T在内的任何T的子类
	 * @param args
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public static void main(String[] args) throws InstantiationException, IllegalAccessException
	{
		GenericClass<String,Object> name = new GenericClass<String,Object>("corn",77);
		System.out.println("name class:" + name.getClass()); // com.qqyumidi.Box
		
		ITextInterface<Integer>  ii = new TextNumber();
		ii.text();
		ITextInterface<String>  is = new TextString();
		is.text();
		
		Class<String> cla = String.class;
		new GenericMethod().getObject(cla);
		GenericMethod.getData2("5555");
		
	}
}
