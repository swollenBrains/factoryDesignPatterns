package com.ankitgupta.designPatterns.factoryPatterns.widgets.threeDimensional;

import com.ankitgupta.designPatterns.factoryPatterns.widgets.Widget;
import com.ankitgupta.designPatterns.factoryPatterns.widgets.WidgetFactory;

public class ThreeDimensionalWidgetFactory extends WidgetFactory{

	@Override
	public Widget getWidget(String widgetType) {
		if(widgetType.equalsIgnoreCase("scrollbar")){
			return new Scrollbar();
		} else if(widgetType.equalsIgnoreCase("window")){
			return new Window();
		} else {
			return null;
		}
	}
	
}
