public class Main {
    public static void main(String[] args) {
        BmiService bmi = new BmiService();
        double index = bmi.calculate(80 ,1.80);
        System.out.println("Ваш индекс массы тела, " + index);
    }
}
