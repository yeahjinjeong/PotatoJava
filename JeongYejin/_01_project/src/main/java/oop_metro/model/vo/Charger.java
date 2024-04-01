package oop_metro.model.vo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Charger {
    public void menu(Card card, int userId) {
        System.out.printf("사용자의 카드는 %s 입니다.", card.getCard());
        if (card.getCard().equals("climate")){
            card.getClimateCards()[userId].chargeClimate();
        } else if (card.getCard().equals("deferred")) {
            card.getDeferredCards()[userId].chargeDeferred();
        } else if (card.getCard().equals("prepaid")) {
            card.getPrepaidCards()[userId].chargePrepaid();
        }
    }
}
