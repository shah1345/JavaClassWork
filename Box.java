/*
Write a class named Box which has 3 instance variables[ width(double) , height(double) and
        depth(double)] ,one instance method[double volume()] and one constructor. Create two classes
        named Cube and DifferentShapedBox by inheriting the Box class. Is it possible to write the above
        program using “Abstract classes” ? If possible then:
        i) Complete the program using abstract class
ii) What is the advantage of using abstract class in question no – i

*/


public class Box {

    double width;
    double height;
    double depth;


    double volume(){

        return 0;
    }

}


class Cube extends Box {



}


class DifferentShapedBox extends Box {



}