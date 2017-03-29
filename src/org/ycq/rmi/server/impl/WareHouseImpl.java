package org.ycq.rmi.server.impl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.HashMap;
import java.util.Map;

import org.ycq.rmi.server.WareHouse;


/**
 * This class is the implementation fro the remote Warehouse interface. 
 *
 * @author ycq
 * @since 2016年2月23日 上午11:55:02
 */
public class WareHouseImpl extends UnicastRemoteObject implements WareHouse {

	private static final long serialVersionUID = 1L;
	
	private Map<String, Double> prices;

	protected WareHouseImpl() throws RemoteException {
		prices = new HashMap<String, Double>();
		prices.put("Blackwell Toaster", 24.95);
		prices.put("ZapXpress Microwave Oven", 49.95);
	}
	
	@Override
	public double getPrice(String description) throws RemoteException {
		Double price = prices.get(description);
		return price == null ? 0 : price;
	}
}
