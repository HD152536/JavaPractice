/**
 * 
 */
package org.dimigo.interfaces;

/**
 * <pre>
 * org.dimigo.interfaces
 *         |_ IDBManager
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 5. 24.
 * <pre>
 *
 * @author				: 최동준
 * @version			: 1.0
 */
public interface IDBManager {
	
	public static final String ORACLE_DATABASE = "ORACLE";
	public static final String SYBASE_DATABASE = "SYBASE";
	
	public void insert();
	public void search();
	public void updater();
	public void delete();
	public static IDBManager getDBManager(String database) {
		IDBManager db = null;
		if(ORACLE_DATABASE.equalsIgnoreCase(database)){
			db = new OracleDB();
		}
		else {
			db = new SybaseDB();
		}
		return db;
	}
	

}
