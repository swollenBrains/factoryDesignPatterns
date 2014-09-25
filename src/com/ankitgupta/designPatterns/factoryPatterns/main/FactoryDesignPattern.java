package com.ankitgupta.designPatterns.factoryPatterns.main;

import com.ankitgupta.designPatterns.factoryPatterns.widgets.Widget;
import com.ankitgupta.designPatterns.factoryPatterns.widgets.WidgetFactory;
import com.ankitgupta.designPatterns.factoryPatterns.widgets.WidgetFactoryLocator;
import com.ankitgupta.designPatterns.factoryPatterns.widgets.twoDimensional.TwoDimensionalWidgetFactory;

public class FactoryDesignPattern {

	public static void main(String[] args) {
		System.out.println("Factory Pattern demo : ");
		demoFactoryPattern();
		System.out.println("\nAbstract factory Pattern demo : ");
		demoAbstractFactoryPattern();
	}
	
	private static void demoFactoryPattern(){
		TwoDimensionalWidgetFactory widgetFactory = new TwoDimensionalWidgetFactory();
		
		Widget widget1 = widgetFactory.getWidget("window");
		System.out.println(widget1.getWidgetName());
		
		Widget widget2 = widgetFactory.getWidget("scrollbar");
		System.out.println(widget2.getWidgetName());
	}

	private static void demoAbstractFactoryPattern(){
		WidgetFactoryLocator factoryLocator = new WidgetFactoryLocator();
		
		WidgetFactory twoDWidgetFactory = factoryLocator.getWidgetFactory("2d");
		Widget twoDWidget1 = twoDWidgetFactory.getWidget("window");
		System.out.println(twoDWidget1.getWidgetName());
		
		Widget twoDWidget2 = twoDWidgetFactory.getWidget("scrollbar");
		System.out.println(twoDWidget2.getWidgetName());
		
		WidgetFactory threeDWidgetFactory = factoryLocator.getWidgetFactory("3d");
		Widget threeDWidget1 = threeDWidgetFactory.getWidget("window");
		System.out.println(threeDWidget1.getWidgetName());
		
		Widget threeDWidget2 = threeDWidgetFactory.getWidget("scrollbar");
		System.out.println(threeDWidget2.getWidgetName());
	}
	
}
