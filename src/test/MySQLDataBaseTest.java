package test;

import static org.junit.Assert.*;

import main.MySQLDataBase;
import main.Table;

import org.junit.Test;

import com.gargoylesoftware.base.testing.EqualsTester;

public class MySQLDataBaseTest {

	@Test
	public final void testHashCode() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testEqualsObject() {
		MySQLDataBase first = new MySQLDataBase("crmp");
		MySQLDataBase firstA = new MySQLDataBase("crmp");
		MySQLDataBase firstB = new MySQLDataBase("crmp");
		MySQLDataBase second = new MySQLDataBase("crmp2");
		Table a = new Table("A");
		Table b = new Table("B");
		first.addTable(a);
		first.addTable(b);
		firstA.addTable(a);
		firstA.addTable(b);
		firstB.addTable(a);
		firstB.addTable(b);

		second.addTable(b);
		second.addTable(a);

		new EqualsTester(first, firstA, second, firstB);
	}

}
