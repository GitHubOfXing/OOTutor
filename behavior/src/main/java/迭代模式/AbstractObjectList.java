package 迭代模式;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lichenxing on 2019/5/26.
 */
public abstract class AbstractObjectList {

    protected List<Object> objectList = new ArrayList<Object>();


    public AbstractObjectList (List<Object> objectList)
    {
        this.objectList = objectList;
    }


    public void addObject(Object obj)
    {
        this.objectList.add(obj);
    }

    public void removeObject(Object obj)
    {
        this.objectList.remove(obj);
    }

    public List<Object> GetObjectList()
    {
        return this.objectList;
    }

    // 声明创建迭代器对象的抽象工厂方法
    public abstract AbstractIterator CreateIterator();
}
