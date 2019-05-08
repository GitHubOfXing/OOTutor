package 状态模式.demo;

/**
 * Created by lichenxing on 2019/5/8.
 */
public class BlackVoteState implements VoteState {
    @Override
    public void vote(String user, String voteItem, VoteManager voteManager) {
        System.out.println("进入黑名单，将禁止登录和使用本系统");
    }
}
