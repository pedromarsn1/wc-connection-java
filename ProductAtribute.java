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

public class ProductAtribute {

    public static void main(String[] args) throws JSONException {
        // Setup client
        OAuthConfig config = new OAuthConfig("https://thelinkfremyourwoocommercewebsite.com.br",
                "ck_XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX",
                "cs_XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        WooCommerce wooCommerce;
        wooCommerce = new WooCommerceAPI(config, ApiVersionType.V3);

        //CREATE
//        Map <String, Object> productAtInfo = new HashMap<>();
//        productAtInfo.put("name", "width");
//        productAtInfo.put("slug", "main-width");
//        productAtInfo.put("type", "select");
//        productAtInfo.put("order_by", "menu_order");
//        productAtInfo.put("has_archives", false);
//        Map productAttribute = wooCommerce.create(EndpointBaseType.PRODUCTS_ATTRIBUTES.getValue(), productAtInfo);
//        System.out.println(productAttribute.get("id"));

        //GET ALL
//        Map <String, String> params = new HashMap<>();
//        params.put("per_page", "100");
//        params.put("offset", "0");
//        List products = wooCommerce.getAll(EndpointBaseType.PRODUCTS_ATTRIBUTES.getValue(), params);
//        System.out.println(products.size());

        //GET BY ID
//        Map attributeById = wooCommerce.get(EndpointBaseType.PRODUCTS_ATTRIBUTES.getValue(), 3078);
//        Assert.assertNotNull(attributeById);

        //UPDATE
//        Map <String, Object> productAtUpdate = new HashMap<>();
//        productAtUpdate.put("order_by", "name");
//        Map attributeUpdate = wooCommerce.update(EndpointBaseType.PRODUCTS_ATTRIBUTES.getValue(), 3078, productAtUpdate);
//        Assert.assertNotNull(attributeUpdate);

        //DELETE
//        Map attributeDelete = wooCommerce.delete(EndpointBaseType.PRODUCTS_ATTRIBUTES.getValue(), 3078);
//        Assert.assertNotNull(attributeDelete);

    }
}
