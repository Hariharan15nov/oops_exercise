package com.Hariharan;

public class Main {

    public static void main(String[] args) {

//        SumCalcultor class

        SumCalculator calculator = new SumCalculator();
        calculator.setFirstNumber(2.0);
        calculator.setSecondNumber(3);
        System.out.println("Add= " + calculator.getAdditionResult());
        System.out.println("Subtract= " + calculator.getSubtractionResult());
        System.out.println("Multiply= " + calculator.getMultiplicationResult());
        System.out.println("Divide= " + calculator.getDivisionResult());

//        Person class

        Person person = new Person();
        person.setFirstName("");
        person.setLastName("");
        person.setAge(10);
        System.out.println("FullName= " + person.getFullName());
        System.out.println("Teen= " + person.isTeen());

//        WallArea class

        WallArea wall = new WallArea(5,6);
        System.out.println("area= " + wall.getArea());

//        Point class

        Point first = new Point(5, 4);
        Point second = new Point(3, 2);
        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(3,2)= " + first.distance(3, 2));

//        CarpetCostCalculator class

        CarpetCostCalculator carpet = new CarpetCostCalculator(3.5);
        Floor floor = new Floor(2.75, 4.0);
        Calculator calculator1 = new Calculator(floor, carpet);
        System.out.println("total= " + calculator1.getTotalCost());

//        ComplexNumber class

        ComplexOperation one = new ComplexOperation(1.0, 1.0);
        ComplexOperation number = new ComplexOperation(2.5, -1.5);
        one.add(1,1);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());
        one.subtract(number);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());
        number.subtract(one);
        System.out.println("number.real= " + number.getReal());
        System.out.println("number.imaginary= " + number.getImaginary());

//        Cyinder class

        Circle circle = new Circle(3.75);
        System.out.println("circle.radius= " + circle.getRadius());
        System.out.println("circle.area= " + circle.getArea());
        Cylinder cylinder = new Cylinder(5.55, 7.25);
        System.out.println("cylinder.radius= " + cylinder.getRadius());
        System.out.println("cylinder.height= " + cylinder.getHeight());
        System.out.println("cylinder.area= " + cylinder.getArea());
        System.out.println("cylinder.volume= " + cylinder.getVolume());

//        Cuboid class

        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("rectangle.width= " + rectangle.getWidth());
        System.out.println("rectangle.length= " + rectangle.getLength());
        System.out.println("rectangle.area= " + rectangle.getArea());
        Cuboid cuboid = new Cuboid(5,10,5);
        System.out.println("cuboid.width= " + cuboid.getWidth());
        System.out.println("cuboid.length= " + cuboid.getLength());
        System.out.println("cuboid.area= " + cuboid.getArea());
        System.out.println("cuboid.height= " + cuboid.getHeight());
        System.out.println("cuboid.volume= " + cuboid.getVolume());
    }
}
