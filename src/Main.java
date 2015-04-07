/**
 * Created by Julia on 06.04.2015.
 */
public class Main {
    public static void main(String args[]) {
        Vector Axy = new Vector(2.0, 1.5, "A");
        Vector Axyz = new Vector(2.0, 1.5,-3,"B");
        Vector Some,Some2;
        Some=Vector.composeVector(2,-7,11,-5,"Some");
        Some2=Vector.composeVector(2,5,3,4,1,6,"Some2");

        //Тестирование функций сотворённых старостой
        System.out.println("---------------------------------------------");
        Vector v1=new Vector(1,1,1,"pervii");
        Vector v2=new Vector(1,1,0,"vtoroi");
        Vector v3=new Vector(6,6,6,"bezimyannii");


        //Тест угла
        System.out.println(Vector.angle(v2, v1));
        //Тест скалярного произведения
        System.out.println(Vector.dotProduct(v2, v1));
        //Тест векторного произведения
        System.out.println(Vector.crossProduct(v3,v2,"Vektornoeproyzvedenie").toString());


        //Тестирование функций сотворённых старостой
        System.out.println("---------------------------------------------");
        Vector v1=new Vector(1,1,1,"pervii");
        Vector v2=new Vector(1,1,0,"vtoroi");
        Vector v3=new Vector(6,6,6,"bezimyannii");

        //Тест сложения
        System.out.println(Vector.sum(v2,v3,"slogennie").toString());
        //Тест вычитания
        System.out.println(Vector.sum(v3,v1,"vichtennie").toString());
        System.out.println("---------------------------------------------");

        System.out.println(Axy);
        System.out.println(Axyz);
        System.out.println(Some);
        System.out.println(Some2);
    }
}
