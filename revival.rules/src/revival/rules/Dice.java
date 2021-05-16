package revival.rules;

import com.allen_sauer.gwt.log.client.Log;
import com.google.gwt.user.client.Random;


public class Dice {

	private static final int DICE_SIDES = 6;
	private static final int NR_DICE = 2;
	
	private boolean daro;
	
	public boolean isDaro() {
		return daro;
	}
	
	public int roll(int nrDice, int sides, int add) {
		int result = add;
		
		for (int roll=0;roll<nrDice;roll++) {
			result += (Random.nextInt(sides)+1); //make the roll 1-6 instead of 0-5
		}
		
		return result;
	}
	
    public int getSavingRoll(int adds) {
        int result = 0;
        int prevValue = -1;
        int sameValues = 1;
        
        for(int roll=0;roll<NR_DICE;roll++) {
            int value = Random.nextInt(DICE_SIDES)+1;

            if (prevValue > 0 && value == prevValue) {
                sameValues++;
            } else {
                prevValue = value;
            }
            result += value;
        }
        
        if (sameValues == NR_DICE) {
            Log.debug("DARO");
            result += getSavingRoll(0);
            daro = true;
        }
        
        if (result <= 3 && !daro) {
        	return 0;
        }
        
        int currentRoll = result + adds;
//        Log.debug(NR_DICE + "D6 + " + adds + " = " + currentRoll);
        
        return currentRoll;    	
    }
}
