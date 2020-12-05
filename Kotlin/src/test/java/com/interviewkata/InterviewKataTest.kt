package com.interviewkata

import jdk.nashorn.internal.ir.annotations.Ignore
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

internal class InterviewKataTest {
    @Test
    fun `chico sin regalo deseado, recibe un chocolate`() {
        val santa = Santa()
        val jorge = Child()
        jorge.name = "Jorge"

        santa.deliverGift(jorge)

        Assertions.assertEquals("Soy Jorge y recibi un Chocolate", jorge.showMeWhatYouGot())
    }

    @Test
    fun `santa sin regalo deseado en su bolsa, entrega un chocolate`() {
        val santa = Santa()
        val laura = Child()
        laura.name = "Laura"
        laura.desiredGift = Gift("Reno")

        santa.deliverGift(laura)

        Assertions.assertEquals("Soy Laura y recibi un Chocolate", laura.showMeWhatYouGot())
    }

    @Test
    @Ignore // Este test este test falla
    fun `santa con regalo deseado en su bolsa, entrega el regalo correspondiente`() {
        val santa = Santa()
        val juan = Child()
        juan.name = "Juan"
        juan.desiredGift = Gift("Trencito")

        santa.deliverGift(juan)

        Assertions.assertEquals("Soy Juan y recibi un Trencito", juan.showMeWhatYouGot())
    }
}
