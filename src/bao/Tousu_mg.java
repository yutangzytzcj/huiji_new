package bao;

public class Tousu_mg {
//ÿҳ��¼��
	public static final int PAGE_SIZE = 8;
//id
	private int id;
//Ͷ����
	private String username;
//�绰
	private String tel;
//���� 
	private String title;
//Ͷ������
	private String content;
//Ͷ��ʱ��
	private String tou_time;
//�ش�����
	private String answer;
//�ش�ʱ��
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
