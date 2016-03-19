package utility;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class SqlQueries {

	public static String[] getPPIDsForPriceTable(String num, String productLine, String env) {
		int x = Integer.parseInt(num);
		String[] prod = new String[x];
		try {
			int i = 0;
			Connection con = DriverManager.getConnection(Constant.getDBDetail.getDBconnectionDetail(env),
					Constant.getDBDetail.getDBUserName(env), Constant.getDBDetail.getDBPass(env));
			String sql = ("SELECT PPID FROM (SELECT PPID FROM products where PRODUCT_STATUS = 'A' and Product_line_code = '"
					+ productLine + "' ORDER BY DBMS_RANDOM.RANDOM) WHERE  rownum <=" + num);
			CallableStatement callStmt = con.prepareCall(sql);
			callStmt.execute();
			ResultSet rst = callStmt.getResultSet();
			while (rst.next()) {
				String product = rst.getString("PPID");
				prod[i] = product;
				i++;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return prod;

	}

	public static String[] getPPPIDsForOffer(String num, String productLine, String env) {
		int x = Integer.parseInt(num);
		String[] prod = new String[x];
		try {
			int i = 0;
			Connection con = DriverManager.getConnection(Constant.getDBDetail.getDBconnectionDetail(env),
					Constant.getDBDetail.getDBUserName(env), Constant.getDBDetail.getDBPass(env));
			String sql = ("SELECT ITEM_CODE FROM (SELECT ITEM_CODE FROM s_items where ITEM_STATUS = 'Active' and RECORD_TYPE = 'PPID' and Product_line_code = '"
					+ productLine + "' ORDER BY DBMS_RANDOM.RANDOM) WHERE  rownum <=" + num);
			CallableStatement callStmt = con.prepareCall(sql);
			callStmt.execute();
			ResultSet rst = callStmt.getResultSet();
			while (rst.next()) {
				String product = rst.getString("ITEM_CODE");
				prod[i] = product;
				i++;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return prod;
	}

}
