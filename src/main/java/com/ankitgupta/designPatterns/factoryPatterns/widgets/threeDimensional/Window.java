package com.ankitgupta.designPatterns.factoryPatterns.widgets.threeDimensional;

public class Window extends ThreeDimensionalWidget {

	public Window(){
		super();
		this.setWidgetName(this.getWidgetName() + ": window");
	}
}
