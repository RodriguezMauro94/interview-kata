package com.interviewkata

class Child {
    var desiredGift: Gift? = null
    var obtainedGift: Gift? = null
    var name: String? = null

    fun showMeWhatYouGot() = "Soy " + name + " y recibi un " + obtainedGift!!.description
}
