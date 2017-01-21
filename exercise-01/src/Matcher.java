package src;

import src.domain.MatchObj;

class Matcher {
    //TODO DONE
	public Matcher() {
	}

	public boolean match(MatchObj matchObj) {//int[] expected, int[] actual, int clipLimit, int delta

        if (checkLength(matchObj)) return false;

        clipValues(matchObj);

        return !checkEntry(matchObj);

    }

    private boolean checkLength(MatchObj matchObj) {
        // Check for length differences
        return matchObj.getActual().length != matchObj.getExpected().length;
    }

    private boolean checkEntry(MatchObj matchObj) {
        // Check that each entry within expected +/- delta
        for (int i = 0; i < matchObj.getActual().length; i++)
            if (Math.abs(matchObj.getExpected()[i] - matchObj.getActual()[i]) > matchObj.getDelta())
                return true;
        return false;
    }

    private void clipValues(MatchObj matchObj) {
        // Clip "too-large" values
        for (int i = 0; i < matchObj.getActual().length; i++) //actual
            if (matchObj.getActual()[i] > matchObj.getClipLimit())
                matchObj.getActual()[i] = matchObj.getClipLimit();
    }


}