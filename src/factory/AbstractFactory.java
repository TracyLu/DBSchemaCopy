package factory;

import java.sql.Connection;

public abstract class AbstractFactory {
	public abstract Connection createConnection();
	public abstract AbstractSourceDBSchemaResolver createSourceDBSchemaResolver();
}
