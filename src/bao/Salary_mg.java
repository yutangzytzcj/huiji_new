package bao;

public class Salary_mg {
//ÿҳ��¼��
	public static final int PAGE_SIZE = 8;
//id
	private int id;
//����
	private String username;
//�ܶ�
	private String salary_all;
//�ɷѷ�ʽ 
	private String salary_type;
//�շ���Ա
	private String salary_per;
//�շ�ʱ��
	private String salary_time;
//��ע
	private String beizhu;
 	
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
	public String getSalary_all() {
		return salary_all;
	}
	public void setSalary_all(String salaryAll) {
		salary_all = salaryAll;
	}
	public String getSalary_type() {
		return salary_type;
	}
	public void setSalary_type(String salaryType) {
		salary_type = salaryType;
	}
	public String getSalary_per() {
		return salary_per;
	}
	public void setSalary_per(String salaryPer) {
		salary_per = salaryPer;
	}
	public String getSalary_time() {
		return salary_time;
	}
	public void setSalary_time(String salaryTime) {
		salary_time = salaryTime;
	}
	public String getBeizhu() {
		return beizhu;
	}
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	
}
