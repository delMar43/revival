package revival.rules.player;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Party implements Serializable {

	private List<Chara> members;
	
	private int mapNr;
	private int posCol;
	private int posRow;
	
	private int prevMapNr;
	private int prevPosCol;
	private int prevPosRow;
	
//	private int nextMapNr;
//	private int nextPosCol;
//	private int nextPosRow;
	
	public Party() {
		members = new ArrayList<Chara>();
	}
	
	public void setPosition(int posRow, int posCol) {
		savePosition();
		this.posCol = posCol;
		this.posRow = posRow;
	}
	
	public void savePosition() {
		prevPosCol = posCol;
		prevPosRow = posRow;
	}
	
	public void revertPosition() {
		posCol = prevPosCol;
		posRow = prevPosRow;
	}
	
	public void revertMapNr() {
		this.mapNr = this.prevMapNr;
	}
	
	public void addMember(Chara c) {
		members.add(c);
	}
	
	public List<Chara> getMembers() {
		return members;
	}
	
	public Chara getMember(int idx) {
		return members.get(idx);
	}
	
	public void setMapNr(int mapNr) {
		saveMapNr();
		this.mapNr = mapNr;
	}
	public int getMapNr() {
		return mapNr;
	}
	
	public void saveMapNr() {
		this.prevMapNr = this.mapNr;
	}

	public void setPosCol(int posCol) {
		this.posCol = posCol;
	}
	public int getPosCol() {
		return posCol;
	}
	public void setPosRow(int posRow) {
		this.posRow = posRow;
	}
	public int getPosRow() {
		return posRow;
	}
	
	public void setPrevMapNr(int prevMapNr) {
		this.prevMapNr = prevMapNr;
	}
	public void setPrevPosCol(int prevPosCol) {
		this.prevPosCol = prevPosCol;
	}
	public void setPrevPosRow(int prevPosRow) {
		this.prevPosRow = prevPosRow;
	}
	public int getPrevMapNr() {
		return prevMapNr;
	}
	public int getPrevPosCol() {
		return prevPosCol;
	}
	public int getPrevPosRow() {
		return prevPosRow;
	}
	
	public void decPosCol() {
		posCol--;
	}
	
	public void decPosRow() {
		posRow--;
	}
	
	public void incPosCol() {
		posCol++;
	}
	
	public void incPosRow() {
		posRow++;
	}

//	public int getNextMapNr() {
//		return nextMapNr;
//	}
//
//	public void setNextMapNr(int nextMapNr) {
//		this.nextMapNr = nextMapNr;
//	}
//
//	public int getNextPosCol() {
//		return nextPosCol;
//	}
//
//	public void setNextPosCol(int nextPosCol) {
//		this.nextPosCol = nextPosCol;
//	}
//
//	public int getNextPosRow() {
//		return nextPosRow;
//	}
//
//	public void setNextPosRow(int nextPosRow) {
//		this.nextPosRow = nextPosRow;
//	}
	
}
