package dhzz.world.dbset.converter.util;

import org.w3c.dom.*;
import org.xml.sax.InputSource;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.InputStream;
import java.io.StringReader;
import java.util.*;

public class DbSetConverterUtils {
    public static String toXML(List<Map<String, Object>> list) {
        return null;
    };
    public static List<Map<String, Object>> fromXML(String xml) {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(new InputSource(new StringReader(xml)));
            Element root = document.getDocumentElement();
            List<Map<String, Object>> maps = convertRootElement(root);
            return maps;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    private static List<Map<String, Object>> convertRootElement(Element root) {
        List<Map<String, Object>> list = null;
        if ("DBSET".equals(root.getTagName())) {
            list = new ArrayList<>();
            // 处理节点属性
            if (root.hasAttributes()) {
                String result = root.getAttribute("RESULT");
                int rSize = result.matches("\\d+") ? Integer.parseInt(result) : 0;
                list = new ArrayList<>(rSize);
            }
            if (root.hasChildNodes()) convertRElement(root, list);
        }
        return list;




//        root.getAttribute("RESULT");
//        // 获取子元素
//        NodeList childNodes = root.getChildNodes();
//        for (int i = 0; i < childNodes.getLength(); i++) {
//            Node childNode = childNodes.item(i);
//            if (childNode instanceof Element) {
//                Element rElement = (Element) childNode;
//                // 对子元素进行操作...
//                Map<String, Object> rMap = new HashMap<>();
//
//            }
//
//        }
//        return null;
    }

    private static void convertRElement(Element root, List<Map<String, Object>> list) {
        // 获取子元素
        NodeList childNodes = root.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node childNode = childNodes.item(i);
            if (childNode instanceof Element) {
                Element rElement = (Element) childNode;
                // 对子元素进行操作...
                Map<String, Object> map = new HashMap<>();

            }
        }
    }


    public static void main(String[] args) {
        String xml = getXml("test.xml");
        List<Map<String, Object>> maps = DbSetConverterUtils.fromXML(xml);


    }

    private static String getXml(String fileName) {
        String xml = "";
        // 使用 ClassLoader 获取资源文件的输入流
        InputStream inputStream = DbSetConverterUtils.class.getClassLoader().getResourceAsStream(fileName);

        // 读取输入流中的内容到字符串
        if (inputStream != null) {
            try (Scanner scanner = new Scanner(inputStream, "UTF-8").useDelimiter("\\A")) {
                if (scanner.hasNext())
                    xml = scanner.next();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("File not found: " + fileName);
        }
        return xml;
    }
}
