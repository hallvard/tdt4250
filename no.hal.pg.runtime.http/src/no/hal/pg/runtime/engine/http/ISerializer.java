package no.hal.pg.runtime.engine.http;

import java.io.Writer;

public interface ISerializer {

	public void serialize(Object object, Writer writer) throws Exception;
}
