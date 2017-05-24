/**
 * 
 */
package org.dimigo.interfaces;

/**
 * <pre>
 * org.dimigo.interfaces
 *         |_ DBTest
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 5. 24.
 * <pre>
 *
 * @author				: 최동준
 * @version			: 1.0
 */
public class DBTest {

	public static void main(String[] args) {
		System.out.println("<< 변경 전 >>");
		IDBManager asdf = IDBManager.getDBManager(IDBManager.ORACLE_DATABASE);
		crud(asdf);
		System.out.println();
		
		System.out.println("<< 변경 후 >>");
		IDBManager qwer = IDBManager.getDBManager(IDBManager.SYBASE_DATABASE);
		crud(qwer);
		
		
	}
	private static void crud (IDBManager db){
		db.insert();
		db.search();
		db.updater();
		db.delete();
	}

}
