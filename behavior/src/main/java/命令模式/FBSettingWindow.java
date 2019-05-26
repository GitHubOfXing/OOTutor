package 命令模式;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lichenxing on 2019/5/26.
 */
public class FBSettingWindow {

    public String title;

    private List<FuntionButton> buttonList = new ArrayList();

    public FBSettingWindow(String title) {
        this.title = title;
    }

    public void addFuctionButton(FuntionButton fb) {
        buttonList.add(fb);
    }

    public void removeFuctionButton(FuntionButton fb) {
        buttonList.remove(fb);
    }

    public void display() {
        for (FuntionButton fb:
             buttonList) {
            System.out.println(fb.getName());
        }
        System.out.println("===========");
    }


}
