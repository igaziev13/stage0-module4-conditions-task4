package school.mjc.stage0.conditions.task4;

public class TernaryMaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
        int maxNum;
        maxNum = first > second ? first : second;
        maxNum = maxNum > third ? maxNum : third;
        System.out.println(maxNum);
    }
}
