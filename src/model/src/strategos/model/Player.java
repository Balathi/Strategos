package strategos.model;

import java.util.ArrayList;
import java.util.List;

import strategos.MapLocation;
import strategos.UnitOwner;
import strategos.model.units.UnitImpl;
import strategos.units.Unit;

public class Player implements UnitOwner{

	private final boolean isNPC;
	private ArrayList<Unit> units = new ArrayList<>();
	private ArrayList<MapLocation> visibleTiles = new ArrayList<>();

	public Player(boolean isNPC) {
		this.isNPC = isNPC;
	}

	@Override
	public List<Unit> getUnits() {
		return units;
	}

	@Override
	public List<MapLocation> getVisibleTiles() {
		return visibleTiles;
	}

	@Override
	public boolean isNPC() {
		return isNPC;
	}
}
