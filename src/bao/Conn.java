package bao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
//import java.sql.Statement;
import java.util.ArrayList;
import java.util.List; 
 


public class Conn {
	public Connection getConnection(){
		// ���ݿ�����
		Connection conn = null;
		try {
			// �������ݿ�������ע�ᵽ����������
			Class.forName("com.mysql.jdbc.Driver");
			// ���ݿ������ַ���
			String url = "jdbc:mysql://localhost:3306/wuye";
			// ���ݿ��û���
			String username = "root";
			// ���ݿ�����
			String password = "123456";
			// ����Connection����
			conn = DriverManager.getConnection(url,username,password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		// �������ݿ�����
		return conn;
	}
	
	/**
	 * ��ҳ��ѯ����ҵ����Ϣ
	 * @param page ҳ��
	 * @return List<Reg>
	 */
	public List<Yezhu_mg> find(int page){
		// ����List
		List<Yezhu_mg> list = new ArrayList<Yezhu_mg>();
		// ��ȡ���ݿ�����
		Connection conn = getConnection();
		// ��ҳ��ѯ��SQL���
		String sql = "select * from yonghu order by id desc limit ?,?";
		try {
			// ��ȡPreparedStatement
			PreparedStatement ps = conn.prepareStatement(sql);
			// ��SQL����еĵ�1��������ֵ
			ps.setInt(1, (page - 1) * Yezhu_mg.PAGE_SIZE);
			// ��SQL����еĵ�2��������ֵ
			ps.setInt(2, Yezhu_mg.PAGE_SIZE);
			// ִ�в�ѯ����
			ResultSet rs = ps.executeQuery();
			// �������ƶ������ж��Ƿ���Ч
			while(rs.next()){
				
				Yezhu_mg p = new Yezhu_mg();
				// ��id���Ը�ֵ
				p.setId(rs.getInt("id"));
				// ��username���Ը�ֵ
				p.setUsername(rs.getString("username"));
				// ��tel���Ը�ֵ
				p.setTel(rs.getString("tel"));
				// ��l_name���Ը�ֵ
				p.setL_name(rs.getString("l_name"));
				// ��l_ceng���Ը�ֵ
				p.setL_ceng(rs.getString("l_ceng"));
				// ��l_wu���Ը�ֵ
				p.setL_wu(rs.getString("l_wu"));
				// ��l_danyuan���Ը�ֵ
				p.setL_danyuan(rs.getString("l_danyuan"));
				// ��ru_time���Ը�ֵ
				p.setRu_time(rs.getString("ru_time"));
				// ��l_fangxing���Ը�ֵ
				p.setL_fangxing(rs.getString("l_fangxing"));
				// ��beizhu���Ը�ֵ
				p.setBeizhu(rs.getString("beizhu"));
				// ��shijian���Ը�ֵ
				p.setShijian(rs.getString("shijian"));
				list.add(p);
			}
			// �ر�ResultSet
			rs.close();
			// �ر�PreparedStatement
			ps.close();
			// �ر�Connection
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	/**
	 * ��ҳ��ѯ���г�λ��Ϣ
	 * @param page ҳ��
	 * @return List<Reg>
	 */
	public List<Chewei_mg> find_chewei(int page){
		// ����List
		List<Chewei_mg> list = new ArrayList<Chewei_mg>();
		// ��ȡ���ݿ�����
		Connection conn = getConnection();
		// ��ҳ��ѯ��SQL���
		String sql = "select * from qianru order by id desc limit ?,?";
		try {
			// ��ȡPreparedStatement
			PreparedStatement ps = conn.prepareStatement(sql);
			// ��SQL����еĵ�1��������ֵ
			ps.setInt(1, (page - 1) * Chewei_mg.PAGE_SIZE);
			// ��SQL����еĵ�2��������ֵ
			ps.setInt(2, Chewei_mg.PAGE_SIZE);
			// ִ�в�ѯ����
			ResultSet rs = ps.executeQuery();
			// �������ƶ������ж��Ƿ���Ч
			while(rs.next()){
				
				Chewei_mg p = new Chewei_mg();
				// ��id���Ը�ֵ
				p.setId(rs.getInt("id"));
				// ��username���Ը�ֵ
				p.setUsername(rs.getString("username"));
				// ��cheNo���Ը�ֵ
				p.setqNo(rs.getString("qNo"));
				// ��shiyong_time���Ը�ֵ
				p.setShiyong_time(rs.getString("shiyong_time"));
				// ��shijian���Ը�ֵ
				p.setShijian(rs.getString("shijian"));
				list.add(p);
			}
			// �ر�ResultSet
			rs.close();
			// �ر�PreparedStatement
			ps.close();
			// �ر�Connection
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	/**
	 * ��ҳ��ѯ���г�λ��Ϣ
	 * @param page ҳ��
	 * @return List<Reg>
	 */
	public List<Chewei_mg> find_chewei2(int page,String username){
		// ����List
		List<Chewei_mg> list = new ArrayList<Chewei_mg>();
		// ��ȡ���ݿ�����
		Connection conn = getConnection();
		// ��ҳ��ѯ��SQL���
		String sql = "select * from qianru where username='"+username+"' order by id desc limit ?,?";
		try {
			// ��ȡPreparedStatement
			PreparedStatement ps = conn.prepareStatement(sql);
			// ��SQL����еĵ�1��������ֵ
			ps.setInt(1, (page - 1) * Chewei_mg.PAGE_SIZE);
			// ��SQL����еĵ�2��������ֵ
			ps.setInt(2, Chewei_mg.PAGE_SIZE);
			// ִ�в�ѯ����
			ResultSet rs = ps.executeQuery();
			// �������ƶ������ж��Ƿ���Ч
			while(rs.next()){
				
				Chewei_mg p = new Chewei_mg();
				// ��id���Ը�ֵ
				p.setId(rs.getInt("id"));
				// ��username���Ը�ֵ
				p.setUsername(rs.getString("username"));
				// ��cheNo���Ը�ֵ
				p.setqNo(rs.getString("qNo"));
				// ��shiyong_time���Ը�ֵ
				p.setShiyong_time(rs.getString("shiyong_time"));
				// ��shijian���Ը�ֵ
				p.setShijian(rs.getString("shijian"));
				list.add(p);
			}
			// �ر�ResultSet
			rs.close();
			// �ر�PreparedStatement
			ps.close();
			// �ر�Connection
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	/**
	 * ��ҳ��ѯ���нɷ���Ϣ
	 * @param page ҳ��
	 * @return List<Reg>
	 */
	public List<Salary_mg> find_salary(int page){
		// ����List
		List<Salary_mg> list = new ArrayList<Salary_mg>();
		// ��ȡ���ݿ�����
		Connection conn = getConnection();
		// ��ҳ��ѯ��SQL���
		String sql = "select * from salary order by id desc limit ?,?";
		try {
			// ��ȡPreparedStatement
			PreparedStatement ps = conn.prepareStatement(sql);
			// ��SQL����еĵ�1��������ֵ
			ps.setInt(1, (page - 1) * Salary_mg.PAGE_SIZE);
			// ��SQL����еĵ�2��������ֵ
			ps.setInt(2, Salary_mg.PAGE_SIZE);
			// ִ�в�ѯ����
			ResultSet rs = ps.executeQuery();
			// �������ƶ������ж��Ƿ���Ч
			while(rs.next()){
				
				Salary_mg p = new Salary_mg();
				// ��id���Ը�ֵ
				p.setId(rs.getInt("id"));
				// ��username���Ը�ֵ
				p.setUsername(rs.getString("username"));
				// ��cheNo���Ը�ֵ
				p.setSalary_all(rs.getString("salary_all"));
				// ��shiyong_time���Ը�ֵ
				p.setSalary_type(rs.getString("salary_type"));
				// ��shijian���Ը�ֵ
				p.setSalary_per(rs.getString("salary_per"));
				// ��shijian���Ը�ֵ
				p.setSalary_time(rs.getString("salary_time"));
				// ��shijian���Ը�ֵ
				p.setBeizhu(rs.getString("beizhu"));
				list.add(p);
			}
			// �ر�ResultSet
			rs.close();
			// �ر�PreparedStatement
			ps.close();
			// �ر�Connection
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	/**
	 * ��ҳ��ѯ���нɷ���Ϣ
	 * @param page ҳ��
	 * @return List<Reg>
	 */
	public List<Salary_mg> find_salary2(int page,String username){
		// ����List
		List<Salary_mg> list = new ArrayList<Salary_mg>();
		// ��ȡ���ݿ�����
		Connection conn = getConnection();
		// ��ҳ��ѯ��SQL���
		String sql = "select * from salary where username='"+username+"' order by id desc limit ?,?";
		try {
			// ��ȡPreparedStatement
			PreparedStatement ps = conn.prepareStatement(sql);
			// ��SQL����еĵ�1��������ֵ
			ps.setInt(1, (page - 1) * Salary_mg.PAGE_SIZE);
			// ��SQL����еĵ�2��������ֵ
			ps.setInt(2, Salary_mg.PAGE_SIZE);
			// ִ�в�ѯ����
			ResultSet rs = ps.executeQuery();
			// �������ƶ������ж��Ƿ���Ч
			while(rs.next()){
				
				Salary_mg p = new Salary_mg();
				// ��id���Ը�ֵ
				p.setId(rs.getInt("id"));
				// ��username���Ը�ֵ
				p.setUsername(rs.getString("username"));
				// ��cheNo���Ը�ֵ
				p.setSalary_all(rs.getString("salary_all"));
				// ��shiyong_time���Ը�ֵ
				p.setSalary_type(rs.getString("salary_type"));
				// ��shijian���Ը�ֵ
				p.setSalary_per(rs.getString("salary_per"));
				// ��shijian���Ը�ֵ
				p.setSalary_time(rs.getString("salary_time"));
				// ��shijian���Ը�ֵ
				p.setBeizhu(rs.getString("beizhu"));
				list.add(p);
			}
			// �ر�ResultSet
			rs.close();
			// �ر�PreparedStatement
			ps.close();
			// �ر�Connection
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	/**
	 * ��ҳ��ѯ����Ͷ����Ϣ
	 * @param page ҳ��
	 * @return List<Reg>
	 */
	public List<Tousu_mg> find_tousu(int page){
		// ����List
		List<Tousu_mg> list = new ArrayList<Tousu_mg>();
		// ��ȡ���ݿ�����
		Connection conn = getConnection();
		// ��ҳ��ѯ��SQL���
		String sql = "select * from tousu order by id desc limit ?,?";
		try {
			// ��ȡPreparedStatement
			PreparedStatement ps = conn.prepareStatement(sql);
			// ��SQL����еĵ�1��������ֵ
			ps.setInt(1, (page - 1) * Tousu_mg.PAGE_SIZE);
			// ��SQL����еĵ�2��������ֵ
			ps.setInt(2, Tousu_mg.PAGE_SIZE);
			// ִ�в�ѯ����
			ResultSet rs = ps.executeQuery();
			// �������ƶ������ж��Ƿ���Ч
			while(rs.next()){
				
				Tousu_mg p = new Tousu_mg();
				// ��id���Ը�ֵ
				p.setId(rs.getInt("id"));
				// ��title���Ը�ֵ
				p.setTitle(rs.getString("title"));
				// ��content���Ը�ֵ
				p.setContent(rs.getString("content"));
				// ��tou_time���Ը�ֵ
				p.setTou_time(rs.getString("tou_time"));
				// ��answer���Ը�ֵ
				p.setAnswer(rs.getString("answer"));
				// ��da_time���Ը�ֵ
				p.setDa_time(rs.getString("da_time"));
				// ��username���Ը�ֵ
				p.setUsername(rs.getString("username"));
				// ��tel���Ը�ֵ
				p.setTel(rs.getString("tel"));
				list.add(p);
			}
			// �ر�ResultSet
			rs.close();
			// �ر�PreparedStatement
			ps.close();
			// �ر�Connection
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	
	/**
	 * ��ѯ�ܼ�¼��
	 * @return �ܼ�¼��
	 */
	public int Counts(){
		// �ܼ�¼��
		int count = 0;
		// ��ȡ���ݿ�����
		Connection conn = getConnection();
		// ��ѯ�ܼ�¼��SQL���
		String sql = "select count(*) from yezhu";
		try {
			// ����Statement
			Statement stmt = conn.createStatement();
			// ��ѯ����ȡResultSet
			ResultSet rs = stmt.executeQuery(sql);
			// �������ƶ������ж��Ƿ���Ч
			if(rs.next()){
				// ���ܼ�¼����ֵ
				count = rs.getInt(1);
			}
			// �ر�ResultSet
			rs.close();
			// �ر�Connection
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		// �����ܼ�¼��
		return count;
	}
	
	/**
	 * ��ѯ�ܼ�¼��
	 * @return �ܼ�¼��
	 */
	public int Counts_chewei(){
		// �ܼ�¼��
		int count = 0;
		// ��ȡ���ݿ�����
		Connection conn = getConnection();
		// ��ѯ�ܼ�¼��SQL���
		String sql = "select count(*) from chewei";
		try {
			// ����Statement
			Statement stmt = conn.createStatement();
			// ��ѯ����ȡResultSet
			ResultSet rs = stmt.executeQuery(sql);
			// �������ƶ������ж��Ƿ���Ч
			if(rs.next()){
				// ���ܼ�¼����ֵ
				count = rs.getInt(1);
			}
			// �ر�ResultSet
			rs.close();
			// �ر�Connection
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		// �����ܼ�¼��
		return count;
	}
	
	/**
	 * ��ѯ�ܼ�¼��
	 * @return �ܼ�¼��
	 */
	public int Counts_chewei2(String username){
		// �ܼ�¼��
		int count = 0;
		// ��ȡ���ݿ�����
		Connection conn = getConnection();
		// ��ѯ�ܼ�¼��SQL���
		String sql = "select count(*) from chewei where username='"+username+"'";
		try {
			// ����Statement
			Statement stmt = conn.createStatement();
			// ��ѯ����ȡResultSet
			ResultSet rs = stmt.executeQuery(sql);
			// �������ƶ������ж��Ƿ���Ч
			if(rs.next()){
				// ���ܼ�¼����ֵ
				count = rs.getInt(1);
			}
			// �ر�ResultSet
			rs.close();
			// �ر�Connection
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		// �����ܼ�¼��
		return count;
	}
	/**
	 * ��ѯ�ܼ�¼��
	 * @return �ܼ�¼��
	 */
	public int Counts_salary(){
		// �ܼ�¼��
		int count = 0;
		// ��ȡ���ݿ�����
		Connection conn = getConnection();
		// ��ѯ�ܼ�¼��SQL���
		String sql = "select count(*) from salary";
		try {
			// ����Statement
			Statement stmt = conn.createStatement();
			// ��ѯ����ȡResultSet
			ResultSet rs = stmt.executeQuery(sql);
			// �������ƶ������ж��Ƿ���Ч
			if(rs.next()){
				// ���ܼ�¼����ֵ
				count = rs.getInt(1);
			}
			// �ر�ResultSet
			rs.close();
			// �ر�Connection
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		// �����ܼ�¼��
		return count;
	}
	
	/**
	 * ��ѯ�ܼ�¼��
	 * @return �ܼ�¼��
	 */
	public int Counts_salary2(String username){
		// �ܼ�¼��
		int count = 0;
		// ��ȡ���ݿ�����
		Connection conn = getConnection();
		// ��ѯ�ܼ�¼��SQL���
		String sql = "select count(*) from salary where username='"+username+"'";
		try {
			// ����Statement
			Statement stmt = conn.createStatement();
			// ��ѯ����ȡResultSet
			ResultSet rs = stmt.executeQuery(sql);
			// �������ƶ������ж��Ƿ���Ч
			if(rs.next()){
				// ���ܼ�¼����ֵ
				count = rs.getInt(1);
			}
			// �ر�ResultSet
			rs.close();
			// �ر�Connection
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		// �����ܼ�¼��
		return count;
	}
	
	/**
	 * ��ѯ�ܼ�¼��
	 * @return �ܼ�¼��
	 */
	public int Counts_tousu(){
		// �ܼ�¼��
		int count = 0;
		// ��ȡ���ݿ�����
		Connection conn = getConnection();
		// ��ѯ�ܼ�¼��SQL���
		String sql = "select count(*) from tousu";
		try {
			// ����Statement
			Statement stmt = conn.createStatement();
			// ��ѯ����ȡResultSet
			ResultSet rs = stmt.executeQuery(sql);
			// �������ƶ������ж��Ƿ���Ч
			if(rs.next()){
				// ���ܼ�¼����ֵ
				count = rs.getInt(1);
			}
			// �ر�ResultSet
			rs.close();
			// �ر�Connection
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		// �����ܼ�¼��
		return count;
	}
	
	/**
	 * ��ѯ�ܼ�¼��
	 * @return �ܼ�¼��
	 */
	public int Counts_baoxiu(){
		// �ܼ�¼��
		int count = 0;
		// ��ȡ���ݿ�����
		Connection conn = getConnection();
		// ��ѯ�ܼ�¼��SQL���
		String sql = "select count(*) from baoxiu";
		try {
			// ����Statement
			Statement stmt = conn.createStatement();
			// ��ѯ����ȡResultSet
			ResultSet rs = stmt.executeQuery(sql);
			// �������ƶ������ж��Ƿ���Ч
			if(rs.next()){
				// ���ܼ�¼����ֵ
				count = rs.getInt(1);
			}
			// �ر�ResultSet
			rs.close();
			// �ر�Connection
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		// �����ܼ�¼��
		return count;
	}
	/**
	 * ��ҳ��ѯ���нɷ���Ϣ
	 * @param page ҳ��
	 * @return List<Reg>
	 */
	public List<Chewei_mg> find_qianru(int page,String username){
		// ����List
		List<Chewei_mg> list = new ArrayList<Chewei_mg>();
		// ��ȡ���ݿ�����
		Connection conn = getConnection();
		// ��ҳ��ѯ��SQL���
		String sql = "select * from qianru where username='"+username+"' order by id desc limit ?,?";
		try {
			// ��ȡPreparedStatement
			PreparedStatement ps = conn.prepareStatement(sql);
			// ��SQL����еĵ�1��������ֵ
			ps.setInt(1, (page - 1) * Salary_mg.PAGE_SIZE);
			// ��SQL����еĵ�2��������ֵ
			ps.setInt(2, Chewei_mg.PAGE_SIZE);
			// ִ�в�ѯ����
			ResultSet rs = ps.executeQuery();
			// �������ƶ������ж��Ƿ���Ч
			while(rs.next()){
				
				Chewei_mg p = new Chewei_mg();
				// ��id���Ը�ֵ
				p.setId(rs.getInt("id"));
				// ��username���Ը�ֵ
				p.setUsername(rs.getString("username"));
				// ��cheNo���Ը�ֵ
				p.setqNo(rs.getString("qNo"));
                //Ǩ��ʱ��
				p.setShiyong_time(rs.getString("shiyong_time"));
				list.add(p);
			}
			// �ر�ResultSet
			rs.close();
			// �ر�PreparedStatement
			ps.close();
			// �ر�Connection
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
}
