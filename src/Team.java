public class Team {
    private String name;
    private String yildiz;
    private double avarageGoal;

    public Team(String name, String yildiz) {
        this.name = name;
        this.yildiz = yildiz;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYildiz() {
        return yildiz;
    }

    public void setYildiz(String yildiz) {
        this.yildiz = yildiz;
    }
   public double calcAvarageGoal(Player[] players){
        Player p3=new Player("Guney","Kaya",18,5);
        double total=0;
        for(Player player:players){
            total+=player.getGoalNumber();

        }


        return total;
   }

}
