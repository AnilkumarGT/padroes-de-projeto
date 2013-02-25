package com.padraonullobject;

import java.awt.Event;

public class NullMouseEventHandler extends MouseEventHandler {
	public NullMouseEventHandler() {
		super(null);
	}

	@Override
	public boolean mouseMove(MetaGraphicsContext graphicsContext, Event event,
			int x, int y) {
		return true;
	}

	@Override
	public boolean mouseDown(MetaGraphicsContext graphicsContext, Event event,
			int x, int y) {
		return true;
	}

	@Override
	public boolean mouseExit(MetaGraphicsContext graphicsContext, Event event,
			int x, int y) {
		return true;
	}

	@Override
	public boolean mouseUp(MetaGraphicsContext graphicsContext, Event event,
			int x, int y) {
		return true;
	}
}
