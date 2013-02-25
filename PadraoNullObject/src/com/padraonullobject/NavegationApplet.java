package com.padraonullobject;

import java.applet.Applet;
import java.awt.Event;

public class NavegationApplet extends Applet {

	/**
	 */
	private static final long serialVersionUID = 1L;
	private MouseEventHandler mouseEventHandler;
	private MetaGraphicsContext graphicsContext;

	public NavegationApplet(MouseEventHandler mouseEventHandler) {
		if (mouseEventHandler == null) {
			mouseEventHandler = new NullMouseEventHandler();
		}
		this.mouseEventHandler = mouseEventHandler;
	}

	public boolean mouseMove(Event event, int x, int y) {
		// if (mouseEventHandler != null) {
		return mouseEventHandler.mouseMove(graphicsContext, event, x, y);
		// }
		// return true;
	}

	public boolean mouseDown(Event event, int x, int y) {
		// if (mouseEventHandler != null) {
		return mouseEventHandler.mouseDown(graphicsContext, event, x, y);
		// }
		// return true;
	}

	public boolean mouseUp(Event event, int x, int y) {
		// if (mouseEventHandler != null) {
		return mouseEventHandler.mouseUp(graphicsContext, event, x, y);
		// }
		// return true;
	}

	public boolean mouseExit(Event event, int x, int y) {
		// if (mouseEventHandler != null) {
		return mouseEventHandler.mouseExit(graphicsContext, event, x, y);
		// }
		// return true;
	}

}
