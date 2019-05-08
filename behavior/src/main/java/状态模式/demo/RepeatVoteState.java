package 状态模式.demo;

/**
 * Created by lichenxing on 2019/5/8.
 */
public class RepeatVoteState implements VoteState {
    @Override
    public void vote(String user, String voteItem, VoteManager voteManager) {
        System.out.println("请不要重复投票");
    }
}
