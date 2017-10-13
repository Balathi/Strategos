package strategos.ui.controller;

import strategos.units.Unit;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AttackListener extends Controller implements ActionListener {
    private final Controller controller;

    AttackListener(Controller controller) {
        super(controller);
        this.controller = controller;
    }

    @Override public void actionPerformed(ActionEvent e) {
        Unit unit = controller.getSelectedUnit();
        if (unit == null) return;
        if (unit.getEntrench()) {
            model.entrench(unit);
        } else if (unit.getWary()) {
            model.wary(unit);
        }
        view.repaint();
    }
}
