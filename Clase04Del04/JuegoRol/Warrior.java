package Clase04Del04.JuegoRol;

/**
 * @author Thomy
 * @version 1.0
 * @created 04-abr.-2024 11:42:51
 */
public class Warrior extends BaseCharacter {

	private int potion;
	private int rage;


	public Warrior(boolean alive, int armor, int level, int magArmor, String name, int ps, int potion, int rage) {
		super(alive, armor, level, magArmor, name, ps);
		this.potion = potion;
		this.rage = rage;
	}

	public int attack(){
		return 0;
	}


	public void usePotion(int cantPotions){

	}

}