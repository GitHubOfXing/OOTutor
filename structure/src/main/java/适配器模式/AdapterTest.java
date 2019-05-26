package 适配器模式;

/**
 * Created by lichenxing on 2019/5/26.
 */
public class AdapterTest {

    public static void main(String[] args) {
        IScoreOperation operation = new OperationAdapter() ;
        if (operation == null)
        {
            return;
        }

        int[] scores = { 84, 76, 50, 69, 90, 91, 88, 96 };
        int[] result;
        int score;

        System.out.println("测试成绩排序结果：");
        result = operation.sort(scores);
        for (int s : result)
        {
            System.out.println("{"+s+"}");
        }

        System.out.println("查找是否有90分的人：");
        score = operation.search(scores, 90);
        if (score == -1)
        {
            System.out.println("抱歉，这个真没找到~~~");
        }
        else
        {
            System.out.println("恭喜，的确存在90分选手~~~");
        }

        System.out.println("查找是否有92分的人：");
        score = operation.search(scores, 92);
        if (score == -1)
        {
            System.out.println("抱歉，这个真没找到~~~");
        }
        else
        {
            System.out.println("恭喜，的确存在92分选手~~~");
        }
    }
}
