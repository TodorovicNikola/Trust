package helpers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;

import dtos.LaunchedProcessStatusDto;

public class HttpRequestHelper {

	public static final String baseURL = "http://localhost:8085";
	private String resourcePath;
	private URL url;
	private String apiKey;

	public HttpRequestHelper(String resourcePath) {
		this.resourcePath = resourcePath;
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

	public String sendGetRequest(Map<String, String> requestParams) {
		String getUrl = baseURL + resourcePath;
		int i = 0;

		for (String key : requestParams.keySet()) {
			if (i == 0) {
				getUrl = getUrl + "?" + key + "=" + requestParams.get(key);
			} else {
				getUrl = getUrl + "&" + key + "=" + requestParams.get(key);
			}
			i++;
		}

		System.out.println("Get request URL: " + getUrl);

		try {
			URL url = new URL(getUrl);

			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.setRequestMethod("GET");
//			con.setRequestProperty("Content-Type", "application/json; utf-8");
//			con.setRequestProperty("Accept", "application/json");
			con.setRequestProperty("Authorization", apiKey);
			con.setDoOutput(true);

			int responseCode = con.getResponseCode();
			System.out.println("GET Response Code :: " + responseCode);

			try (BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream(), "utf-8"))) {
				StringBuilder response = new StringBuilder();
				String responseLine = null;
				while ((responseLine = br.readLine()) != null) {
					response.append(responseLine.trim());
				}
				System.out.println("GET Response: " + response.toString());
				return response.toString();
			}

		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

}
