package org.ycq.rmi.server;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * The remote interface for a simple warehouse 
 * <p>
 * remote object must extends Remote interface,methods must throws RemoteException.
 * </p>
 *
 * @author ycq
 * @since 2016年2月23日 上午11:50:43
 */
public interface WareHouse extends Remote {
	double getPrice(String description) throws RemoteException;
}
