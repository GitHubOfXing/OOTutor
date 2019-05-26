package 适配器模式;

/// <summary>
    /// 适配器：成绩操作适配器类
    /// </summary>
    public class OperationAdapter implements IScoreOperation
    {
        private QuickSortHelper sortTarget;
        private BinarySearchHelper searchTarget;

        public OperationAdapter()
        {
            sortTarget = new QuickSortHelper();
            searchTarget = new BinarySearchHelper();
        }

        @Override
        public int[] sort(int[] array) {
            return sortTarget.QuickSort(array);
        }

        @Override
        public int search(int[] array, int key) {
            return searchTarget.BinarySearch(array, key);
        }
    }