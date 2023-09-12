package Encapsulation;

class RWonly{
    private String name;

    public void getter(){
        System.out.println(this.name);
    }
    public void setter(String s){
        this.name=s;
    }
}