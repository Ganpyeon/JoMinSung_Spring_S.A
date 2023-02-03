package S.A_1week;

public class Bus {
    public static void main(String[] args) {
        Transport bus1 = new Transport();
        bus1.setMaxPassenger(30);

        System.out.println(bus1.getNumber() + "번 버스가 만들어짐!" );
        System.out.println(bus1.getNumber() + "번 버스가 만들어짐!" );


        int b = 1000;
        bus1.passengerBoarding(5);
        bus1.person();
        bus1.pay(b);
        bus1.passengerQuit(2);
        bus1.person();
        bus1.pay(b);
        bus1.oiling(-50);
        bus1.setService(false);
        bus1.service();
        bus1.oiling(10);
        bus1.setService(true);
        bus1.service();
        bus1.passengerBoarding(+45);
        bus1.passengerBoarding(5);
        bus1.person();
        bus1.pay(b);
        bus1.oiling(-55);
        bus1.situation();
    }
}
