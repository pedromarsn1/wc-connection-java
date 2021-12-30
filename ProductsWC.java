package sophos.uniplus.woocommerce.conection;

import com.icoderman.woocommerce.ApiVersionType;
import com.icoderman.woocommerce.EndpointBaseType;
import com.icoderman.woocommerce.WooCommerce;
import com.icoderman.woocommerce.WooCommerceAPI;
import com.icoderman.woocommerce.oauth.OAuthConfig;
import org.json.JSONException;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductsWC {
    public static void main(String[] args) throws JSONException {
        // Setup client
        OAuthConfig config = new OAuthConfig("https://thelinkfremyourwoocommercewebsite.com.br",
                "ck_XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX",
                "cs_XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");

        WooCommerce wooCommerce;
        wooCommerce = new WooCommerceAPI(config, ApiVersionType.V3);

        // CREATING A PRODUCT
//        Map<String, Object> productInfo = new HashMap<>();
//        productInfo.put("name", "IPhone 7 Black Case");
//        productInfo.put("type", "simple");
//        productInfo.put("regular_price", "250.00");
//        productInfo.put("description", "Pellentesque habitant morbi tristique senectus et netus");
//        Map product = wooCommerce.create(EndpointBaseType.PRODUCTS.getValue(), productInfo);
//        Assert.assertNotNull(product);

       //DELETING A PRODUCT
//        Map deleteProduct = wooCommerce.delete(EndpointBaseType.PRODUCTS.getValue(), 3113);
//        Assert.assertNotNull(deleteProduct);

        //GET ALL PRODUCT
//        Map<String, String> params = new HashMap<>();
//        params.put("per_page","100");
//        params.put("offset","0");
//        List products = wooCommerce.getAll(EndpointBaseType.PRODUCTS.getValue(), params);
//        Assert.assertNotNull(products);

        //GET PRODUCT BY ID
//        Map getProductById = wooCommerce.get(EndpointBaseType.PRODUCTS.getValue(), 3113);
//        Assert.assertNotNull(getProductById);

        //UPDATE PRODUCT
//        Map<String, Object> updateProductInfo = new HashMap<>();
//        updateProductInfo.put("name", "IPhone 7 Black Case UPDATED");
//        Map updateProduct = wooCommerce.update(EndpointBaseType.PRODUCTS.getValue(), 3113, updateProductInfo);
//        Assert.assertNotNull(updateProduct);



    }

}
