package dianya;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        //多态

        DianYa5 dy=new Adapter(new DC220());
        dy.output();
    }
}
