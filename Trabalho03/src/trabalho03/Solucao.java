package trabalho03;
/**
 *
 * @author Gabriel Dreick
 */
import java.util.Scanner;

public class Solucao {
    private int n1, n2, n3, n4;
    
    private Scanner input = new Scanner(System.in);
    
    //__init__
    public void Solucao(){}
    
    
    // receives String and will try to convert to Int, if possible: return it.
    private int intput() {
        int num;
        while (true){
            
            try{
                String n = this.input.nextLine();
                num = Integer.parseInt(n);
                break;
            }
            catch(Exception e){
                System.out.println("EXCEPTION: " + e.getMessage());
                print("tente inserir um numero inteiro. ex: 10");
            }
        }
        
        return num;
    }
    
    
    //print function
    private void print(String txt) {
        System.out.println(txt);
    }
    
    
    //takes four numbers, and prints the sum of the first three the the sum of all four.
    public void soma4 () {
        print("1 numero: ");
        n1 = intput();
        
        print("2 numero: ");
        n2 = intput();
        
        print("3 numero: ");
        n3 = intput();
        
        print("4 numero: ");
        n4 = intput();
        
        print("A soma dos tres primeiros numeros informados e igual a " + (n1+n2+n3) + ".");
        print("A soma de todos os numeros e igual a " + (n1+n2+n3+n4)+ "."); 
    }
    
}
