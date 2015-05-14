package webservice;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.WebMethod;

@WebService()
@SOAPBinding(style = Style.RPC)
public interface Calculadora{
	@WebMethod
	public int somarInt(int val1, int val2);
	@WebMethod
	public int multiplicarInt(int val1, int val2);
}
