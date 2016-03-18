package utility;

public class Constant {

	public static String getURL(String env) {
		final String qaURL = "10.92.41.174:8380/soma-webui/";
		final String intURL = "http://setup-int.guthy-renker.com/soma-webui/";
		final String uatURL = "http://setup-uat.guthy-renker.com/soma-webui/";
		env = env.toUpperCase();
		if (env.equals("QA")) {
			return qaURL;
		} else if (env.equals("INT")) {
			return intURL;
		} else if (env.equals("INT")) {
			return uatURL;
		} else {
			return null;
		}
	}

	public static class envDetail {
		public static class QA {
			public static final String userName = "kgautam_con";
			public static final String password = "kgGR2017";

			public static class database {
				public static final String connectionDetail = "jdbc:oracle:thin:@ebsqa-scan.grc-network.net:1521/s_appdbtst";
				public static final String user = "setup";
				public static final String pass = "APPTwe25yZ";
			}
		}

		public static class INT {
			public static final String userName = "kgautam_con";
			public static final String password = "kgGR2017";

			public static class database {
				public static final String connectionDetail = "jdbc:oracle:thin:@ebsqa-scan.grc-network.net:1521/appdbint";
				public static final String user = "setup";
				public static final String pass = "APPIl94ma6";
			}
		}

		public static class UAT {
			public static final String userName = "kgautam_con";
			public static final String password = "kgGR2017";

			public static class database {
				public static final String connectionDetail = "jdbc:oracle:thin:@ebsqa-scan.grc-network.net:1521/s_appdbuat";

				public static final String user = "setup";
				public static final String pass = "APPUI3erty";
			}
		}
	}

	public static final String Path_TestData = System.getProperty("user.dir") + "//src//main//java//testData//";
	public static final String File_TestData = "testData.xlsx";
	public static final String Path_ScreenShot = System.getProperty("user.dir") + "//src//main//java//screenShots//";

	public static final int Col_TestCaseName = 0;
	public static final int Col_Env = 1;
	public static final int Col_Browser = 2;
	public static final int Col_UserName = 3;
	public static final int Col_Password = 4;
	public static final int Col_ProductLine = 5;
	// Test Data Sheet Columns
	public static class shippingTableData
	{
	public static final int Col_Description = 6;
	public static final int Col_Currency = 7;
	public static final int Col_Intent = 8;
	public static final int Col_StartDate = 9;	
	public static final int Col_EndDate = 10;	
	public static final int Col_UpperBase = 11;	
	public static final int Col_Standard = 12;	
	public static final int Col_Rush = 13;	
	public static final int Col_2Day = 14;
	public static final int Col_SameDay = 15;	
	}
}
