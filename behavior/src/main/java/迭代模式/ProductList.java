package 迭代模式;

import java.util.List;

/**
 * Created by lichenxing on 2019/5/26.
 */
public class ProductList extends AbstractObjectList {

    public ProductList(List<Object> objectList) {
        super(objectList);
    }

    @Override
    public AbstractIterator CreateIterator() {
        return new ProductIterator(this);
    }

    private class ProductIterator implements AbstractIterator {

        private ProductList productList;
        private List<Object> products;
        private int cursor1;    // 定义一个游标，用于记录正向遍历的位置
        private int cursor2;    // 定义一个游标，用于记录逆向遍历的位置

        public ProductIterator(ProductList productList)
        {
            this.productList = productList;
            this.products = productList.GetObjectList();       // 获取集合对象
            this.cursor1 = 0;                                                            // 设置正向遍历游标的初始值
            this.cursor2 = this.products.size() - 1;                 // 设置逆向遍历游标的初始值
        }

        @Override
        public void Next() {
            if (cursor1 < products.size())
            {
                cursor1++;
            }
        }

        @Override
        public boolean IsLast() {
            return cursor1 == products.size();
        }

        @Override
        public void Previous() {
            if (cursor2 > -1)
            {
                cursor2--;
            }
        }

        @Override
        public boolean IsFirst() {
            return cursor2 == -1;
        }

        @Override
        public Object GetNextItem() {
            return products.get(cursor1);
        }

        @Override
        public Object GetPreviousItem() {
            return products.get(cursor2);
        }
    }
}
