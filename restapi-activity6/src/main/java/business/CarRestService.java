package business;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import beans.Car;

@RequestScoped
@Path("/cars")
public class CarRestService {
	
	@Inject
	CarBusinessInterface service;
	
	@POST
	@Path("/post")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Car> addCar(@QueryParam("quantity") int quantity, @QueryParam("leftSide") boolean leftSide, @QueryParam("price") float price, @QueryParam("name") String name) throws ServletException {
		return service.addCar(quantity, leftSide, price, name);
	}

}
