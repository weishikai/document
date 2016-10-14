package day02;

import java.util.Observable;

/*
 * 原先的代码 


public class LovelyGirl implements Girl {
	private String eatState="Inexact";
	private String studyState="Inexact";
	private ArrayList<Fans> fanses;
	
	public  LovelyGirl() {//构造器
		fanses=new ArrayList<>();
	}
	
	@Override
	public void addFans(Fans fans){
		fanses.add(fans);
	}
	
	@Override
	public void removeFans(Fans fans){
		int i=fanses.indexOf(fans);
		if(i>=0){
			fanses.remove(i);
		}
	}
	
	
	@Override
	public void notifyFans(){
		for(int i=0;i<fanses.size();i++){
			Fans fans=fanses.get(i);
			fans.update(eatState,studyState);
		}
	}
	

	public void setEatState(String eatState) {
		this.eatState=eatState;
		notifyFans();
	}
	
	
	public void setStudyState(String studyState){
		this.studyState=studyState;
		notifyFans();
	}
}	
	
*/
//java自带的观察者  观察者发送消息Observerable类
//类的继承extends 
public class LovelyGirl extends Observable{
	private String eatState="eating";
	private String studyState="studying";
	
	public void setEatState(String eatState) {
		this.eatState=eatState;
	}
	
	
	public void setStudyState(String studyState){
		this.studyState=studyState;
	}
	
	public String getEatState(){
		return eatState;
	}
	
	public String getStudyState(){
		return studyState;
	}
	//观察者如何送出通知
	public void stateChanged(){
		setChanged();
		notifyObservers();
	}
}

