package com.demo.work;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.util.List;

public class Dom4j {
    public static void main(String[] args) throws DocumentException {
        SAXReader reader = new SAXReader();
        Document document = reader.read(Dom4j.class.getResourceAsStream("person.xml"));
        //获取根元素 goods
        Element elemRoot = document.getRootElement();

        //获取根元素的所有子元素 good
        List<Element>list = elemRoot.elements();
        //遍历集合 获取每一个good
        for (Element element : list){
            //获取good的id属性
            String id = element.attributeValue("id");
            System.out.println("id:"+id);

            //获取book下的所有子元素 name，author.sale
            List<Element>listElem = element.elements();
            //遍历集合获取每一个子元素
            for (Element elem : listElem) {
                //元素名
                String name = elem.getName();
                //文本值
                String text = elem.getText();
                System.out.println("---"+name+" : "+text);
            }
        }
    }
}
