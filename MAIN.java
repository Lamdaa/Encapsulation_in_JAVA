package Encapsulation;

public class MAIN {
    public static void main(String[] args) {
        RWonly rWonly  = new RWonly();

//        //Trying to set directly the name attribute
//        rWonly.name="Lamda";
//        //The above snippet shows the error "'name' has private access in 'Encapsulation.RWonly'"

//        //Trying to get directly the name attribute
//        System.out.println(rWonly.name);
//        //The above snippet shows the following error "'name' has private access in 'Encapsulation.RWonly'"

        //trying to set the name attribute using the setter
        rWonly.setter("Suraj");
        //trying to get the name attribute using getter
        rWonly.getter();
    }
}