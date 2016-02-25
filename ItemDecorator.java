package LabCodeSource;

public class ItemDecorator implements ItemInterface {

	private Item aDecorated;
	
	public ItemDecorator(Item pDecorated)
	{
		aDecorated = pDecorated;
	}
	
	public String getName()
	{
		return "Item - " + aDecorated.getName();
	}
	
	public int getId()
	{
		return aDecorated.getId();
	}
	
	public int getPrice()
	{
		return aDecorated.getPrice();
	}
}
