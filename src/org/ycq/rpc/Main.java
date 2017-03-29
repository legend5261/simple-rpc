package org.ycq.rpc;

import org.ycq.rpc.op.Echo;
import org.ycq.rpc.op.RemoteEcho;
import org.ycq.rpc.support.Server;

public class Main {
	public static void main(String[] args) {
		Server server = new RPC.RPCServer();
		server.register(Echo.class, RemoteEcho.class);
		server.start();
	}

}
