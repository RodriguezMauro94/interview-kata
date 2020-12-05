package com.interviewkata;

public class Child {
    private Gift desiredGift;
    private Gift obtainedGift;
    private String name;

    public String showMeWhatYouGot() {
        return "Soy " + name + " y recibi un " + obtainedGift.getDescription();
    }

    public Gift getDesiredGift() {
        return desiredGift;
    }

    public void setDesiredGift(Gift desiredGift) {
        this.desiredGift = desiredGift;
    }

    public Gift getObtainedGift() {
        return obtainedGift;
    }

    public void setObtainedGift(Gift obtainedGift) {
        this.obtainedGift = obtainedGift;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
