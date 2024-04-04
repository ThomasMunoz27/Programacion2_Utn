package Clase04Del04.JuegoRol;

/**
 * @author Thomy
 * @version 1.0
 * @created 04-abr.-2024 11:42:50
 */
public abstract class BaseCharacter implements Character {

	private boolean alive;
	private int armor;
	private int level;
	private int magArmor;
	private String name;
	private int ps;

	public BaseCharacter(boolean alive, int armor, int level, int magArmor, String name, int ps) {
		this.alive = alive;
		this.armor = armor;
		this.level = level;
		this.magArmor = magArmor;
		this.name = name;
		this.ps = ps;
	}

	public boolean isAlive() {
		return alive;
	}

	public void setAlive(boolean alive) {
		this.alive = alive;
	}

	public int getArmor() {
		return armor;
	}

	public void setArmor(int armor) {
		this.armor = armor;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getMagArmor() {
		return magArmor;
	}

	public void setMagArmor(int magArmor) {
		this.magArmor = magArmor;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPs() {
		return ps;
	}

	public void setPs(int ps) {
		this.ps = ps;
	}

	public void checkAlive(){
	if (this.ps <= 0){
		this.alive = false;
	}
	}
	public void defend(int dmg){
		int trueDmg = this.armor - dmg;
		this.ps -= trueDmg;

	}

}