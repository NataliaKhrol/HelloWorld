public class MyExc extends Exception{
    public MyExc (){

    }
    public MyExc(String message){
     // System.out.println("Что-то пошло не так");
       super(message);
    }
}
