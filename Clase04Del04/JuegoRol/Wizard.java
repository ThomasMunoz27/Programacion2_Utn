package Clase04Del04.JuegoRol;

/**
 * @author Thomy
 * @version 1.0
 * @created 04-abr.-2024 11:42:51
 */
public class Wizard extends BaseCharacter {

	private int mana;

	public Wizard(boolean alive, int armor, int level, int magArmor, String name, int ps, int mana) {
		super(alive, armor, level, magArmor, name, ps);
		this.mana = mana;
	}

	public int attack(){
		return 0;
	}

}