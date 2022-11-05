package data_types;
import data_types.DataTypeEx;
import data_types.play_ground.WeakMonster;
import data_types.player.Player;

public class DataTypesExTest {
    public static void main(String[] args) {
        Player aragonHijoDeArathor = new Player();
        Player gimblyHijoDeGloen = new Player();

        WeakMonster minRat = new WeakMonster();
        WeakMonster boneLord = new WeakMonster();

        aragonHijoDeArathor.setName("Aragon");
        aragonHijoDeArathor.setLevel(13);
        aragonHijoDeArathor.setVocation("Knigh");

        System.out.println("Player1:"+aragonHijoDeArathor.getName()+"  "+aragonHijoDeArathor.getVocation()+""+aragonHijoDeArathor.getLevel());


    }

}
