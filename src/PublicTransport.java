public class PublicTransport {

    int num;
    int fee;
    int oil = 100;
    int speed = 0;
    int speedChange;
    int remainingSeats;
    int inPassenger;
    String status = "";

    public PublicTransport(int num){
        this.num = num;
    }       //생성자 선언

    public void ChangeSpeed(int change){
        this.speedChange = change;
        speed += speedChange;
    }

    public void oilChange(int amount) {
        this.oil += amount;
    }
    public void Onboard(int person){
        this.inPassenger += person;
        this.remainingSeats -= person;
    }
}

