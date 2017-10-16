package strategos.behaviour;


import strategos.Config;
import strategos.model.GameState;
import strategos.units.Unit;


class BehaviourSwordsmen extends UnitBehaviour {

    //TODO: Where is your javadoc?

    BehaviourSwordsmen(GameState gameState) {
        super(gameState);
    }

    private BehaviourSwordsmen(BehaviourSwordsmen behaviourSwordsmen, GameState newState) {
        super(behaviourSwordsmen, newState);
    }

    @Override public int getStrength(Unit unit) {
        return Config.SWORDSMEN_STRENGTH;
    }

    @Override public int getToughness(Unit unit) {
        return Config.SWORDSMEN_TOUGHNESS;
    }

    @Override public Behaviour copy(GameState newState) {
        return new BehaviourSwordsmen(this, newState);
    }

    @Override public String toString() {
        return "BehaviourSwordsmen{} " + super.toString();
    }
}
