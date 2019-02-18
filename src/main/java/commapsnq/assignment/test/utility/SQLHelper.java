package commapsnq.assignment.test.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SQLHelper {
	
	String driver = EnvProperties.driver;
	String dbUserName= EnvProperties.dbUserName;
    String dbPassword= EnvProperties.dbPassword;
    String dbPort = EnvProperties.dbPort;
    String dbServiceName= EnvProperties.dbServiceName;
	
	public Map<String, String> runSelectQuerry(String dbUserName, String dbPassword, String dbHost, String dbPort,
			String dbServiceName, String query) {

		Connection conn = null;
		ResultSet results = null;
		ArrayList<String> lColumns = new ArrayList<String>();
		Map<String, String> tableData = new HashMap<String, String>();

		try {
			Class.forName(driver);
			String dbconnectionURL = "jdbc:oracle:thin:" + dbUserName + "/" + dbPassword + "@" + dbHost + ":" + dbPort
					+ ":" + dbServiceName;
			conn = DriverManager.getConnection(dbconnectionURL);
			if (conn != null) {
				results = conn.createStatement().executeQuery(query);
				if (results != null) {
					ResultSetMetaData columns = results.getMetaData();
					int i = 0;
					while (i < columns.getColumnCount()) {
						i++;
						lColumns.add(columns.getColumnName(i));
					}

					while (results.next()) {
						for (i = 0; i < lColumns.size(); i++) {
							tableData.put(lColumns.get(i), results.getString(lColumns.get(i)));

						}
					}
				}

			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {

			try {
				if (conn != null && !conn.isClosed()) {
					conn.close();
				}
			} catch (SQLException ex) {
				ex.printStackTrace();
			}

		}

		return tableData;
	}
	
	public List<String> runSelectQueryOMS(String dbUserName, String dbPassword, String dbHost, String dbPort,
			String dbServiceName, String query){
		String xmlString = "";
		List<String> dataList = new ArrayList<String>();
		try{
			Connection conn = null;
			ResultSet results = null;
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String dbconnectionURL = "jdbc:oracle:thin:" + dbUserName + "/" + dbPassword + "@" + dbHost + ":" + dbPort
					+ ":" + dbServiceName;	
			conn = DriverManager.getConnection(dbconnectionURL);
			results = conn.createStatement().executeQuery(query);
			while(results.next()){
				dataList.add(results.getString(1));
			}
			
			
			
		}catch(Exception e){
			e.printStackTrace();
		}
		return dataList;
		
	}
	
	public List<String> runSelectQueryTrip(String dbUserName, String dbPassword, String dbHost, String dbPort,
			    String dbServiceName,String query) {
		List<String> dataList = new ArrayList<String>();
		try{
			Connection conn = null;
			ResultSet results = null;
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String dbconnectionURL = "jdbc:oracle:thin:" + dbUserName + "/" + dbPassword + "@" + dbHost + ":" + dbPort
					+ ":" + dbServiceName;	
			conn = DriverManager.getConnection(dbconnectionURL);
			results = conn.createStatement().executeQuery(query);
			while(results.next()){
				dataList.add(results.getString(1));
			}
			
			
			
		}catch(Exception e){
			e.printStackTrace();
		}
		return dataList;
		
	}
	
	public void runInsertUpdateQuerry(String dbUserName, String dbPassword, String dbHost, String dbPort,
			String dbServiceName, ArrayList<String> queryList) {
		Connection conn = null;
		int result = 0;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String dbconnectionURL = "jdbc:oracle:thin:" + dbUserName + "/" + dbPassword + "@" + dbHost + ":" + dbPort
					+ ":" + dbServiceName;
			conn = DriverManager.getConnection(dbconnectionURL);
			if (conn != null) {
				for (int i = 0; i < queryList.size(); i++) {
					result = conn.createStatement().executeUpdate(queryList.get(i));
				}
				conn.commit();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			try {
				if (conn != null && !conn.isClosed()) {
					conn.close();
				}
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
		}
		//return result;
	}

}
