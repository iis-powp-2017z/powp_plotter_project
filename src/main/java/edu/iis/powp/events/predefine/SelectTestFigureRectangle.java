package edu.iis.powp.events.predefine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.iis.client.plottermagic.AbstractPlotter;
import edu.iis.client.plottermagic.preset.FiguresJane;
import edu.iis.client.plottermagic.preset.FiguresJoe;
import edu.iis.powp.app.Application;
import edu.iis.powp.app.Context;
import edu.iis.powp.app.DriverManager;
import edu.iis.powp.command.FactoryRectangle;
import edu.kis.powp.drawer.panel.DrawPanelController;

public class SelectTestFigureRectangle implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		Context context = Application.getComponent(Context.class);
		DrawPanelController draw = (DrawPanelController) Application.getComponent(DriverManager.class).getCurrentPlotter();
		draw.initialize(context.getFreePanel());
		FactoryRectangle rectangle = new FactoryRectangle();
		rectangle.drawRectangle().execute(Application.getComponent(DriverManager.class).getCurrentPlotter());
	}
}
