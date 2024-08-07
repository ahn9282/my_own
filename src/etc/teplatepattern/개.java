package etc.teplatepattern;

public class 개 extends 동물 {
    @Override
    public void 소리내기() {
        System.out.println("멍멍!");
    }

    @Override
    public void 달리기() {
        System.out.print("26KM/h");
        super.달리기();

    }
}
