package org.ycq.rpc.op;

public class EchoImpl implements Echo {

	@Override
	public String echo(String string) {
		return "From EchoImpl" + string;
	}

}
