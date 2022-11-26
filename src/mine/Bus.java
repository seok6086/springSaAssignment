package mine;

public class Bus extends Transport  { //상속
    int remainingSeats; //남은 좌석 재설정 30자리

    public Bus(int num) { //Transport 생성자 호출
        super(num);
    }
    //버스운행시작
    public void start(int number1, int number2){
        if (number1!=number2){
            System.out.println("버스"+ 999 +"번이 도착합니다.");
            System.out.println("버스"+ 989 +"번이 도착합니다.");
            System.out.println();
            status="운행중";
        }else{
            System.out.println("같은 버스입니다.");
            System.out.println();
        }

    }

    @Override

    public void Onboard(int person){
        //탑승
        if (status == "운행중") {
            if(person<=30){
                this.inPassenger += person;
                this.remainingSeats -= person;
                this.fare += 1000 * person;
                System.out.println("탑승 승객 수 = "+ this.inPassenger);
                System.out.println("잔여 승객 수 =" + this.remainingSeats);
                System.out.println("요금 확인 =" + this.fare);
                System.out.println();
            }else{
                System.out.println("최대 승객 수 초과");
                System.out.println();
            }
        }
    }
    @Override
    public void ChargeOil(int amount){
        this.oil += amount;
        if(amount<0) {
            if (oil < 10) {
                status = "차고지행";
                System.out.println("주유량 =" + oil);
                System.out.println("상태" + status);
                System.out.println("주유가 필요합니다.");
                System.out.println();
                //기름이 떨어졌을 때
            } else {
                System.out.println("주유량" + oil);
                System.out.println();
                //남은 기름 양
            }
        }else{ //기름 넣을 때
            System.out.println("상태 = " + status);
            System.out.println("주유량 = "+oil);
            System.out.println();

        }
    }

    public void statusChange() {
        // 상태변경, status="운행중","차고지행"
        if (status == "차고지행") {
            if (oil >= 10) {
                status = "운행중";

            } else {        // 차고지로 가는 경우, 승객 모두 하차
                status = "차고지행";
                this.inPassenger=0;
                this.remainingSeats=30;
                this.fare=0;
            }
        } else {        // 차고지로 가는 경우, 승객 모두 하차
            status = "차고지행";
            this.inPassenger=0;
            this.remainingSeats=30;
            this.fare=0;
        }
    }
}
