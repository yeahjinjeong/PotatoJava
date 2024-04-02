package run;

import model.vo.Charger;
import model.vo.Gate;
import model.vo.card.Card;
import model.vo.user.User;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Card[] cards = new Card[3];
        cards[0] = new Card(0, "정예진", 24, "climate");
        cards[1] = new Card(1, "나지영", 24, "prepaid");
        cards[2] = new Card(2, "박수빈", 25, "deferred");

        Scanner sc = new Scanner(System.in);
        Gate gate = new Gate();
        Charger charger = new Charger();

        System.out.print("ID를 입력하세요 : ");
        int userId = sc.nextInt();
        System.out.println("1. 지하철 이용 / 2. 충전 : ");
        int selected = sc.nextInt();



        switch (selected) {
            case 1 : gate.menu(); break;
            case 2 :
                charger.menu(cards[userId], userId);
                System.out.println(cards[userId].getName() +"님의 카드현황 입니다.");
                if (cards[userId].getCard().equals("climate")) {
                    System.out.println(cards[userId].getClimateCards()[userId]);
                } else if (cards[userId].getCard().equals("prepaid")) {
                    System.out.println(cards[userId].getPrepaidCards()[userId]);
                } else if (cards[userId].getCard().equals("deferred")) {
                    System.out.println(cards[userId].getDeferredCards()[userId]);
                }
        }
    }
}
