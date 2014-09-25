package com.ankitgupta.designPatterns.factoryPatterns.widgets;

import com.ankitgupta.designPatterns.factoryPatterns.widgets.threeDimensional.ThreeDimensionalWidgetFactory;
import com.ankitgupta.designPatterns.factoryPatterns.widgets.twoDimensional.TwoDimensionalWidgetFactory;

public class WidgetFactoryLocator {
	
	public WidgetFactory getWidgetFactory(String widgetFactoryType){
		if(widgetFactoryType.equalsIgnoreCase("2d")){
			return new TwoDimensionalWidgetFactory();
		} else if(widgetFactoryType.equalsIgnoreCase("3d")){
			return new ThreeDimensionalWidgetFactory();
		} else{
			return null;
		}
	}
	
}
