package front;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.controller.ContactCon;
import com.controller.ContentsCon;
import com.controller.LoginCon;
import com.controller.LogoutCon;
import com.controller.MemberBookmarkCon;
import com.controller.MemberContactCon;
import com.controller.MemberLoginCon;
import com.controller.NewsCon;
import com.controller.NewsDelBookmarkCon;
import com.controller.NewsMetaCon;
import com.controller.NewsTagCon;
import com.controller.SecessionCon;
import com.controller.TagBookmarkCon;
import com.controller.TagDelBookmarkCon;
import com.controller.MemberUpdateCon;
import com.controller.NewsBookmarkCon;
import com.controller.UpdateCon;

/**
 * Servlet implementation class FrontController
 */
@WebServlet("*.do")
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private HashMap<String, ICommand> map = new HashMap<String, ICommand>();
	
	public void inputMap() {
		map.put("ContactService.do",new ContactCon());
		map.put("LoginService.do", new LoginCon());
		map.put("LogoutService.do", new LogoutCon());
		map.put("NewsService.do", new NewsCon());
		map.put("NewsMetaService.do", new NewsMetaCon());
		map.put("SecessionService.do", new SecessionCon());
		map.put("UpdateService.do", new UpdateCon());
		map.put("MemberContactService.do", new MemberContactCon());
		map.put("MemberUpdateService.do", new MemberUpdateCon());
		map.put("MemberLoginService.do", new MemberLoginCon());
		map.put("ContentsService.do", new ContentsCon());
		map.put("NewsTagService.do", new NewsTagCon());
		map.put("TagBookmarkService.do", new TagBookmarkCon());
		map.put("NewsBookmarkService.do", new NewsBookmarkCon());
		map.put("MemberBookmarkService.do", new MemberBookmarkCon());
		map.put("NewsDelBookmarkService.do", new NewsDelBookmarkCon());
		map.put("TagDelBookmarkService.do", new TagDelBookmarkCon());
	}  
	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		request.setCharacterEncoding("UTF-8");
		
		String requestURI = request.getRequestURI();
		String contextPath = request.getContextPath();
		String resultURL = requestURI.substring(contextPath.length()+1);
		String moveURL = null;
		inputMap();
		
		ICommand iCommand = map.get(resultURL);
		moveURL = iCommand.execute(request, response);
		response.sendRedirect(moveURL);
	}

}
