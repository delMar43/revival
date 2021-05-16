package revival.engine.tilebased.client.world;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import revival.engine.tilebased.client.world.actiondata.ActionData;
import revival.engine.tilebased.client.world.actiondata.AlterationData;
import revival.engine.tilebased.client.world.actiondata.CheckData;
import revival.engine.tilebased.client.world.actiondata.DialogueData;
import revival.engine.tilebased.client.world.actiondata.EncounterData;
import revival.engine.tilebased.client.world.actiondata.ImpassableData;
import revival.engine.tilebased.client.world.actiondata.LootData;
import revival.engine.tilebased.client.world.actiondata.MaskData;
import revival.engine.tilebased.client.world.actiondata.PrintData;
import revival.engine.tilebased.client.world.actiondata.RadiationData;
import revival.engine.tilebased.client.world.actiondata.SpecialData;
import revival.engine.tilebased.client.world.actiondata.TransitionData;

/**
 * contains the metadata (ie triggers, ...) of a map
 * @author martin
 *
 */
@SuppressWarnings("serial")
public class Location implements Serializable {
	
	public static final Integer ACTION_PRINT = 1;
	public static final Integer ACTION_CHECK = 2;
	public static final Integer ACTION_FIXEDENCOUNTER = 3;
	public static final Integer ACTION_MASK = 4;
	public static final Integer ACTION_LOOT = 5;
	public static final Integer ACTION_SPECIAL = 6;
	//7 unused
	public static final Integer ACTION_DIALOGUE = 8;
	public static final Integer ACTION_RADIATION = 9;
	public static final Integer ACTION_TRANSITION = 10;
	public static final Integer ACTION_IMPASSABLE = 11;
	public static final Integer ACTION_ALTERATION = 12;
	//d, e unused
	public static final Integer ACTION_RANDOMENCOUNTER = 15;
	
	private Integer id;
	private String name;
	private int mapNr;
	
	private int rows;
	private int cols;
	
	private ActionData[] actionData;
//	private Integer[] actionClassMap;
//	private int[] actionMap;
	private String[] strings;
	
	private Map<Integer, PrintData> printData;
	private Map<Integer, CheckData> checkData;
	private Map<Integer, EncounterData> fixedEncounterData;
	private Map<Integer, MaskData> maskData;
	private Map<Integer, LootData> lootData;
	private Map<Integer, SpecialData> specialData;
	private Map<Integer, DialogueData> dialogueData;
	private Map<Integer, RadiationData> radiationData;
	private Map<Integer, TransitionData> transitionData;
	private Map<Integer, ImpassableData> impassableData;
	private Map<Integer, AlterationData> alterationData;
	private Map<Integer, EncounterData> randomEncounterData;
	
	private TileData tileData;
	//npcs
	
	//monsters
	
	//battle strings
	
	public Location() {
		transitionData = new HashMap<Integer, TransitionData>();
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getId() {
		return id;
	}
	
	public void alterTile(int row, int col, int tileNr) {
		tileData.changeTile(row, col, tileNr);
	}
	
	public void alterActionData(int row, int col, ActionData data) {
//		alterActionClass(row, col, null, null);
		actionData[row*cols + col] = data;
	}
	
//	public void alterActionClass(int row, int col, Integer newActionClass, Integer newAction) {
//		System.out.println("alter row=" + row + ", col=" + col + ", nac=" + newActionClass +", na=" + newAction);
//		int offset = row*cols + col;
//		actionClassMap[offset] = newActionClass;
//		actionMap[offset] = newAction;
//	}
	
	public void setTileData(TileData tileData) {
		this.tileData = tileData;
		this.rows = tileData.getRows();
		this.cols = tileData.getCols();
	}
	public TileData getTileData() {
		return tileData;
	}
	
	public void setStrings(String[] strings) {
		this.strings = strings;
	}
	
	public String getString(int idx) {
		return strings[idx];
	}

	public void setActionData(Integer[] actionClassMap, int[] actionMap) {
//		this.actionClassMap = actionClassMap;
//		this.actionMap = actionMap;
		
		this.actionData = new ActionData[actionClassMap.length];
		for (int row=0;row < rows; row++) {
			int rowOffset = row*cols;
			for (int col=0;col < cols; col++) {
				int pos = rowOffset + col;
				Integer classId = actionClassMap[pos];
				if (classId == null) continue;
				
				Integer actionNr = actionMap[pos];
				actionData[pos] = getActionDataId(classId, actionNr);
			}
		}
	}
	
//	public Integer getActionClass(int row, int col) {
//		return actionClassMap[row*cols+col];
//	}
//	
//	public int getAction(int row, int col) {
//		return actionMap[row*cols + col];
//	}

	public ActionData getActionDataPos(int row, int col) {
		int pos = row*cols + col;
		
		return actionData[pos];
	}
	
	public ActionData getActionDataId(int classId, int actionNr) {
		if (classId == ACTION_PRINT) {
			return printData.get(actionNr);
		} else if (classId == ACTION_CHECK) {
			return checkData.get(actionNr);
		} else if (classId == ACTION_FIXEDENCOUNTER) {
			return fixedEncounterData.get(actionNr);
		} else if (classId == ACTION_MASK) {
			return maskData.get(actionNr);
		} else if (classId == ACTION_LOOT) {
			return lootData.get(actionNr);
		} else if (classId == ACTION_SPECIAL) {
			return specialData.get(actionNr);
		} else if (classId == ACTION_DIALOGUE) {
			return dialogueData.get(actionNr);
		} else if (classId == ACTION_RADIATION) {
			return radiationData.get(actionNr);
		} else if (classId == ACTION_TRANSITION) {
			return transitionData.get(actionNr);
		} else if (classId == ACTION_IMPASSABLE) {
			return impassableData.get(actionNr);
		} else if (classId == ACTION_ALTERATION) {
			return alterationData.get(actionNr);
		} else if (classId == ACTION_RANDOMENCOUNTER) {
			return randomEncounterData.get(actionNr);
		}
		
		return null;
	}
	
	public void setPrintData(Map<Integer, PrintData> printData) {
		this.printData = printData;
	}
	public PrintData getPrintData(int idx) {
		return printData.get(idx);
	}
	
	public void setCheckData(Map<Integer, CheckData> checkData) {
		this.checkData = checkData;
	}
	public CheckData getCheckData(int index) {
		return checkData.get(index);
	}
	
	public void setFixedEncounterData(Map<Integer, EncounterData> fixedEncounterData) {
		this.fixedEncounterData = fixedEncounterData;
	}
	public EncounterData get(int index) {
		return fixedEncounterData.get(index);
	}
	
	public void setMaskData(Map<Integer, MaskData> maskData) {
		this.maskData = maskData;
	}
	public MaskData getMaskData(int index) {
		return maskData.get(index);
	}
	
	public void setLootData(Map<Integer, LootData> lootData) {
		this.lootData = lootData;
	}
	public LootData getLootData(int index) {
		return lootData.get(index);
	}
	
	public void setSpecialData(Map<Integer, SpecialData> specialData) {
		this.specialData = specialData;
	}
	public SpecialData getSpecialAction(int index) {
		return this.specialData.get(index);
	}
	
	public void setDialogueData(Map<Integer, DialogueData> dialogueData) {
		this.dialogueData = dialogueData;
	}
	public DialogueData getDialogueData(int index) {
		return dialogueData.get(index);
	}
	
	public void setRadiationData(Map<Integer, RadiationData> radiationData) {
		this.radiationData = radiationData;
	}
	public RadiationData getRadiationData(int index) {
		return radiationData.get(index);
	}
	
	public void setTransitionData(Map<Integer, TransitionData> transitionData) {
		this.transitionData = transitionData;
	}
	public TransitionData getTransitionAction(int index) {
		return transitionData.get(index);
	}
	
	public void setImpassableData(Map<Integer, ImpassableData> impassableData) {
		this.impassableData = impassableData;
	}
	public ImpassableData getImpassableData(int idx) {
		return impassableData.get(idx);
	}
	
	public void setAlterationData(Map<Integer, AlterationData> alterationData) {
		this.alterationData = alterationData;
	}
	public AlterationData getAlterationData(int index) {
		return alterationData.get(index);
	}
	
	public void setRandomEncounterData(Map<Integer, EncounterData> randomEncounterData) {
		this.randomEncounterData = randomEncounterData;
	}
	public EncounterData getRandomEncounterData(int index) {
		return randomEncounterData.get(index);
	}
	
	public void setMapNr(int mapNr) {
		this.mapNr = mapNr;
	}
	public int getMapNr() {
		return mapNr;
	}
}
