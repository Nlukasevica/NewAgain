public class FunctionCalculation {
    public static void main (String[] args){
        hello(" Daniel");
        hello(" Natasha");
        String student = " Mia";
        String teacher = " Lena";
        hello(student);
        hello (teacher);
        String city = "Riga";
        String state = "Baltic State";
        weather(city, state);
        weather("Wheeling","IL");
        lenghOfCircle(5);
        double area = getCircleArea(2);
        System.out.println("Get Cirlcle Area" + area);

    }
    public static void hello (String name){
        System.out.println("Privet," + name);
    }
    public static void weather (String city, String state){
        System.out.println("Today in " + city + " " + state + " is warm.");
    }
    public static void lenghOfCircle (int r){
        System.out.println("Area of the circle with radius  " + r + " is "+  2 * 3.14 * r);
    }
    public static double getCircleArea( int radius){
        double area = 3.14 * radius*radius;
        return area;



    }

}
