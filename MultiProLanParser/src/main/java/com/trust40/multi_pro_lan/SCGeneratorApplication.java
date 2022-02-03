package com.trust40.multi_pro_lan;

import com.trust40.multi_pro_lan.generator.hyperledger.golang.HyperledgerGolangGenerator;
import com.trust40.multi_pro_lan.parser.impl.CBPParser;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;
import java.io.IOException;
import java.util.Map;

public class SCGeneratorApplication {
    public static void main(String[] args) {
        try {
//            MASLParser maslParser = new MASLParser();
//
//            Map<String, Object> valueMap = maslParser.generateValueMapForModel("src/main/resources/source/MASL-PPM.process_modeling");
//            System.out.println(valueMap);
//            HyperledgerGolangGenerator.generate(valueMap);

            CBPParser cbpParser = new CBPParser();
            Map<String, Object> valueMap = cbpParser.generateValueMapForModel("src/main/resources/source/CBP.process_modeling");
            HyperledgerGolangGenerator.generateForCBP(valueMap);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (XPathExpressionException e) {
            e.printStackTrace();
        }
    }
}
