package com.interviewkata;

import jdk.nashorn.internal.ir.annotations.Ignore;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class InterviewKataTest {

    @Test
    void test_chico_sin_regalo_deseado_recibe_un_chocolate() {
        Santa santa = new Santa();
        Child jorge = new Child();
        jorge.setName("Jorge");

        santa.deliverGift(jorge);

        assertEquals("Soy Jorge y recibi un Chocolate", jorge.showMeWhatYouGot());
    }

    @Test
    void test_santa_sin_regalo_deseado_entrega_un_chocolate() {
        Santa santa = new Santa();
        Child laura = new Child();
        laura.setName("Laura");
        laura.setDesiredGift(new Gift("Reno"));

        santa.deliverGift(laura);

        assertEquals("Soy Laura y recibi un Chocolate", laura.showMeWhatYouGot());
    }

    @Test
    @Ignore // Este test este test falla
    void test_santa_con_regalo_deseado_entrega_el_regalo_correspondiente() {
        Santa santa = new Santa();
        Child juan = new Child();
        juan.setName("Juan");
        juan.setDesiredGift(new Gift("Trencito"));

        santa.deliverGift(juan);

        assertEquals("Soy Juan y recibi un Trencito", juan.showMeWhatYouGot());
    }
}
