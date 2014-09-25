package com.ankitgupta.designPatterns.factoryPatterns.widgets.twoDimensional;

public class Window extends TwoDimensionalWidget {

	public Window(){
		super();
		this.setWidgetName(this.getWidgetName() + ": window");
	}
}
