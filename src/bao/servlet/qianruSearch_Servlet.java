package bao.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bao.Conn;
import bao.Chewei_mg;

/**
 * Servlet implementation class qianruSearch_Servlet
 */
public class qianruSearch_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public qianruSearch_Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
		private static final long serialVersionUID1 = 1L;
	       
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			String username;
			// ��ǰҳ��
			int currPage = 1;
			// �жϴ���ҳ���Ƿ���Ч
			if(request.getParameter("page") != null){
				// �Ե�ǰҳ�븳ֵ
				currPage = Integer.parseInt(request.getParameter("page"));
			}
			// ʵ����
			username=new String(request.getParameter("username").getBytes("ISO-8859-1"),"GB18030");
			Conn tt = new Conn();
			// ��ѯ������Ϣ
			List<Chewei_mg> list = tt.find_qianru(currPage,username);
			
			// ��list���õ�request֮��
			request.setAttribute("list", list);
			// ��ҳ��
			int pages ;
			// ��ѯ�ܼ�¼��
			int count = tt.Counts_salary2(username);
			// ������ҳ��
			if(count % Chewei_mg.PAGE_SIZE == 0){
				// ����ҳ����ֵ
				pages = count / Chewei_mg.PAGE_SIZE;
			}else{
				// ����ҳ����ֵ
				pages = count / Chewei_mg.PAGE_SIZE + 1;
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
					sb.append("<a href='qianruSearch_Servlet?page=" + i + "'>" + i + "</a>");
				}
				// ������ҳ��
				sb.append("��");
			}
			// ����ҳ�����ַ������õ�request֮��
			request.setAttribute("bar", sb.toString());
			// ת����danganmg.jspҳ��

			request.getRequestDispatcher("salary_search_list.jsp").forward(request, response);
		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
