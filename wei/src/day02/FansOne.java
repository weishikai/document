package day02;

import java.util.Observable;
import java.util.Observer;
/*
 * 
 * 实现观察者接口 调用Observable 对象的addObserver
 */
public class FansOne implements Observer{
	/*
	@Override
	public void update(String eatState,String studyState){
		System.out.println("I am fans one"+eatState+","+studyState);
	}
	*/
	
	private Observable observable;
	
	public FansOne(Observable observable){
		this.observable=observable;
		observable.addObserver(this);
	}
	
	@Override
	public void update(Observable o,Object arg){
		if(o instanceof LovelyGirl){
			LovelyGirl girl=(LovelyGirl) o;
			System.out.println("eatState :"+ girl.getEatState()+
					"studyState :"+girl.getStudyState());
		}
	}
	
}
