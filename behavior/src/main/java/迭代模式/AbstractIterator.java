package 迭代模式;

public interface AbstractIterator {
    void Next();                                  // 移动至下一个元素

    boolean IsLast();                               // 判断是否为最后一个元素

    void Previous();                        // 移动至上一个元素

    boolean IsFirst();                             // 判断是否为第一个元素

    Object GetNextItem();           // 获取下一个元素

    Object GetPreviousItem();   // 获取上一个元素
}