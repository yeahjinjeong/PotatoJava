package model.vo.user;


import model.vo.card.Card;

import java.util.ArrayList;
import java.util.List;

public class User {
    List<Card> userInfo = new ArrayList<>();

    {
        userInfo.add(new Card(0, "정예진", 24, "climate"));
        userInfo.add(new Card(1, "나지영", 24, "prepaid"));
        userInfo.add(new Card(2, "박수빈", 25, "deferred"));
    }
}
