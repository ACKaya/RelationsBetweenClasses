public class Player {
    private String name;
    private String surName;
    private int age;
    private int goalNumber;

    public Player(String name, String surName, int age, int goalNumber) {
        this.name = name;
        this.surName = surName;
        this.age = age;
        this.goalNumber = goalNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGoalNumber() {
        if(this.goalNumber<0){
            return 0;
        }

        return goalNumber;
    }

    public void setGoalNumber(int goalNumber) {
        this.goalNumber = goalNumber;
    }
}
