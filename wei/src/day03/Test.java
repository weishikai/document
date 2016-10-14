package day03;

import day02.Girl;
import day02.LovelyGirl;

public class Test {
	
	/*
	 * 第一版本
	 
	public static void main(String[] args){
		//向上转型 减少重复代码
		Printer printer=null;
		//flag 模拟用户选择使用哪台打印机
		int flag=1;
		if(flag==0){
			//向上转型
			printer=new HPPrinter();
		}else if (flag==1){
			//向上转型
			printer=new CanonPrinter();
		}
		
		printer.open();
		printer.print("打印");
		printer.close();
		
	}
	
	*/
	
	public static void main(String[] args){
		int flag=1;
		Printer printer=PrinterFactory.getPrinter(flag);
		printer.open();
		printer.print("打印");
		printer.close();
	}
}
