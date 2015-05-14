package webservice;
import javax.jws.WebService;

@WebService(endpointInterface="webservice.Calculadora")
public class CalculadoraImpl implements Calculadora{
	
	@Override
	public int somarInt(int val1, int val2){
		return val1+val2;
	}
	@Override
	public int multiplicarInt(int val1, int val2){
		return val1*val2;
	}
}
