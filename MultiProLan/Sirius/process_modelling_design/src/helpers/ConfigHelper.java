package helpers;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ConfigHelper {
	// NOTE: .cfg file must be located in the directory of the ECLIPSE itself! so,
	// resource directory is also there!
	private static final String configFile = "resources/core_partner.cfg";
//	private static final String configFile = "resources/additional_partner.cfg";
//	private static final String configFile = "resources/broker.cfg";
	private static final String configSeparator = "=";

	public static String getValueForParameter(String parameter) throws Exception {
//		System.out.println(Paths.get(".").toAbsolutePath().normalize().toString());
		List<String> configs = Files.readAllLines(Paths.get(configFile));

		for (String config : configs) {
//			System.out.println(config);
			if (config.startsWith(parameter)) {
				String[] apiKeyParamArray = config.split(configSeparator);
				return apiKeyParamArray[1];
			}
		}

		throw new Exception("Property doesn't exist!");

	}

}
