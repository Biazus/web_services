package webservice;
import java.net.URL;
import java.net.MalformedURLException;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class Client
{
	public static void main(String[] args)
	{
		try{
			URL url = new URL("http://10.67.101.127:9000/webservice");
		
			QName n = new QName("http://webservice/", "CalculadoraImplService");
			Service service = Service.create(url, n);
			Calculadora calc = service.getPort(Calculadora.class);
			int result = calc.somarInt(3,2);
			System.out.println(result);
			int result2 = calc.multiplicarInt(3,2);
			System.out.println(result2);
		
		}
		catch(MalformedURLException ex){	
			ex.printStackTrace();
		}
	}
}
