package com.ankitgupta.designPatterns.factoryPatterns.widgets.threeDimensional;

public class Scrollbar extends ThreeDimensionalWidget {

	public Scrollbar(){
		super();
		this.setWidgetName(this.getWidgetName() + ": scrollbar");
	}
}
