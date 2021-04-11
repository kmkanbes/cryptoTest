package testRestService;

import org.codehaus.jackson.map.ObjectMapper;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.api.json.JSONConfiguration;

import models.ExchangeInfo;

public class RestDenemeMain {

 
	public static ExchangeInfo getExchangeInfo() {
		ExchangeInfo sonucObje=new ExchangeInfo();
		try {

			ClientConfig clientConfig = new DefaultClientConfig();
	        
            clientConfig.getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING, Boolean.TRUE);
 
            Client client = Client.create(clientConfig);
			
	        WebResource webResource = client 
	           .resource("https://testnet.binance.vision/api/v3/exchangeInfo");
	        
	        ClientResponse response = webResource.accept("application/json")
	        		.type("application/json").get(ClientResponse.class);
	        
	        if (response.getStatus() != 200) {
	           throw new RuntimeException("Failed : HTTP error code : "
	            + response.getStatus());
	        }
	        String output = response.getEntity(String.class);
	        System.out.println("Output from Server .... \n");
	        System.out.println(output);
	        ObjectMapper mapper = new ObjectMapper();
	        sonucObje = mapper.readValue(output , ExchangeInfo .class);
 
	        /*
	        sonucObje.getExchangeFilters().stream().forEach(name-> {
		    	System.out.println("---------------------obje--------------------------");
		    	 System.out.println("obje::"+name);
		    	 System.out.println("---------------------obje--------------------------");
		    });
		    
		    /*
		    sonucObje.getSymbols().stream().forEach(name-> {
		    	System.out.println("-----------------------------------------------");
		    	System.out.println("name.getSymbol()"+name.getSymbol());
		    	System.out.println("name.getQuoteAsset()"+name.getQuoteAsset());
		    	System.out.println("name.getStatus()"+name.getStatus()); 
		    	System.out.println("name.isSpotTradingAllowed()"+name.isSpotTradingAllowed()); 
		    	System.out.println("name.isMarginTradingAllowed()"+name.isMarginTradingAllowed()); 
		    	System.out.println("-----------------------------------------------");
		    });
		    */
	      } catch (Exception e) {
	        e.printStackTrace();
	      }
		return sonucObje;
	}
}
