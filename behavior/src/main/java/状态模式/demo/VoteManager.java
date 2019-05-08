package 状态模式.demo;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lichenxing on 2019/5/8.
 */
public class VoteManager {

    private VoteState state;
    //投票结果<用户名，投票选项>
    private Map<String,String> mapVote = new HashMap<>();
    //投票计数<用户名，投票次数>
    private Map<String,Integer> mapVoteCount = new HashMap<>();

    public Map<String, String> getMapVote() {
        return mapVote;
    }

    public void vote(String user,String voteItem) {
        Integer oldCount = mapVoteCount.get(user);
        if(oldCount == null) {
            oldCount = 0;
        }

        oldCount += 1;

        mapVoteCount.put(user,oldCount);

        if(oldCount == 1) {
            state = new NormalVoteState();
        } else if(oldCount >1 && oldCount <= 5) {
            state = new RepeatVoteState();
        } else if(oldCount >5 && oldCount <= 10) {
            state =new SpiteVoteState();
        } else if(oldCount > 10) {
            state = new BlackVoteState();
        }

        state.vote(user,voteItem,this);
    }
}
