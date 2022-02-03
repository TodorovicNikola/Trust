package helpers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class HttpRequestHelper {

	public static final String baseURL = "http://localhost:8085";
	private URL url;
	private String apiKey;

	public HttpRequestHelper(String resourcePath) {
		try {
			this.url = new URL(baseURL + resourcePath);
			this.apiKey = ConfigHelper.getValueForParameter(ConfigParameters.API_KEY);
			System.out.println("API KEY: " + apiKey);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void sendPostRequest(String requestBody) throws IOException {
		HttpURLConnection con = (HttpURLConnection) url.openConnection();
		con.setRequestMethod("POST");
		con.setRequestProperty("Content-Type", "application/json; utf-8");
		con.setRequestProperty("Accept", "application/json");
		con.setRequestProperty("Authorization", apiKey);
		con.setDoOutput(true);

		try (OutputStream os = con.getOutputStream()) {
			byte[] input = requestBody.getBytes("utf-8");
			os.write(input, 0, input.length);
		}

		try (BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream(), "utf-8"))) {
			StringBuilder response = new StringBuilder();
			String responseLine = null;
			while ((responseLine = br.readLine()) != null) {
				response.append(responseLine.trim());
			}
			System.out.println(response.toString());
		}
	}

}
