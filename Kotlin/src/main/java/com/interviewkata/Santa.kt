package com.interviewkata

class Santa {
    var gifts =  mutableListOf(Gift("Trencito"), Gift("Bebote"))

    fun deliverGift(child: Child) {
        var gift: Gift? = null
        if (child.desiredGift == null) {
            gift = Gift("Chocolate")
        } else {
            gifts.forEach { giftInTheBag ->
                if (giftInTheBag == child.desiredGift) {
                    gift = giftInTheBag
                }
            }
            if (gift == null) {
                gift = Gift("Chocolate")
            }
            gifts.remove(gift!!)
        }
        child.obtainedGift = gift
    }
}
