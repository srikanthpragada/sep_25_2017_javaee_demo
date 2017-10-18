package json;

import javax.json.Json;
import javax.json.JsonObjectBuilder;

public class CreateProduct {

	public static void main(String[] args) {
 
          JsonObjectBuilder builder = Json.createObjectBuilder();
          builder.add("name", "Dell Laptop");
          builder.add("price", 45000);
          
          System.out.println(builder.build());
	}

}
