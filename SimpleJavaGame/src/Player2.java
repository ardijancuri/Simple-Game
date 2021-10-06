import java.util.Random;

public class Player2{
    private String name;
    private String weapon;
    private int health = 100;

    //default constructor
    public Player2(){
    }

    //constructor with parameters
    public Player2(String name, String weapon) {
        this.name = name;
        this.weapon = weapon;
    }

    //methods
    public void singleAttack(Player1 player1){
        Random objGenerator = new Random();
        int damage = objGenerator.nextInt(31);

        if(damage == 30){
            System.out.println("CRITICAL HIT!");
        }else if(damage == 0){
            System.out.println("MISS!");
        }

        player1.setHealth(player1.getHealth()-damage);
        System.out.println("Damage dealt with " +this.weapon + " is: " + damage);

        System.out.println("Player1 health is: " +player1.getHealth());
        System.out.println("Player2 health is: " +this.health);

        if(player1.getHealth() == 0){
            System.out.println("\n"+ player1.getName()+ " is dead!");
            System.out.println(this.getName()+ " is the winner");
        }
    }

    public void doubleAttack(Player1 player1) {
        Random objGenerator = new Random();
        int damage1 = objGenerator.nextInt(16);
        int damage2 = objGenerator.nextInt(16);

        player1.setHealth(player1.getHealth()-(damage1+damage2));
        System.out.println("First hit with " +this.weapon+ " dealt: "+ damage1 +" damage");
        System.out.println("Second hit with " +this.weapon+ " dealt: "+ damage2 +" damage\n");

        System.out.println("Player1 health is: " +player1.getHealth());
        System.out.println("Player2 health is: " +this.health);

        if(player1.getHealth() == 0){
            System.out.println("\n"+ player1.getName()+ " is dead!");
            System.out.println(this.getName()+ " is the winner");
        }
    }

    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapen) {
        this.weapon = weapen;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = Math.max(health, 0);
    }


}
