import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.Response;

public class jaxrsClient {
public static void main(String[] args) {
	Client client=ClientBuilder.newClient();
	Response res= client.target("https://in.bookmyshow.com/hyderabad/movies").request().get();
	System.out.println(res);
	
}
}
