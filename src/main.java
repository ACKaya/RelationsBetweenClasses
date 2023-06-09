public class main {
    public static void main(String[] args) {
        Player p1=new Player("ANIL","KELES",23,30);
        Player p2=new Player("ANIL","KAYA",23,-10);
        Player[] player={p1,p2};
        Team t1=new Team("CIMBOM","****");
        System.out.println("TOTAL GOAL NUMBER:"+t1.calcAvarageGoal(player));


    }
}
