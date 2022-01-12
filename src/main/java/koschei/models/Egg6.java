package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Egg6 {
    private final Needle7 needle7;
@Autowired
    public Egg6(Needle7 needle7) {
        this.needle7 = needle7;
    }

    @Override
    public String toString() {
        return ", в яйце иголка " + needle7.toString();
    }
}


//@Component
//public class Wood3 {
//
//    private final Rabbit4 rabbit;
//
//    @Autowired
//    public Wood3(Rabbit4 rabbit) {
//        this.rabbit = rabbit;
//    }
//
//    @Override
//    public String toString() {
//        return ", на дереве заяц " + rabbit.toString();
//    }
//}