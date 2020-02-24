package bao.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
import bao.Salary_mg;
import bao.Conn;
 
/**
 * Servlet implementation class SalaryServlet
 */
public class SalaryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// ��ǰҳ��
		int currPage = 1;
		// �жϴ���ҳ���Ƿ���Ч
		if(request.getParameter("page") != null){
			// �Ե�ǰҳ�븳ֵ
			currPage = Integer.parseInt(request.getParameter("page"));
		}
		// ʵ����
		Conn tt = new Conn();
		// ��ѯ������Ϣ
		List<Salary_mg> list = tt.find_salary(currPage);
		
		// ��list���õ�request֮��
		request.setAttribute("list", list);
		// ��ҳ��
		int pages ;
		// ��ѯ�ܼ�¼��
		int count = tt.Counts_salary();
		// ������ҳ��
		if(count % Salary_mg.PAGE_SIZE == 0){
			// ����ҳ����ֵ
			pages = count / Salary_mg.PAGE_SIZE;
		}else{
			// ����ҳ����ֵ
			pages = count / Salary_mg.PAGE_SIZE + 1;
		}
		// ʵ����StringBuffer
		StringBuffer sb = new StringBuffer();
		// ͨ��ѭ��������ҳ��
		for(int i=1; i <= pages; i++){
			// �ж��Ƿ�Ϊ��ǰҳ
			if(i == currPage){
				// ������ҳ��
				sb.append("[" + i + "]");
			}else{
				// ������ҳ��
				sb.append("<a href='SalaryServlet?page=" + i + "'>" + i + "</a>");
			}
			// ������ҳ��
			sb.append("��");
		}
		// ����ҳ�����ַ������õ�request֮��
		request.setAttribute("bar", sb.toString());
		// ת����danganmg.jspҳ��

		request.getRequestDispatcher("salary_mg.jsp").forward(request, response);
	}
}