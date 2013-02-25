package com.padraonullobject;

import java.awt.Event;

public class MouseEventHandler {
	private Context context;

	public MouseEventHandler(Context context) {
		this.context = context;
	}

	public boolean mouseMove(MetaGraphicsContext graphicsContext, Event event, int x, int y) {
		return false;
	}

	public boolean mouseDown(MetaGraphicsContext graphicsContext, Event event, int x, int y) {
		return false;
	}

	public boolean mouseExit(MetaGraphicsContext graphicsContext, Event event, int x, int y) {
		return false;
	}

	public boolean mouseUp(MetaGraphicsContext graphicsContext, Event event, int x, int y) {
		return false;
	}

}
