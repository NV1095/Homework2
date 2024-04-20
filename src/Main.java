public class Main {
    public static void main(String[] args) {
//Задача 1
        var dog=8.0;
        System.out.println(dog);
        var cat=3.6;
        System.out.println(cat);
        var paper=763789;
        System.out.println(paper);

        //Задача 2
        dog=dog+4;
        System.out.println(dog);
        cat=cat+4;
        System.out.println(cat);
        paper=paper+4;
        System.out.println(paper);

        //Задача 3
        dog=dog-3.5;
        System.out.println(dog);
        cat=cat-1.6;
        System.out.println(cat);
        paper=paper-7639;
        System.out.println(paper);

        //Задача 4
        var friend=19;
        System.out.println(friend);
        friend=friend+2;
        System.out.println(friend);
        friend=friend/7;
        System.out.println(friend);

        //Задача 5
        var frog=3.5;
        System.out.println(frog);
        frog=frog*10;
        System.out.println(frog);
        frog=frog/3.5;
        System.out.println(frog);
        frog=frog+4;
        System.out.println(frog);

        //Задача 6
        var boxerWeight1=78.2;
        var boxerWeight2=82.7;
        var totalWeight=boxerWeight1+boxerWeight2;
        System.out.println(totalWeight);
        var differenceWeight1=boxerWeight1-boxerWeight2;
        System.out.println(differenceWeight1);

        //Задача 7
        var differenceWeight2=boxerWeight2%boxerWeight1;
        System.out.println(differenceWeight2);

        //Задача 8
        var totalHours=640;
        var employeeHours=8;
        var totalEmployees=totalHours/employeeHours;
        System.out.println("Всего работников в компании "+totalEmployees+" человек");

        var totalEmployees2=totalEmployees+94;
        var totalHours2=totalEmployees2*employeeHours;
        System.out.println("Если в компании работает "+totalEmployees2+" человек, то всего "+totalHours2+" часов работы может быть поделено между сотрудниками");

    }
}