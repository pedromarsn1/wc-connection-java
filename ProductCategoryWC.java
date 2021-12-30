package sophos.uniplus.woocommerce.conection;

import com.icoderman.woocommerce.ApiVersionType;
import com.icoderman.woocommerce.EndpointBaseType;
import com.icoderman.woocommerce.WooCommerce;
import com.icoderman.woocommerce.WooCommerceAPI;
import com.icoderman.woocommerce.oauth.OAuthConfig;
import org.json.JSONException;
import org.junit.Assert;

import java.io.ObjectInputFilter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.fasterxml.jackson.databind.type.LogicalType.Map;

public class ProductCategoryWC {
    public static void main(String[] args) throws JSONException {
        //Setting Client
        OAuthConfig config = new OAuthConfig("https://thelinkfremyourwoocommercewebsite.com.br",
                "ck_XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX",
                "cs_XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        WooCommerce wooCommerce;
        wooCommerce = new WooCommerceAPI(config, ApiVersionType.V3);

        //CREATE
//        Map<String, Object> productCatInfo = new HashMap<>();
//        Map<String, Object> srcInfo = new HashMap<>();
//        productCatInfo.put("name", "Test Category");
//        productCatInfo.put("image", srcInfo);
//        srcInfo.put("src", "https://storage.googleapis.com/dpw/app/uploads/2020/07/como-otimizar-imagens-para-web-jpg-baixa-compressao-1024x686.jpg");
//        Map productCategory = wooCommerce.create(EndpointBaseType.PRODUCTS_CATEGORIES.getValue(), productCatInfo);
//        System.out.println(productCategory.get("id"));

        //GET ALL
//        Map <String, String> params = new HashMap<>();
//        params.put("per_page", "100");
//        params.put("offset", "0");
//        List products = wooCommerce.getAll(EndpointBaseType.PRODUCTS_CATEGORIES.getValue(), params);
//        Assert.assertNotNull(products.size());

        //GET BY ID
//        Map getCatById = wooCommerce.get(EndpointBaseType.PRODUCTS_CATEGORIES.getValue(), 32);
//        Assert.assertNotNull(getCatById);

        //UPDATE
//        Map <String, Object> productCatUpdate = new HashMap<>();
//        productCatUpdate.put("description", "All kinds of clothes");
//        Map categoryUpdate =  wooCommerce.update(EndpointBaseType.PRODUCTS_CATEGORIES.getValue(), 34, productCatUpdate);
//        Assert.assertNotNull(categoryUpdate.get("id"));

       //DELETE
//       Map categoryDelete =  wooCommerce.delete(EndpointBaseType.PRODUCTS_CATEGORIES.getValue(), 43);
//        Assert.assertNotNull(categoryDelete.get("id"));


    }

}
