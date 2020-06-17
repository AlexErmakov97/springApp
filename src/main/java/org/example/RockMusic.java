package org.example;

public class RockMusic implements Music {
    private RockMusic (){}

    //фабричный метод
    public static RockMusic getRockMusicInstance(){
        return new RockMusic();
    }

    public void initMethod() {
        System.out.println("Do initialization bean");
    }

    public void destroyMethod() {
        System.out.println("Do destruction bean");
    }

    @Override
    public String getSong() {
        return "Paint it, black";
    }
}
