package no.hal.pg.runtime.engine.http;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import no.hal.pg.runtime.engine.IEngine;

@SuppressWarnings("serial")
public class EngineServlet extends HttpServlet {

	private final IEngine engine;
	private final Collection<String> aliases;
	
	public EngineServlet(IEngine engine, Collection<String> aliases) {
		this.engine = engine;
		this.aliases = aliases;
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("application/json");
		writeResponse(resp.getWriter(), 0);
	}

	void writeResponse(PrintWriter writer, int indent) {
		indent(writer, indent);
		writer.println("\"" + engine.getKey() + "\" : [");
		boolean first = true;
		for (String alias : aliases) {
			if (! first) {
				writer.println(", ");
			}
			indent(writer, indent + 1);
			writer.print("\"" + alias + "\"");
			first = false;
		}
		writer.println();
		indent(writer, indent);
		writer.println("]");
	}

	private void indent(PrintWriter writer, int indent) {
		while (indent-- > 0) {
			writer.print("   ");
		}
	}
}
