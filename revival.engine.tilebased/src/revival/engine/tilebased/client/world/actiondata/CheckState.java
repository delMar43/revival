package revival.engine.tilebased.client.world.actiondata;

import java.io.Serializable;

public enum CheckState implements Serializable {

	/**
	 * if a check was made on a field where no action is specified
	 */
	CHECK_NODATA,
	
	/**
	 * if a check was made with an item/skill/attribute not specified for this check
	 */
	CHECK_INCORRECT,
	
	/**
	 * if a check was made but it failed
	 */
	CHECK_FAIL,
	
	/**
	 * if the check passed
	 */
	CHECK_PASS
}
