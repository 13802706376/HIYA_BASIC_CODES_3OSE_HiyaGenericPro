package com.hiya.se.generic;

public class GenericMethod
{
	/**
	 * 泛型方法
	 * 
	 * @param <T>声明一个泛型T
	 * @param c用来创建泛型对象
	 * @return
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public <T> T getObject(Class<T> c) throws InstantiationException, IllegalAccessException
	{
		T t = c.newInstance();
		return t;
	}

	public static <T> T getData2(T data)
	{
		return data;
	}
}
