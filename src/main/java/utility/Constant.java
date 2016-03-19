package utility;

public class Constant {

	public static String getURL(String env) {
		final String qaURL = "http://10.92.41.174:8380/soma-webui/";
		final String intURL = "http://setup-int.guthy-renker.com/soma-webui/";
		final String uatURL = "http://setup-uat.guthy-renker.com/soma-webui/";
		env = env.toUpperCase();
		if (env.equals("QA")) {
			return qaURL;
		} else if (env.equals("INT")) {
			return intURL;
		} else if (env.equals("UAT")) {
			return uatURL;
		} else {
			return null;
		}
	}

	public static class getDBDetail {
		public static final String connectionDetailQA = "jdbc:oracle:thin:@ebsqa-scan.grc-network.net:1521/s_appdbtst";
		public static final String userQA = "setup";
		public static final String passQA = "APPTwe25yZ";
		public static final String connectionDetailINT = "jdbc:oracle:thin:@ebsqa-scan.grc-network.net:1521/appdbint";
		public static final String userINT = "setup";
		public static final String passINT = "APPIl94ma6";
		public static final String connectionDetailUAT = "jdbc:oracle:thin:@ebsqa-scan.grc-network.net:1521/s_appdbuat";
		public static final String userUAT = "setup";
		public static final String passUAT = "APPUI3erty";

		public static String getDBUserName(String env) {
			String user = null;
			switch (env) {
			case "QA":
				user = userQA;
				break;
			case "INT":
				user = userINT;
			case "UAT":
				user = userUAT;
				break;
			}
			return user;
		}

		public static String getDBPass(String env) {
			String pass = null;
			switch (env) {
			case "QA":
				pass = passQA;
				break;
			case "INT":
				pass = passINT;
			case "UAT":
				pass = passUAT;
				break;
			}
			return pass;
		}

		public static String getDBconnectionDetail(String env) {
			String connectionDetail = null;
			switch (env) {
			case "QA":
				connectionDetail = connectionDetailQA;
				break;
			case "INT":
				connectionDetail = connectionDetailINT;
			case "UAT":
				connectionDetail = connectionDetailUAT;
				break;
			}
			return connectionDetail;
		}
	}

	public static final String Path_TestData = System.getProperty("user.dir") + "//src//main//java//testData//";
	public static final String File_TestData = "testData.xlsx";
	public static final String Path_ScreenShot = System.getProperty("user.dir") + "//src//main//java//screenShots//";

	public static final String userName = "kgautam_con";
	public static final String password = "kgGR2017";

	public static final int Col_TestCaseName = 0;
	public static final int Col_Env = 1;
	public static final int Col_Browser = 2;
	public static final int Col_UserName = 3;
	public static final int Col_Password = 4;
	public static final int Col_ProductLine = 5;

	// Test Data Sheet Columns
	public static class shippingTableData {
		public static final int Col_Description = 6;
		public static final int Col_Currency = 7;
		public static final int Col_Intent = 8;
		public static final int Col_StartDate = 9;
		public static final int Col_EndDate = 10;
		public static final int Col_NoOfShippingRange = 11;
		public static final int Col_ShippingTableCode = 12;
		public static final int Col_Status = 13;
	}
}
