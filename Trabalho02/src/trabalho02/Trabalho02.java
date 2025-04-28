package trabalho02;
/**
 *
 * @author Gabriel Dreick
 */
public class Trabalho02 {
    
    public static void main(String[] args) {
        MyThread t1 = new MyThread("Seu primeiro nome");
        MyThread t2 = new MyThread("Nome do bairro que voce mora");
        MyThread t3 = new MyThread("Nome do seu pai");
        
        MyThread tt1 = new MyThread("Joao");
        MyThread tt2 = new MyThread("Barros");
        MyThread tt3 = new MyThread("Marcos");
        
        t1.start();
        t2.start();
        t3.start();
        
        tt1.start();
        tt2.start();
        tt3.start();
    }
    
}
