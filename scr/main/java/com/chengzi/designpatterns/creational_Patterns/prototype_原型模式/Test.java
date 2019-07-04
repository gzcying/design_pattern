package com.chengzi.designpatterns.creational_Patterns.prototype_原型模式;

import java.io.IOException;

/**
 * 这种模式是实现了一个原型接口，该接口用于创建当前对象的克隆。当直接创建对象的代价比较大时，则采用这种模式。
 * 例如，一个对象需要在一个高代价的数据库操作之后被创建。
 * 我们可以缓存该对象，在下一个请求时返回它的克隆，在需要的时候更新数据库，以此来减少数据库调用。
 */
public class Test {

    //原型模式是通过拷贝一个现有对象生成新对象的。
    // 浅拷贝实现 Cloneable，重写，
    // 深拷贝是通过实现 Serializable 读取二进制流。
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //加载缓存
        ShapeCache.loadCache();

        Shape clonedShape = ShapeCache.getShape(Shape.ShapeType.Circle);
        clonedShape.setId("1111111");
        System.out.println("Shape : " + clonedShape);

        Shape clonedShape2 = ShapeCache.getShape(Shape.ShapeType.Rectangle);
        clonedShape2.setId("222222");
        System.out.println("Shape2 : " + clonedShape2);

        Shape clonedShape3 = ShapeCache.getShape(Shape.ShapeType.Square);
        clonedShape3.setId("3333");
        System.out.println("Shape3 : " + clonedShape3);
    }
}