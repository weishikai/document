package day03;

import java.nio.channels.NonWritableChannelException;

//静态工厂方法模式
//生成对象的代码 封装在工厂类当中
public class PrinterFactory {
	//添加static 方便调用
	public static Printer getPrinter(int flag ){
		Printer printer=null;
		if(flag==0){
			printer=new HPPrinter();
		}else if (flag==1){
			//向上转型
			printer=new CanonPrinter();
		}
		//如需增加打印机 添加else if (flag==***)编个号
		return printer;
	}
}
