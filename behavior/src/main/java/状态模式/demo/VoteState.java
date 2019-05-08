package 状态模式.demo;

/**
 * Created by lichenxing on 2019/5/8.
 */
public interface VoteState {

    public void vote(String user,String voteItem,VoteManager voteManager);
}
