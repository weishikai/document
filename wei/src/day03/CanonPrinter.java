package day03;

public class CanonPrinter implements Printer {
	public void open(){
		System.out.println("Canon :open");
	}
	public void print(String s){
		System.out.println("Canon:print-->"+s);
	}
	public void close(){
		System.out.println("Canon:close");
	}
	public void clean(){
		System.out.println("Canon:clean");
	}
	
}
