package main;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import comparators.TableComparator;

public class MySQLDataBase {
	private final String dbName;
	List<Table> tables = new LinkedList<Table>();

	public MySQLDataBase(String dbName) {
		this.dbName = dbName;
	}

	public void addTable(Table table) {
		this.tables.add(table);
	}

	public String getDbName() {
		return dbName;
	}

	@Override
	public String toString() {
		return "MySQLDataBase [tables=" + tables + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((tables == null) ? 0 : tables.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MySQLDataBase other = (MySQLDataBase) obj;
		if (tables == null) {
			if (other.tables != null)
				return false;
		} else {
			Collections.sort(tables, new TableComparator());
			Collections.sort(other.tables, new TableComparator());
			if (!tables.equals(other.tables))
				return false;
		}
		return true;
	}

}
