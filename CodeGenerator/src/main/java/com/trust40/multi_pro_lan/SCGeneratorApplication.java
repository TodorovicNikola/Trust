package com.trust40.multi_pro_lan;

import com.trust40.multi_pro_lan.generator.hyperledger.golang.HyperledgerGolangGenerator;
import com.trust40.multi_pro_lan.parser.impl.IPParser;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;
import java.io.IOException;
import java.util.Map;

public class SCGeneratorApplication {
    public static void main(String[] args) {
        try {
            IPParser ipParser = new IPParser();

            Map<String, Object> valueMap = ipParser.generateValueMapForModel("src/main/resources/source/MASL-PPM.process_modeling");
            System.out.println(valueMap);
            HyperledgerGolangGenerator.generateForIP(valueMap);

//            CBPParser cbpParser = new CBPParser();
//            Map<String, Object> valueMap = cbpParser.generateValueMapForModel("src/main/resources/source/CBP_NEW.process_modeling");
//            HyperledgerGolangGenerator.generateForCBP(valueMap);

        } catch (IOException | SAXException | ParserConfigurationException | XPathExpressionException e) {
            e.printStackTrace();
        }
    }
}
