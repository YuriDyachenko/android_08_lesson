package kurs;
/*
"я почему раньше таким злым был... - потому что у меня велосипеда не было!"
(с) почтальон Печкин
-----
на примере двух простых классов родителя и наследника поясню свою мысль (на уроке 8).
в классе Cat у меня есть метод "принт", который использует "геттер имени", а не обращение к полю
делаю новый класс CatWithSex и в нем переоопределяю "геттер имени" из класса родителя
тогда мне не нужно ничего делать с методом "принт", "сексуальные коты" могут его использовать,
при этом имя будет уже новое
----- результат работы программы -----
Барсик
Кошечка Чернышка
-----
вот для сохранения таких возможностей мне "хочется" внутри класса использовать геттеры
все время
*/
public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Барсик");
        cat.print();
        CatWithSex catWithSex = new CatWithSex("Чернышка", "Кошечка");
        catWithSex.print();
    }
}
