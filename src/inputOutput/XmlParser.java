/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inputOutput;

import java.io.IOException;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;


/**
 *
 * @author chris
 */
public class XmlParser {
    private ConnectionData connectionData;
    Document document;
   // private static final Logger logger = Logger();

    public XmlParser(String file) throws SAXException, IOException, ParserConfigurationException {
        parseXmlFile(file);
    }
    
    private void parseXmlFile(String file) throws IOException, ParserConfigurationException, SAXException{
        
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        
        
        try {
            
            DocumentBuilder db = dbf.newDocumentBuilder();
            
            
            
            document = db.parse(ClassLoader.getSystemResourceAsStream(file));
            
            
            NodeList nodeList = document.getDocumentElement().getChildNodes();
        
            for(int i = 0; i< nodeList.getLength(); i++){
                
                Node node = (Node) nodeList.item(i);
                        
                if(node instanceof Element){
                    
                    
                    String type = ((Element) node).getAttributes().getNamedItem("content").getNodeValue();
                    String fileName;
                    connectionData = new ConnectionData();
                    connectionData.setType(type);
                    NodeList childNodes = node.getChildNodes();
                    
                    String name = "";
                    int age =0;
                    int id=0;
                    for(int j = 0; j<childNodes.getLength();j++){
                        
                        Node cNode = (Node) childNodes.item(j);
                        
                        if(cNode instanceof Element){
                            String content = cNode.getLastChild().getTextContent().trim();
                            switch (cNode.getNodeName()){
                                case "url":
                                    connectionData.setUrl(content);
                                    break;
                                case "ipaddress":
                                    connectionData.setIpaddress(content);
                                    break;
                                case "port":
                                    connectionData.setPort(content);
                                    break;
                                case "database":
                                    connectionData.setDatabase(content);
                                    break;
                                case "login":
                                    connectionData.setLogin(content);
                                    break;
                                case "password":
                                    connectionData.setPassword(content);
                                    break;
                         
                            }
                        }
                    }
                }
            }
        }
        
        catch(ParserConfigurationException pce){
            pce.printStackTrace();
        }
        catch(SAXException se){
            se.printStackTrace();
        }
        catch(IOException ioe){
            ioe.printStackTrace();
            
        }
    }

    //getter for connectiondata
    public ConnectionData getConnectionData() {
        return connectionData;
    }
    
}


