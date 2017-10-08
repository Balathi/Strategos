package strategos.ui.controller;

import strategos.GameState;
import strategos.ui.view.View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoadSlotListener extends Controller implements ActionListener {
	private final int index;
	private Controller controller;

	protected LoadSlotListener(Controller controller, int index) {
		super(controller);
		this.controller = controller;
		this.index = index;
	}

	public LoadSlotListener(GameState model, View view, int index) {
		super(model, view);
		this.index = index;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (index < model.getSaves().size()) {
			model.load(model.getSaves().get(index));
		}
		view.removeEscapeMenu();
		view.setGame();
	}
}