package 迭代模式;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lichenxing on 2019/5/26.
 */
public class IteratorTest {

    public static void main(String[] args) {
        List<Object> products = new ArrayList<Object>();
        products.add("倚天剑");
        products.add("屠龙刀");
        products.add("断肠草");
        products.add("葵花宝典");
        products.add("四十二章经");

        AbstractObjectList objectList = new ProductList(products);      // 创建聚合对象
        AbstractIterator iterator = objectList.CreateIterator();                // 创建迭代器对象

        System.out.println("正向遍历");
        while (!iterator.IsLast())
        {
            System.out.println(iterator.GetNextItem() + ",");
            iterator.Next();
        }

        System.out.println("-------------------------------------------------------");
        System.out.println("逆向遍历");
        while (!iterator.IsFirst())
        {
            System.out.println(iterator.GetPreviousItem() + ",");
            iterator.Previous();
        }
    }
}
