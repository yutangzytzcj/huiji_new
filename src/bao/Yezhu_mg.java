package bao;

public class Yezhu_mg {
	
//每页记录数
	public static final int PAGE_SIZE = 8;
//id
	private int id;
//姓名
	private String username;
//密码
	private String password;
//电话 
	private String tel;
//楼宇名称
	private String l_name;
//楼层
	private String l_ceng;
//房屋号
	private String l_wu;
//单元
	private String l_danyuan;
//入住时间
	private String ru_time;
//户型
	private String l_fangxing;
//备注
	private String beizhu;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getL_name() {
		return l_name;
	}
	public void setL_name(String lName) {
		l_name = lName;
	}
	public String getL_ceng() {
		return l_ceng;
	}
	public void setL_ceng(String lCeng) {
		l_ceng = lCeng;
	}
	public String getL_wu() {
		return l_wu;
	}
	public void setL_wu(String lWu) {
		l_wu = lWu;
	}
	public String getL_danyuan() {
		return l_danyuan;
	}
	public void setL_danyuan(String lDanyuan) {
		l_danyuan = lDanyuan;
	}
	public String getRu_time() {
		return ru_time;
	}
	public void setRu_time(String ruTime) {
		ru_time = ruTime;
	}
	public String getL_fangxing() {
		return l_fangxing;
	}
	public void setL_fangxing(String lFangxing) {
		l_fangxing = lFangxing;
	}
	public String getBeizhu() {
		return beizhu;
	}
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	public String getShijian() {
		return shijian;
	}
	public void setShijian(String shijian) {
		this.shijian = shijian;
	}
	
}
