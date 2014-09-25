package com.ankitgupta.designPatterns.factoryPatterns.widgets.twoDimensional;

public class Scrollbar extends TwoDimensionalWidget {

	public Scrollbar(){
		super();
		this.setWidgetName(this.getWidgetName() + ": scrollbar");
	}
}
