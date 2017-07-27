package book;


import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/book")
public class Book {
	@GET
	@Produces(MediaType.TEXT_XML)
	
	@Path("{name}")
	public String sayHelloXML(@PathParam("name") String name){
		
		String response="<hello>HELLO "+name+"</hello>";
		
		return response;
	}
	
	/*@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Path("{fname}")
	@Consumes(MediaType.APPLICATION_JSON)
	
	public Response sayHelloXML2(@PathParam("fname") String name,@QueryParam("lname") String lName,BookInfo b){		

		return Response.status(201).entity(new BookResp(b.getName(),b.getTitle())).build();
	}*/

}
