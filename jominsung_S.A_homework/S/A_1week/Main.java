package S.A_1week;

class Transport {
    //대중 교통 공통 속성
    private int number; // 차량 번호
    private int oiling = 100; // 주유량
    private int speed; // 속도
    private int maxPassenger; // 최대 승객수
    private int passenger; //현재 승객 수
    private int pay; // 요금
    private boolean service = true; // 운행 상태

    //대중 교통 공통 기능
    void service() {
        if (service) {
            if (oiling >= 10) {
                System.out.println("상태: 운행");
            }
        } else {
            System.out.println("상태: 차고지 행");
        }
    }

    void situation() {
        if (oiling < 10) {
            System.out.println("상태: 차고지 행");
            System.out.println("주유가 필요합니다.");
        }
    }
    //주유소
    void oiling(int a) {
        oiling = oiling + a;
        System.out.println("주유량 = " + oiling);
    }

    void speedUp() {
        if (oiling >= 10)
        speed += 10;
        System.out.println("속도 증가");
    }

    void speedDown() {
        speed -= 10;
        System.out.println("속도 감소");
    }

    void passengerBoarding(int per) {// 매개 변수는 외부에서 값을 받고싶을때 쓰는 변수 이다.
        if (service) {
            if (maxPassenger > passenger + per) {
                passenger = per;
                System.out.println("승객 탑승");
                System.out.println("탑승 승객 수 = " + passenger);
            } else {
                System.out.println("최대 승객 수를 넘었습니다.");
            }
        }
    }

    void passengerQuit(int per) {
        if (service) {
            if (maxPassenger >= passenger) {
                passenger -= per;
                System.out.println("승객 하차");
                System.out.println("탑승 승객 수 = " + passenger);
            } else if (passenger == 0) {
                System.out.println("승객이 없습니다.");
            }else {
                System.out.println("유효하지 않는 숫자입니다.");
            }
        }
    }

    void person() {
        int max = maxPassenger - passenger;
        System.out.println("잔여 승객 수 = " + max);
    }

    void pay(int a) {
        pay = a * passenger;
        System.out.println("요금 확인 = " + pay);
    }

    //getter and setter Alt + insert
    public int getPassenger() {
        return passenger;
    }

    public int getNumber() {
        return number = ++number;
    }


    public int getOiling() {
        return oiling;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getMaxPassenger() {
        return maxPassenger;
    }

    public void setMaxPassenger(int maxPassenger) {
        this.maxPassenger = maxPassenger;
    }

    public int getPay() {
        return pay;
    }


    public boolean isService() {
        return service;
    }

    public void setService(boolean service) {
        this.service = service;
    }
}

