package LabCodeSource;

import java.util.HashMap;
import java.util.Map;

/**
 * Represents a company that owns and operates
 * one or more grocery stores, each with its own inventory.
 */
public final class Corporation
{
	private Map<String, Inventory> aInventories = new HashMap<String, Inventory>();
	private final Corporation INSTANCE = new Corporation();
	
	public Corporation getInstance()
	{
		return INSTANCE;
	}
	
	/**
	 * @param pInventory An inventory to add to the corporation.
	 */
	public void addInventory(Inventory pInventory)
	{
		aInventories.put(pInventory.getName(), pInventory);
	}
}
