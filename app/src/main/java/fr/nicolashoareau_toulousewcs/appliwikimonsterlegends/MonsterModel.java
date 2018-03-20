package fr.nicolashoareau_toulousewcs.appliwikimonsterlegends;

public class MonsterModel {

    private int imgMonster;
    private String nameMonster;
    private int imgElement;
    private int imgElement2;

    public MonsterModel(int imgMonster, String nameMonster, int imgElement) {
        this.imgMonster = imgMonster;
        this.nameMonster = nameMonster;
        this.imgElement = imgElement;
    }

    public MonsterModel(int imgMonster, String nameMonster, int imgElement, int imgElement2) {
        this.imgMonster = imgMonster;
        this.nameMonster = nameMonster;
        this.imgElement = imgElement;
        this.imgElement2 = imgElement2;
    }

    public int getImgElement2() {
        return imgElement2;
    }

    public void setImgElement2(int imgElement2) {
        this.imgElement2 = imgElement2;
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

