package fr.nicolashoareau_toulousewcs.appliwikimonsterlegends;


public class MonsterMainModel {

    private int imgMonster;
    private String nameMonster;
    private int imgElement;

    public MonsterMainModel(int imgMonster, String nameMonster, int imgElement) {
        this.imgMonster = imgMonster;
        this.nameMonster = nameMonster;
        this.imgElement = imgElement;
    }

    public int getImgMonster() {
        return imgMonster;
    }

    public void setImgMonster(int imgMonster) {
        this.imgMonster = imgMonster;
    }

    public String getNameMonster() {
        return nameMonster;
    }

    public void setNameMonster(String nameMonster) {
        this.nameMonster = nameMonster;
    }

    public int getImgElement() {
        return imgElement;
    }

    public void setImgElement(int imgElement) {
        this.imgElement = imgElement;
    }
}
