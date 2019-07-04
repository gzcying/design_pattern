package com.chengzi.designpatterns.behavioral_Patterns.Iterator_pattern;

//“https://www.runoob.com/design-pattern/iterator-pattern.html”
public class IteratorPatternDemo {


   //提供一种方法顺序访问一个聚合对象中各个元素, 而又无须暴露该对象的内部表示。
   public static void main(String[] args) {
      String[] names = {"Robert", "John", "Julie", "Lora"};
      NameRepository namesRepository = new NameRepository(names);
      NameRepository namesRepository2 = new NameRepository(names);
      Iterator iter = namesRepository.getIterator();
      while (iter.hasNext()){
         String name = (String)iter.next();
         System.out.println("Name : " + name);
      }  
   }
}