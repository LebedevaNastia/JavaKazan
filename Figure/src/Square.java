/**
 * by Anastasia Lebedeva on 11.11.2016.
 */
public class Square extends Figure implements Area { //создаем класс Квадрат; он наследует свойства класса Фигура; класс использует интерфейс Area

    double a; //создаем переменную a типа double
    double S; //создаем переменную S типа double


    public Square (double a){

        this.a = a; //указываем что переменной a задается значение параметра a
    }

    public double getArea(){ //внешний интерфейс, который считает площадь

        S = a*a; //вычисляем значение площади квадрата
        return S; //возвращаем полученное значение !!! возвращаем куда? в интерфейс?
    }
}

