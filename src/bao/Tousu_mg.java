package bao;

public class Tousu_mg {
//每页记录数
	public static final int PAGE_SIZE = 8;
//id
	private int id;
//投诉人
	private String username;
//电话
	private String tel;
//标题 
	private String title;
//投诉内容
	private String content;
//投诉时间
	private String tou_time;
//回答内容
	private String answer;
//回答时间
	private String da_time;

 	
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
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getTou_time() {
		return tou_time;
	}
	public void setTou_time(String touTime) {
		tou_time = touTime;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public String getDa_time() {
		return da_time;
	}
	public void setDa_time(String daTime) {
		da_time = daTime;
	}


}
