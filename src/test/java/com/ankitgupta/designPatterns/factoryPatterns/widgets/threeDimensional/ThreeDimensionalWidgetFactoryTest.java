package com.ankitgupta.designPatterns.factoryPatterns.widgets.threeDimensional;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.ankitgupta.designPatterns.factoryPatterns.widgets.Widget;

public class ThreeDimensionalWidgetFactoryTest {

	private ThreeDimensionalWidgetFactory widgetFactory;
	
	@Before
	public void setUp() throws Exception {
		widgetFactory = new ThreeDimensionalWidgetFactory();
	}

	@Test
	public void testGetWidgetForScrollbar() {
		Widget scrollbar = widgetFactory.getWidget("scrollbar");
		Assert.assertTrue(scrollbar instanceof Scrollbar);
	}

	@Test
	public void testGetWidgetForWindow() {
		Widget window = widgetFactory.getWidget("window");
		Assert.assertTrue(window instanceof Window);
	}
}
