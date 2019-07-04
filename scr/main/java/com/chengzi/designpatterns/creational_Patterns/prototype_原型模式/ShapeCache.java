package com.chengzi.designpatterns.creational_Patterns.prototype_原型模式;

import java.io.*;
import java.util.concurrent.ConcurrentHashMap;

public class ShapeCache {

    private static ConcurrentHashMap<Shape.ShapeType, Shape> shapeMap = new ConcurrentHashMap();

    public static Shape getShape(Shape.ShapeType shapeType) throws IOException, ClassNotFoundException {
        Shape cachedShape = shapeMap.get(shapeType);
        //Shape clone = (Shape) cachedShape.clone();
        Shape clone = DeepClone(cachedShape);
        return clone;
    }

    private static Shape DeepClone(Shape cachedShape) throws IOException, ClassNotFoundException {
        ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(byteOut);
        oos.writeObject(cachedShape);
        ObjectInputStream objectInput = new ObjectInputStream(new ByteArrayInputStream(byteOut.toByteArray()));
         return  (Shape) objectInput.readObject();
    }


    // 对每种形状都运行数据库查询，并创建该形状
    // shapeMap.put(shapeKey, shape);
    // 例如，我们要添加三种形状
    public static void loadCache() {
        Circle circle = new Circle();
        shapeMap.put(Shape.ShapeType.Circle, circle);

        Square square = new Square();
        shapeMap.put(Shape.ShapeType.Square, square);

        Rectangle rectangle = new Rectangle();
        shapeMap.put(Shape.ShapeType.Rectangle, rectangle);
    }
}