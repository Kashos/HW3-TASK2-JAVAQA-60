public class BmiService {
        public double calculate (int a, double b) {
            int b1 = 2; //Степень для метода Math.pow
            double height_m2 = Math.pow(b, b1);
            double result =  a / height_m2 ; //Расчт бонусных миль
            return result;
        }
    }
