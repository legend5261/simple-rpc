package org.ycq.rpc.protocal;

import java.io.Serializable;
import java.util.Arrays;

@SuppressWarnings("rawtypes")
public class Invocation implements Serializable {
	private static final long serialVersionUID = 1L;

	private Class interfaces;
	private Method method;
	private Object[] params;
	private Object result;

	public Object getResult() {
		return result;
	}

	public void setResult(Object result) {
		this.result = result;
	}

	public Class getInterfaces() {
		return interfaces;
	}

	public void setInterfaces(Class interfaces) {
		this.interfaces = interfaces;
	}

	public Method getMethod() {
		return method;
	}

	public void setMethod(Method method) {
		this.method = method;
	}

	public Object[] getParams() {
		return params;
	}

	public void setParams(Object[] params) {
		this.params = params;
	}

	@Override
	public String toString() {
		return interfaces.getName() + "." + method.getMethodName() + "(" + Arrays.toString(params) + ")";
	}

}
