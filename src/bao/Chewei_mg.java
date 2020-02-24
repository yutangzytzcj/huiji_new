package bao;

public class Chewei_mg {
//每页记录数
	public static final int PAGE_SIZE = 8;
//id
	private int id;
//姓名
	private String username;

	private String qNo;
//使用时间
	private String shiyong_time;
//添加时间
	private String shijian;
	
public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getqNo() {
		return qNo;
	}
	public void setqNo(String qNo) {
		this.qNo = qNo;
	}
	public String getShiyong_time() {
		return shiyong_time;
	}
	public void setShiyong_time(String shiyongTime) {
		shiyong_time = shiyongTime;
	}
	public String getShijian() {
		return shijian;
	}
	public void setShijian(String shijian) {
		this.shijian = shijian;
	}
	
}
