package com.klu.service;

import org.springframework.stereotype.Service;

@Service
public class CalcService 
{
	public int add(int a,int b)
	{
		return a+b;
	}
	public int substract(int a,int b)
	{
		return a-b;
	}
	public int multiplication(int a,int b)
	{
		return a*b;
	}
	public double divide(int a,int b)
	{
		if(b==0)
		{
			throw new ArithmeticException("division by zero");
		}
		return (double)a/b;
	}
	public int modulo(int a,int b)
	{
		return a%b;
	}
}
