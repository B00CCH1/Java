import java.util.Scanner;

public class Toko  {
    String melodi[] = {};
    public static void main(String[] args) {
        Scanner input  =  new Scanner(System.in);
        System.out.println("what you want to buy?");
        System.out.println("Guitar / Piano / Drum");
        String melodi = input.nextLine();
    

        switch (melodi) {
            case Guitar : 
            System.out.println("harga  = 1.200.000 Rp ");
                System.out.println("Stock = 219");
                break;
        
                case Piano :
                System.out.println("harga =  9.000.000 Rp");
                System.out.println("Stock = 108 ");
                break;
               case Drum : System.out.println(" harga = 20.000.000 Rp");
               System.out.println("Stock = 20 ");

               break;
            default:
                break;
        }
       }
        
     }
    

