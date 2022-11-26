package mine;

public class Transport {

    int num; //번호
    int fare; //요금
    int oil = 100; //주유량
    int speed=0; //속도
    int speedChange; //속도 변경
    int inPassenger; //승객
    int remainingSeats; //남은 좌석
    String status = ""; //상태

    public Transport(int num){
        this.num=num; //생성자 선언
    }
    public void ChangeSpeed(int change){ //속도변경
        this.speedChange= change;
        speed += speedChange;
    }
    public void ChargeOil(int amount){ //주유량
        this.oil += amount;

    }
    public void Onboard(int person){
        this.inPassenger += person;
        this.remainingSeats -=person;
    }


}
