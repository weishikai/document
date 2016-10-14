package day02;
/*
 * 观察者模式 定义了一对多依赖
 * 
 */

public class Client {
	
	public static void main(String[] args) {
		LovelyGirl girl=new LovelyGirl();
		System.out.println(girl);
		girl.stateChanged();
//		FansOne fansOne=new FansOne();
//		girl.addFans(fansOne);
//		
//		FansTwo fansTwo=new FansTwo();
//		girl.addFans(fansTwo);
		FansOne fansOne=new FansOne(girl);
		System.out.println(fansOne);
		girl.setEatState("I'm eating.......");
		fansOne.update(girl,fansOne);
	
	}
}
