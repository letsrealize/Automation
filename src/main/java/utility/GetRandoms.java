package utility;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;

public class GetRandoms {

	public static class getDate {

		public static String startDate() {
			Calendar cal = Calendar.getInstance();
			cal.add(Calendar.MONDAY, 1);
			SimpleDateFormat format = new SimpleDateFormat("MMddyyyy");
			String startDate = format.format(cal.getTime());
			return startDate;

		}

		public static String endDate() {
			Calendar cal = Calendar.getInstance();
			cal.add(Calendar.MONDAY, 2);
			SimpleDateFormat format = new SimpleDateFormat("MMddyyyy");
			String endDate = format.format(cal.getTime());
			return endDate;
		}
	}

	public static String getNews() {
		try {
			URL rssUrl = new URL("http://rss.cnn.com/rss/cnn_world.rss"); // http://rss.cnn.com/rss/cnn_world.rss
																			// ,
																			// http://rss.cnn.com/rss/cnn_us.rss
			BufferedReader in = new BufferedReader(new InputStreamReader(rssUrl.openStream()));
			String sourceCode = "";
			String line;
			while ((line = in.readLine()) != null) {
				int titleEndIndex = 0;
				int titleStartIndex = 0;
				while (titleStartIndex >= 0) {
					titleStartIndex = line.indexOf("<title>", titleEndIndex);
					if (titleStartIndex >= 0) {
						titleEndIndex = line.indexOf("</title>", titleStartIndex);
						sourceCode += line.substring(titleStartIndex + "<title>".length(), titleEndIndex) + "\n\n";
					}
				}
			}
			in.close();

			// For random news
			String[] cnn = sourceCode.split("\n\n");
			int Low = 2;
			int High = cnn.length;
			Random r = new Random();
			return cnn[r.nextInt(High - Low) + Low];
		} catch (MalformedURLException ue) {
			System.out.println("Malformed URL");
		} catch (IOException ioe) {
			System.out.println("Something went wrong reading the contents");
		}
		return "error getting news";
	}

}
