package ch.pg.sinkships.model;

/**
 * The Class Where the 5 Tile long Ship is created.
 * 
 * @author PatrickG07
 */
public class Ship5 {

	Boolean destroyd = false;
	Boolean Horizontal = true;

	int pos1X, pos2X, pos3X, pos4X, pos5X;
	int pos1Y, pos2Y, pos3Y, pos4Y, pos5Y;

	int Health = 5;

	public Boolean getDestroyd() {
		return destroyd;
	}

	public void setDestroyd(Boolean destroyd) {
		this.destroyd = destroyd;
	}

	public Boolean getHorizontal() {
		return Horizontal;
	}

	public void setHorizontal(Boolean diagonal) {
		Horizontal = diagonal;
	}

	public int getPos1X() {
		return pos1X;
	}

	public void setPos1X(int pos1x) {
		pos1X = pos1x;
	}

	public int getPos2X() {
		return pos2X;
	}

	public void setPos2X(int pos2x) {
		pos2X = pos2x;
	}

	public int getPos3X() {
		return pos3X;
	}

	public void setPos3X(int pos3x) {
		pos3X = pos3x;
	}

	public int getPos4X() {
		return pos4X;
	}

	public void setPos4X(int pos4x) {
		pos4X = pos4x;
	}

	public int getPos5X() {
		return pos5X;
	}

	public void setPos5X(int pos5x) {
		pos5X = pos5x;
	}

	public int getPos1Y() {
		return pos1Y;
	}

	public void setPos1Y(int pos1y) {
		pos1Y = pos1y;
	}

	public int getPos2Y() {
		return pos2Y;
	}

	public void setPos2Y(int pos2y) {
		pos2Y = pos2y;
	}

	public int getPos3Y() {
		return pos3Y;
	}

	public void setPos3Y(int pos3y) {
		pos3Y = pos3y;
	}

	public int getPos4Y() {
		return pos4Y;
	}

	public void setPos4Y(int pos4y) {
		pos4Y = pos4y;
	}

	public int getPos5Y() {
		return pos5Y;
	}

	public void setPos5Y(int pos5y) {
		pos5Y = pos5y;
	}

	public int getHealth() {
		return Health;
	}

	public void setHealth(int health) {
		Health = health;
	}

}
