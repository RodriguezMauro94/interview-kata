package com.interviewkata;

import java.util.Arrays;
import java.util.List;

public class Santa {
    public List<Gift> gifts = Arrays.asList(new Gift("Trencito"), new Gift("Bebote"));

    public void deliverGift(Child child) {
        Gift gift = null;
        if (child.getDesiredGift() == null) {
            gift = new Gift("Chocolate");
        } else {
            for (Gift giftInTheBag : gifts) {
                if (giftInTheBag == child.getDesiredGift()) {
                    gift = giftInTheBag;
                    break;
                }
            }
            if (gift == null) {
                gift = new Gift("Chocolate");
            }
            gifts.remove(gift);
        }

        child.setObtainedGift(gift);
    }

    public List<Gift> getGifts() {
        return gifts;
    }

    public void setGifts(List<Gift> gifts) {
        this.gifts = gifts;
    }
}
