Exemplo de Calculadora web service.

Compilando os fontes:
$ javac webservice/*.java

Disparando a aplicação Publisher:
$ java -cp . webservice.CalculadoraPublisher

Disparando a aplicação cliente:
$ java -cp . webservice.Client

O WSDL gerado descrevendo a interface para o web service poderá ser visto abrindo-se o seguinte link no browser:
http:// 127.0.0.1:9000/webservice?wsdl
