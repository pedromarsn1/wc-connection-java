package sophos.uniplus.woocommerce.conection;

import com.icoderman.woocommerce.ApiVersionType;
import com.icoderman.woocommerce.EndpointBaseType;
import com.icoderman.woocommerce.WooCommerce;
import com.icoderman.woocommerce.WooCommerceAPI;
import com.icoderman.woocommerce.oauth.OAuthConfig;
import org.json.JSONException;
import org.junit.Assert;

import java.util.HashMap;

import java.util.List;
import java.util.Map;

import static javax.xml.ws.Endpoint.create;


public class OrderWC {

    public static void main(String[] args) throws JSONException {
		// Setup client
		OAuthConfig config = new OAuthConfig("https://thelinkfremyourwoocommercewebsite.com.br",
				"ck_XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX",
				"cs_XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
		WooCommerce wooCommerce;
		wooCommerce = new WooCommerceAPI(config, ApiVersionType.V3);


        //CREATE ORDERS
        Map <String, Object> orderInfo = new HashMap<>();
        Map <String, Object> billingInfo = new HashMap<>();
        Map<String, Object> shipInfo = new HashMap<>();
        orderInfo.put("payment_method", "bacs");
        orderInfo.put("payment_method_title", "IS IT GOING TO WORK?");

        //Conexão com o JSON filho
        orderInfo.put("billing", billingInfo);
        //Info do campo "billing"
        billingInfo.put("first_name", "Junior");
        billingInfo.put("last_name", "Carlos");
        billingInfo.put("address_1", "969 Market");
        billingInfo.put("address_2", "");
        billingInfo.put("city", "San Francisco");
        billingInfo.put("state", "CA");
        billingInfo.put("postcode", "94103");
        billingInfo.put("country", "US");
        billingInfo.put("email", "john.doe@example.com");
        billingInfo.put("phone", "(555) 555-5555");

        //Conexão com o JSON filho
        orderInfo.put("shipping", shipInfo);
        //Info do campo "shipping"
        shipInfo.put("first_name", "Junior");
        shipInfo.put("last_name", "Carlos");
        shipInfo.put("address_1", "969 Market");
        shipInfo.put("address_2", "");
        shipInfo.put("city", "San Francisco");
        shipInfo.put("state", "CA");
        shipInfo.put("postcode", "94103");
        shipInfo.put("country", "US");
        Map order =  wooCommerce.create(EndpointBaseType.ORDERS.getValue(), orderInfo);
        Assert.assertNotNull(order.get("id"));


        //GET ALL ORDERS
        Map <String,String> params = new HashMap<>();
        params.put("per_page", "100");
        params.put("offset", "0");
        List products = wooCommerce.getAll(EndpointBaseType.ORDERS.getValue(), params);
        Assert.assertNotNull(products.size());



       // UPDATE ORDERS
        Map <String, Object> orderInfo = new HashMap<>();
        Map <String, Object> billingInfo = new HashMap<>();
        Map<String, Object> shipInfo = new HashMap<>();

        //Conexão com o JSON filho
        orderInfo.put("billing", billingInfo);
 	//Info do campo "billing"
        billingInfo.put("first_name", "João");
        billingInfo.put("last_name", "Carlos");
        billingInfo.put("address_1", "969 Market");
        billingInfo.put("address_2", "");
        billingInfo.put("city", "San Francisco");
        billingInfo.put("state", "CA");
        billingInfo.put("postcode", "94103");
        billingInfo.put("country", "US");
        billingInfo.put("email", "john.doe@example.com");
        billingInfo.put("phone", "(555) 555-5555");

        //Conexão com o JSON filho
	orderInfo.put("shipping", shipInfo);
        //Info do campo "shipping"
        shipInfo.put("first_name", "João");
        shipInfo.put("last_name", "Carlos");
        shipInfo.put("address_1", "969 Market");
        shipInfo.put("address_2", "");
        shipInfo.put("city", "Recife");
        shipInfo.put("state", "PE");
        shipInfo.put("postcode", "94103");
        shipInfo.put("country", "BR");
        Map updateProduct = wooCommerce.update(EndpointBaseType.ORDERS.getValue(), 3140, orderInfo);
        Assert.assertNotNull(updateProduct);


        //DELETE ORDERS
        Map deleteProduct = wooCommerce.delete(EndpointBaseType.ORDERS.getValue(), 3139);
        Assert.assertNotNull(deleteProduct);


        //GET ORDER BY ID
        Map getOrderById = wooCommerce.get(EndpointBaseType.ORDERS.getValue(), 3138);
        Assert.assertNotNull(getOrderById);

    }

}
