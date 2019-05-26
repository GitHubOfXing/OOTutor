package 适配器模式;

/**
 * Created by lichenxing on 2019/5/26.
 */
public interface IScoreOperation {

    int[] sort(int[] array);

    int search(int[] array,int key);
}
