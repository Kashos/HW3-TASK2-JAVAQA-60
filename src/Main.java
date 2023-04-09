public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight_kg = 92; //Вес пользователя
        double height_m = 1.81; //Рост пользователя
        double bodyMassIndex = (int) service.calculate(weight_kg, height_m);
        System.out.println(bodyMassIndex);
    }
}

