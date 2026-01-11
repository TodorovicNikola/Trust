package com.trust40.col_pro_lan;

import com.trust40.col_pro_lan.generator.hyperledger.golang.HyperledgerGolangGenerator;
import com.trust40.col_pro_lan.parser.impl.CBPParser;
import com.trust40.col_pro_lan.parser.impl.IPParser;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;
import java.io.IOException;
import java.util.Map;

public class SCGeneratorApplication {
	public static void main(String[] args) {
		try {
			Map<String, Object> valueMap;
			
            IPParser ipParser = new IPParser();

            valueMap = ipParser.generateValueMapForModel("src/main/resources/source/SampleIP.process_modeling");
            System.out.println(valueMap);
            HyperledgerGolangGenerator.generateForIP(valueMap);

			System.out.println("###########################################################################");
			CBPParser cbpParser = new CBPParser();
			valueMap = cbpParser
					.generateValueMapForModel("src/main/resources/source/SampleCBP.process_modeling");
            HyperledgerGolangGenerator.generateForCBP(valueMap);

		} catch (IOException | SAXException | ParserConfigurationException | XPathExpressionException e) {
			e.printStackTrace();
		}
	}
}
