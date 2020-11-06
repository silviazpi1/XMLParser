package com.nserrano;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class XMLReader {

        public XMLReader(){

            File inputXML = new File("concesionario.xml");

            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = null;
            Document doc = null;

            try {
                dBuilder = dbFactory.newDocumentBuilder();

                doc = dBuilder.parse(inputXML);

            }
            catch (Exception e) {
                e.printStackTrace();
            }
            doc.getDocumentElement().normalize();

            NodeList nList = doc.getElementsByTagName("coche");
            System.out.println("Número de coches: " + nList.getLength());


            for(int temp = 0; temp < nList.getLength(); temp++) {
                Node nNode = nList.item(temp);

                if(nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) nNode;

                    System.out.println("\nCoche id: " + eElement.getAttribute("id"));
                    System.out.println("Marca: "
                            + eElement.getElementsByTagName("marca").item(0).getTextContent());
                    System.out.println("Modelo: "
                            + eElement.getElementsByTagName("modelo").item(0).getTextContent());
                    System.out.println("Cilindrada: "
                            + eElement.getElementsByTagName("cilindrada").item(0).getTextContent());
                }
            }


        }




}
