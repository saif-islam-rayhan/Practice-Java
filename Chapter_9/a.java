

public interface a {
    default void showA(){
        System.out.println("Intake 51");
    }
}

interface b extends a{

}
interface c extends a{

}
class d implements b,c{

}

public void main(String[] args) {
    d d1=new d();
    d1.showA();
}