package LabCodeSource;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TestItemDecorator {

	Item aItem;
	ItemDecorator aDecorator;
	
	@Before
	public void setup()
	{
		aItem = new Item("Cereal", 1, 300);
		aDecorator = new ItemDecorator(aItem);
	}
	
	@Test
	public void testName()
	{
		assert(aDecorator.getName().contains(aItem.getName()));
		assertEquals(aDecorator.getName(), "Item - " + aItem.getName());
	}
	
	@Test
	public void testPrice()
	{
		assertEquals(aItem.getPrice(), aDecorator.getPrice());
	}
	
	@Test
	public void testId()
	{
		assertEquals(aItem.getId(), aDecorator.getId());
		assertEquals(1, aDecorator.getId());
	}
}
