package testRestService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import models.ExchangeInfo;

@Path("/getBinanceTestExchangeInfo")
public class RestClientService {
	
	@GET
    @Produces({MediaType.APPLICATION_JSON})
    public ExchangeInfo getJSON() {
        return RestDenemeMain.getExchangeInfo();
    }
	
}
