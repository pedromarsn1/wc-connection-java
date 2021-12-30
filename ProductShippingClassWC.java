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

public class ProductShippingClassWC {
    public static void main(String[] args) throws JSONException {
        // Setup client
        OAuthConfig config = new OAuthConfig("https://thelinkfremyourwoocommercewebsite.com.br",
                "ck_XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX",
                "cs_XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        WooCommerce wooCommerce;
        wooCommerce = new WooCommerceAPI(config, ApiVersionType.V3);

        //CREATE A PRODUCT SHIPPING CLASS
//        Map <String, Object> shippingClassInfo = new HashMap<>();
//        shippingClassInfo.put("name", "Priority");
//        Map shippingZone = wooCommerce.create(EndpointBaseType.PRODUCTS_SHIPPING_CLASSES.getValue(), shippingClassInfo);
//        System.out.println(shippingZone.get("id"));


        //GET ALL
//        Map <String, String> params = new HashMap<>();
//        params.put("per_page", "100");
//        params.put("offset", "0");
//        List products = wooCommerce.getAll(EndpointBaseType.ORDERS.getValue(), params);
//
//        System.out.println(products.size());

        //GET BY ID
//        Map getCLassById = wooCommerce.get(EndpointBaseType.PRODUCTS_SHIPPING_CLASSES.getValue(), 44);
//        Assert.assertNotNull(getCLassById);


        //UPDATE
//        Map <String,Object> productClassUpdate = new HashMap<>();
//        productClassUpdate.put("description", "Non priority mail");
//        Map updateCLass = wooCommerce.update(EndpointBaseType.PRODUCTS_SHIPPING_CLASSES.getValue(), 44, productClassUpdate);
//        Assert.assertNotNull(updateCLass.get("id"));

        //DELETE
//        Map deleteCLass = wooCommerce.delete(EndpointBaseType.PRODUCTS_SHIPPING_CLASSES.getValue(), 44);
//        Assert.assertNotNull(deleteCLass.get("id"));

    }
}

