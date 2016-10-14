package day02;

/*
 * 定义Girl接口 她可以做的事情 增加 删除 发布给fans
 */
public interface Girl {
	
	public void addFans(Fans fans);
	public void removeFans(Fans fans);
	public void notifyFans();
	
}
