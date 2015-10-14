package no.hal.pg.runtime.engine.http;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class ForwardingServlet extends HttpServlet {

	private String targetPath;
	private boolean redirect;
	
	public String getTargetPath() {
		return targetPath;
	}
	
	public void setTargetPath(String targetPath) {
		this.targetPath = targetPath;
	}
	
	public boolean isRedirect() {
		return redirect;
	}

	public void setRedirect(boolean redirect) {
		this.redirect = redirect;
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String location = getTargetPath();
		String queryString = req.getQueryString();
		if (queryString != null) {
			location = location + "?" + queryString;
		}
		if (isRedirect()) {
			resp.sendRedirect(location);
		} else {
			RequestDispatcher requestDispatcher = req.getRequestDispatcher(location);
			requestDispatcher.forward(req, resp);
		}
	}
}
