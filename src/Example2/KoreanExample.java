package Example2;

public class KoreanExample {
    public static void main(String[] args) {
        Korean k1 = new Korean("박자바","011225-1234567");
        Korean k2 = new Korean("김자바","971111-1111111");
        System.out.println("k1.name:"+k1.name);
        System.out.println("k1.ssn:"+k1.ssn);
        System.out.println("k2.name:"+k2.name);
        System.out.println("k2.ssn:"+k1.ssn);

    }
}
