package mine;

public class BusMain {
    public static void main(String[] args) {

        Bus bus1 = new Bus(999);
        Bus bus2 = new Bus(989);



        //실행

        bus1.start(999,989);
        bus1.Onboard(2);
        bus1.ChargeOil(-50);
        bus1.statusChange();
        bus1.ChargeOil(10);
        bus1.statusChange();
        bus1.Onboard(45);
        bus1.Onboard(5);
        bus1.ChargeOil(-55);

    }
}
