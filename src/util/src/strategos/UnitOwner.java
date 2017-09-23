package strategos;

import strategos.units.Unit;

import java.util.List;

public interface UnitOwner {

	public List<Unit> getUnits();

	public List<MapLocation> getVisibileTiles();

	public boolean isNPC();
}
