package trabalho02;

/**
 *
 * @author Gabriel Dreick
 */
public class MyThread extends Thread{
    public String msg;
    
    
    
    //__init__
    public MyThread(String msg){
        this.msg = msg;
    }
    
    
    @Override
    public void run() {
        
        for (int i = 0; i < 20; i++){
            System.out.println(msg);
        }
    }
    
    
    
    
    
}
