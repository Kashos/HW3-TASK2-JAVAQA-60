public class BmiService {
    public double calculate(int weight, double height) {
        int degree = 2; //Степень для метода Math.pow
        double height_m2 = Math.pow(height, degree);
        double result = weight / height_m2; //Расчт бонусных миль
        return result;
    }
}
