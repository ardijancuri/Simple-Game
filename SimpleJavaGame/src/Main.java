import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Player1 name: ");
        String name1 = sc.nextLine();
        System.out.println("Gun1 name: ");
        String gun1 = sc.nextLine();
        Player1 player1 = new Player1(name1,gun1);

        System.out.println("Player2 name: ");
        String name2 = sc.nextLine();
        System.out.println("Gun2 name: ");
        String gun2 = sc.nextLine();
        Player2 player2 = new Player2(name2,gun2);


        boolean turn = true;
        while(player1.getHealth() != 0 && player2.getHealth() != 0){

            if(turn){
                System.out.println("\n"+ player1.getName()+ "'s turn to strike, chose between: 1.Single Attack / 2.Double Attack");
                int choose = sc.nextInt();
                if(choose == 1){
                    player1.singleAttack(player2);
                }else {
                    player1.doubleAttack(player2);
                }

                turn = false;
            }else{
                System.out.println("\n"+ player2.getName()+ "'s turn to strike, chose between: 1. Single Attack / 2. Double Attack");
                int choose = sc.nextInt();
                if(choose == 1){
                    player2.singleAttack(player1);
                }else {
                    player2.doubleAttack(player1);
                }

                turn = true;
            }
        }

    }


}
