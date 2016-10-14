package day03;

/*
 * 实现接口使用implements 关键字
 * 一个类可以实现多个接口  1,2
 * 实现是特殊的继承,一个类可以继承多个接口
 */
public class HPPrinter implements Printer{
	public void open(){
		System.out.println("HP :open");
	}
	public void print(String s){
		System.out.println("HP :print-->"+s);
	}
	public void close(){
		System.out.println("HP:close");
	}
}
