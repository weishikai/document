package day02;

public class FansTwo implements Fans {
	
	@Override
	public void update(String eatState,String studyState){
		System.out.println("I am fans two:"+eatState+","+studyState);
	}
}
