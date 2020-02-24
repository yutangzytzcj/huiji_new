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
		// 数据库连接
		Connection conn = null;
		try {
			// 加载数据库驱动，注册到驱动管理器
			Class.forName("com.mysql.jdbc.Driver");
			// 数据库连接字符串
			String url = "jdbc:mysql://localhost:3306/wuye";
			// 数据库用户名
			String username = "root";
			// 数据库密码
			String password = "123456";
			// 创建Connection连接
			conn = DriverManager.getConnection(url,username,password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		// 返回数据库连接
		return conn;
	}
	
	/**
	 * 分页查询所有业主信息
	 * @param page 页数
	 * @return List<Reg>
	 */
	public List<Yezhu_mg> find(int page){
		// 创建List
		List<Yezhu_mg> list = new ArrayList<Yezhu_mg>();
		// 获取数据库连接
		Connection conn = getConnection();
		// 分页查询的SQL语句
		String sql = "select * from yonghu order by id desc limit ?,?";
		try {
			// 获取PreparedStatement
			PreparedStatement ps = conn.prepareStatement(sql);
			// 对SQL语句中的第1个参数赋值
			ps.setInt(1, (page - 1) * Yezhu_mg.PAGE_SIZE);
			// 对SQL语句中的第2个参数赋值
			ps.setInt(2, Yezhu_mg.PAGE_SIZE);
			// 执行查询操作
			ResultSet rs = ps.executeQuery();
			// 光标向后移动，并判断是否有效
			while(rs.next()){
				
				Yezhu_mg p = new Yezhu_mg();
				// 对id属性赋值
				p.setId(rs.getInt("id"));
				// 对username属性赋值
				p.setUsername(rs.getString("username"));
				// 对tel属性赋值
				p.setTel(rs.getString("tel"));
				// 对l_name属性赋值
				p.setL_name(rs.getString("l_name"));
				// 对l_ceng属性赋值
				p.setL_ceng(rs.getString("l_ceng"));
				// 对l_wu属性赋值
				p.setL_wu(rs.getString("l_wu"));
				// 对l_danyuan属性赋值
				p.setL_danyuan(rs.getString("l_danyuan"));
				// 对ru_time属性赋值
				p.setRu_time(rs.getString("ru_time"));
				// 对l_fangxing属性赋值
				p.setL_fangxing(rs.getString("l_fangxing"));
				// 对beizhu属性赋值
				p.setBeizhu(rs.getString("beizhu"));
				// 对shijian属性赋值
				p.setShijian(rs.getString("shijian"));
				list.add(p);
			}
			// 关闭ResultSet
			rs.close();
			// 关闭PreparedStatement
			ps.close();
			// 关闭Connection
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	/**
	 * 分页查询所有车位信息
	 * @param page 页数
	 * @return List<Reg>
	 */
	public List<Chewei_mg> find_chewei(int page){
		// 创建List
		List<Chewei_mg> list = new ArrayList<Chewei_mg>();
		// 获取数据库连接
		Connection conn = getConnection();
		// 分页查询的SQL语句
		String sql = "select * from qianru order by id desc limit ?,?";
		try {
			// 获取PreparedStatement
			PreparedStatement ps = conn.prepareStatement(sql);
			// 对SQL语句中的第1个参数赋值
			ps.setInt(1, (page - 1) * Chewei_mg.PAGE_SIZE);
			// 对SQL语句中的第2个参数赋值
			ps.setInt(2, Chewei_mg.PAGE_SIZE);
			// 执行查询操作
			ResultSet rs = ps.executeQuery();
			// 光标向后移动，并判断是否有效
			while(rs.next()){
				
				Chewei_mg p = new Chewei_mg();
				// 对id属性赋值
				p.setId(rs.getInt("id"));
				// 对username属性赋值
				p.setUsername(rs.getString("username"));
				// 对cheNo属性赋值
				p.setqNo(rs.getString("qNo"));
				// 对shiyong_time属性赋值
				p.setShiyong_time(rs.getString("shiyong_time"));
				// 对shijian属性赋值
				p.setShijian(rs.getString("shijian"));
				list.add(p);
			}
			// 关闭ResultSet
			rs.close();
			// 关闭PreparedStatement
			ps.close();
			// 关闭Connection
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	/**
	 * 分页查询所有车位信息
	 * @param page 页数
	 * @return List<Reg>
	 */
	public List<Chewei_mg> find_chewei2(int page,String username){
		// 创建List
		List<Chewei_mg> list = new ArrayList<Chewei_mg>();
		// 获取数据库连接
		Connection conn = getConnection();
		// 分页查询的SQL语句
		String sql = "select * from qianru where username='"+username+"' order by id desc limit ?,?";
		try {
			// 获取PreparedStatement
			PreparedStatement ps = conn.prepareStatement(sql);
			// 对SQL语句中的第1个参数赋值
			ps.setInt(1, (page - 1) * Chewei_mg.PAGE_SIZE);
			// 对SQL语句中的第2个参数赋值
			ps.setInt(2, Chewei_mg.PAGE_SIZE);
			// 执行查询操作
			ResultSet rs = ps.executeQuery();
			// 光标向后移动，并判断是否有效
			while(rs.next()){
				
				Chewei_mg p = new Chewei_mg();
				// 对id属性赋值
				p.setId(rs.getInt("id"));
				// 对username属性赋值
				p.setUsername(rs.getString("username"));
				// 对cheNo属性赋值
				p.setqNo(rs.getString("qNo"));
				// 对shiyong_time属性赋值
				p.setShiyong_time(rs.getString("shiyong_time"));
				// 对shijian属性赋值
				p.setShijian(rs.getString("shijian"));
				list.add(p);
			}
			// 关闭ResultSet
			rs.close();
			// 关闭PreparedStatement
			ps.close();
			// 关闭Connection
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	/**
	 * 分页查询所有缴费信息
	 * @param page 页数
	 * @return List<Reg>
	 */
	public List<Salary_mg> find_salary(int page){
		// 创建List
		List<Salary_mg> list = new ArrayList<Salary_mg>();
		// 获取数据库连接
		Connection conn = getConnection();
		// 分页查询的SQL语句
		String sql = "select * from salary order by id desc limit ?,?";
		try {
			// 获取PreparedStatement
			PreparedStatement ps = conn.prepareStatement(sql);
			// 对SQL语句中的第1个参数赋值
			ps.setInt(1, (page - 1) * Salary_mg.PAGE_SIZE);
			// 对SQL语句中的第2个参数赋值
			ps.setInt(2, Salary_mg.PAGE_SIZE);
			// 执行查询操作
			ResultSet rs = ps.executeQuery();
			// 光标向后移动，并判断是否有效
			while(rs.next()){
				
				Salary_mg p = new Salary_mg();
				// 对id属性赋值
				p.setId(rs.getInt("id"));
				// 对username属性赋值
				p.setUsername(rs.getString("username"));
				// 对cheNo属性赋值
				p.setSalary_all(rs.getString("salary_all"));
				// 对shiyong_time属性赋值
				p.setSalary_type(rs.getString("salary_type"));
				// 对shijian属性赋值
				p.setSalary_per(rs.getString("salary_per"));
				// 对shijian属性赋值
				p.setSalary_time(rs.getString("salary_time"));
				// 对shijian属性赋值
				p.setBeizhu(rs.getString("beizhu"));
				list.add(p);
			}
			// 关闭ResultSet
			rs.close();
			// 关闭PreparedStatement
			ps.close();
			// 关闭Connection
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	/**
	 * 分页查询所有缴费信息
	 * @param page 页数
	 * @return List<Reg>
	 */
	public List<Salary_mg> find_salary2(int page,String username){
		// 创建List
		List<Salary_mg> list = new ArrayList<Salary_mg>();
		// 获取数据库连接
		Connection conn = getConnection();
		// 分页查询的SQL语句
		String sql = "select * from salary where username='"+username+"' order by id desc limit ?,?";
		try {
			// 获取PreparedStatement
			PreparedStatement ps = conn.prepareStatement(sql);
			// 对SQL语句中的第1个参数赋值
			ps.setInt(1, (page - 1) * Salary_mg.PAGE_SIZE);
			// 对SQL语句中的第2个参数赋值
			ps.setInt(2, Salary_mg.PAGE_SIZE);
			// 执行查询操作
			ResultSet rs = ps.executeQuery();
			// 光标向后移动，并判断是否有效
			while(rs.next()){
				
				Salary_mg p = new Salary_mg();
				// 对id属性赋值
				p.setId(rs.getInt("id"));
				// 对username属性赋值
				p.setUsername(rs.getString("username"));
				// 对cheNo属性赋值
				p.setSalary_all(rs.getString("salary_all"));
				// 对shiyong_time属性赋值
				p.setSalary_type(rs.getString("salary_type"));
				// 对shijian属性赋值
				p.setSalary_per(rs.getString("salary_per"));
				// 对shijian属性赋值
				p.setSalary_time(rs.getString("salary_time"));
				// 对shijian属性赋值
				p.setBeizhu(rs.getString("beizhu"));
				list.add(p);
			}
			// 关闭ResultSet
			rs.close();
			// 关闭PreparedStatement
			ps.close();
			// 关闭Connection
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	/**
	 * 分页查询所有投诉信息
	 * @param page 页数
	 * @return List<Reg>
	 */
	public List<Tousu_mg> find_tousu(int page){
		// 创建List
		List<Tousu_mg> list = new ArrayList<Tousu_mg>();
		// 获取数据库连接
		Connection conn = getConnection();
		// 分页查询的SQL语句
		String sql = "select * from tousu order by id desc limit ?,?";
		try {
			// 获取PreparedStatement
			PreparedStatement ps = conn.prepareStatement(sql);
			// 对SQL语句中的第1个参数赋值
			ps.setInt(1, (page - 1) * Tousu_mg.PAGE_SIZE);
			// 对SQL语句中的第2个参数赋值
			ps.setInt(2, Tousu_mg.PAGE_SIZE);
			// 执行查询操作
			ResultSet rs = ps.executeQuery();
			// 光标向后移动，并判断是否有效
			while(rs.next()){
				
				Tousu_mg p = new Tousu_mg();
				// 对id属性赋值
				p.setId(rs.getInt("id"));
				// 对title属性赋值
				p.setTitle(rs.getString("title"));
				// 对content属性赋值
				p.setContent(rs.getString("content"));
				// 对tou_time属性赋值
				p.setTou_time(rs.getString("tou_time"));
				// 对answer属性赋值
				p.setAnswer(rs.getString("answer"));
				// 对da_time属性赋值
				p.setDa_time(rs.getString("da_time"));
				// 对username属性赋值
				p.setUsername(rs.getString("username"));
				// 对tel属性赋值
				p.setTel(rs.getString("tel"));
				list.add(p);
			}
			// 关闭ResultSet
			rs.close();
			// 关闭PreparedStatement
			ps.close();
			// 关闭Connection
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	
	/**
	 * 查询总记录数
	 * @return 总记录数
	 */
	public int Counts(){
		// 总记录数
		int count = 0;
		// 获取数据库连接
		Connection conn = getConnection();
		// 查询总记录数SQL语句
		String sql = "select count(*) from yezhu";
		try {
			// 创建Statement
			Statement stmt = conn.createStatement();
			// 查询并获取ResultSet
			ResultSet rs = stmt.executeQuery(sql);
			// 光标向后移动，并判断是否有效
			if(rs.next()){
				// 对总记录数赋值
				count = rs.getInt(1);
			}
			// 关闭ResultSet
			rs.close();
			// 关闭Connection
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		// 返回总记录数
		return count;
	}
	
	/**
	 * 查询总记录数
	 * @return 总记录数
	 */
	public int Counts_chewei(){
		// 总记录数
		int count = 0;
		// 获取数据库连接
		Connection conn = getConnection();
		// 查询总记录数SQL语句
		String sql = "select count(*) from chewei";
		try {
			// 创建Statement
			Statement stmt = conn.createStatement();
			// 查询并获取ResultSet
			ResultSet rs = stmt.executeQuery(sql);
			// 光标向后移动，并判断是否有效
			if(rs.next()){
				// 对总记录数赋值
				count = rs.getInt(1);
			}
			// 关闭ResultSet
			rs.close();
			// 关闭Connection
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		// 返回总记录数
		return count;
	}
	
	/**
	 * 查询总记录数
	 * @return 总记录数
	 */
	public int Counts_chewei2(String username){
		// 总记录数
		int count = 0;
		// 获取数据库连接
		Connection conn = getConnection();
		// 查询总记录数SQL语句
		String sql = "select count(*) from chewei where username='"+username+"'";
		try {
			// 创建Statement
			Statement stmt = conn.createStatement();
			// 查询并获取ResultSet
			ResultSet rs = stmt.executeQuery(sql);
			// 光标向后移动，并判断是否有效
			if(rs.next()){
				// 对总记录数赋值
				count = rs.getInt(1);
			}
			// 关闭ResultSet
			rs.close();
			// 关闭Connection
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		// 返回总记录数
		return count;
	}
	/**
	 * 查询总记录数
	 * @return 总记录数
	 */
	public int Counts_salary(){
		// 总记录数
		int count = 0;
		// 获取数据库连接
		Connection conn = getConnection();
		// 查询总记录数SQL语句
		String sql = "select count(*) from salary";
		try {
			// 创建Statement
			Statement stmt = conn.createStatement();
			// 查询并获取ResultSet
			ResultSet rs = stmt.executeQuery(sql);
			// 光标向后移动，并判断是否有效
			if(rs.next()){
				// 对总记录数赋值
				count = rs.getInt(1);
			}
			// 关闭ResultSet
			rs.close();
			// 关闭Connection
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		// 返回总记录数
		return count;
	}
	
	/**
	 * 查询总记录数
	 * @return 总记录数
	 */
	public int Counts_salary2(String username){
		// 总记录数
		int count = 0;
		// 获取数据库连接
		Connection conn = getConnection();
		// 查询总记录数SQL语句
		String sql = "select count(*) from salary where username='"+username+"'";
		try {
			// 创建Statement
			Statement stmt = conn.createStatement();
			// 查询并获取ResultSet
			ResultSet rs = stmt.executeQuery(sql);
			// 光标向后移动，并判断是否有效
			if(rs.next()){
				// 对总记录数赋值
				count = rs.getInt(1);
			}
			// 关闭ResultSet
			rs.close();
			// 关闭Connection
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		// 返回总记录数
		return count;
	}
	
	/**
	 * 查询总记录数
	 * @return 总记录数
	 */
	public int Counts_tousu(){
		// 总记录数
		int count = 0;
		// 获取数据库连接
		Connection conn = getConnection();
		// 查询总记录数SQL语句
		String sql = "select count(*) from tousu";
		try {
			// 创建Statement
			Statement stmt = conn.createStatement();
			// 查询并获取ResultSet
			ResultSet rs = stmt.executeQuery(sql);
			// 光标向后移动，并判断是否有效
			if(rs.next()){
				// 对总记录数赋值
				count = rs.getInt(1);
			}
			// 关闭ResultSet
			rs.close();
			// 关闭Connection
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		// 返回总记录数
		return count;
	}
	
	/**
	 * 查询总记录数
	 * @return 总记录数
	 */
	public int Counts_baoxiu(){
		// 总记录数
		int count = 0;
		// 获取数据库连接
		Connection conn = getConnection();
		// 查询总记录数SQL语句
		String sql = "select count(*) from baoxiu";
		try {
			// 创建Statement
			Statement stmt = conn.createStatement();
			// 查询并获取ResultSet
			ResultSet rs = stmt.executeQuery(sql);
			// 光标向后移动，并判断是否有效
			if(rs.next()){
				// 对总记录数赋值
				count = rs.getInt(1);
			}
			// 关闭ResultSet
			rs.close();
			// 关闭Connection
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		// 返回总记录数
		return count;
	}
	/**
	 * 分页查询所有缴费信息
	 * @param page 页数
	 * @return List<Reg>
	 */
	public List<Chewei_mg> find_qianru(int page,String username){
		// 创建List
		List<Chewei_mg> list = new ArrayList<Chewei_mg>();
		// 获取数据库连接
		Connection conn = getConnection();
		// 分页查询的SQL语句
		String sql = "select * from qianru where username='"+username+"' order by id desc limit ?,?";
		try {
			// 获取PreparedStatement
			PreparedStatement ps = conn.prepareStatement(sql);
			// 对SQL语句中的第1个参数赋值
			ps.setInt(1, (page - 1) * Salary_mg.PAGE_SIZE);
			// 对SQL语句中的第2个参数赋值
			ps.setInt(2, Chewei_mg.PAGE_SIZE);
			// 执行查询操作
			ResultSet rs = ps.executeQuery();
			// 光标向后移动，并判断是否有效
			while(rs.next()){
				
				Chewei_mg p = new Chewei_mg();
				// 对id属性赋值
				p.setId(rs.getInt("id"));
				// 对username属性赋值
				p.setUsername(rs.getString("username"));
				// 对cheNo属性赋值
				p.setqNo(rs.getString("qNo"));
                //迁入时间
				p.setShiyong_time(rs.getString("shiyong_time"));
				list.add(p);
			}
			// 关闭ResultSet
			rs.close();
			// 关闭PreparedStatement
			ps.close();
			// 关闭Connection
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
}
