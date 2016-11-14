/**
 * by Anastasia Lebedeva on 11.11.2016.
 */
public class Triangle extends Figure implements Area { ////создаем класс Треугольник; он наследует свойства класса Фигура; класс использует интерфейс Area

    double a, b; //создаем переменные a и b типа double
    double S; //создаем переменную S типа double

    public Triangle (double a, double b){

        this.a = a; //указываем, что переменной a, задается параметр a
        this.b = b; //указываем, что переменной b, задается параметр b
    }

    public double getArea(){ //внешний интерфейс, который считает площадь

        S = a*b / 2; //вычисляем значение площади треугольника
        return S; //возвращаем полученное значение
    }




}
