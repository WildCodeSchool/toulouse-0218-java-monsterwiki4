package fr.nicolashoareau_toulousewcs.appliwikimonsterlegends;


public class StatModel {
    private int power;
    private int stamina;
    private int life;
    private int speed;

    public StatModel(int power, int stamina, int life, int speed) {
        this.power = power;
        this.stamina = stamina;
        this.life = life;
        this.speed = speed;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getStamina() {
        return stamina;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getLife() {
        return life;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }
}
