package strategos.networking;

import strategos.GameCollections;
import strategos.SaveInstance;
import strategos.UnitOwner;

import java.io.Serializable;
import java.util.ArrayList;

public class SaveInstanceImpl implements SaveInstance, Serializable {
	private int i = 10;
	private String s = "This is for testing purposes";

	@Override
	public GameCollections getWorld() {
		return null;
	}

	@Override
	public ArrayList<UnitOwner> getPlayers() {
		return null;
	}

	@Override
	public UnitOwner getTurn() {
		return null;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		SaveInstanceImpl that = (SaveInstanceImpl) o;

		return i == that.i && (s != null ? s.equals(that.s) : that.s == null);
	}

	@Override
	public int hashCode() {
		int result = i;
		result = 31 * result + (s != null ? s.hashCode() : 0);
		return result;
	}
}
