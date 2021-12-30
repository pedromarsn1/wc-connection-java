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

public class CouponsWC {
    public static void main(String[] args) throws JSONException {
        // Setup client
        OAuthConfig config = new OAuthConfig("https://thelinkfremyourwoocommercewebsite.com.br",
                "ck_XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX",
                "cs_XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");

        WooCommerce wooCommerce;
        wooCommerce = new WooCommerceAPI(config, ApiVersionType.V3);

        //CREATE
//        Map <String, Object> couponInfo = new HashMap<>();
//        couponInfo.put("code","35off" );
//        couponInfo.put("discount_type", "percent");
//        couponInfo.put("amount", "35");
//        couponInfo.put("individual_use", true);
//        couponInfo.put("exclude_sale_items", true);
//        couponInfo.put("minimum_amount", "3500.00");
//        Map coupon = wooCommerce.create(EndpointBaseType.COUPONS.getValue(), couponInfo);
//        Assert.assertNotNull(coupon.get("id"));

        //GET ALL
//        Map <String, String> params = new HashMap<>();
//        params.put("per_page", "100");
//        params.put("offset", "0");
//        List coupons = wooCommerce.getAll(EndpointBaseType.COUPONS.getValue(), params);
//        Assert.assertNotNull(coupons.size());

       //GET BY ID
//        Map getCouponById = wooCommerce.get(EndpointBaseType.COUPONS.getValue(), 3097);
//        Assert.assertNotNull(getCouponById);

        //UPDATE
//        Map <String, Object> couponUpdate = new HashMap<>();
//        couponUpdate.put("amount", "5");
//        Map update = wooCommerce.update(EndpointBaseType.COUPONS.getValue(), 3097, couponUpdate);
//        Assert.assertNotNull(update);

        //DELETE
//        Map couponDelete = wooCommerce.delete(EndpointBaseType.COUPONS.getValue(), 3098);
//        Assert.assertNotNull(couponDelete);

    }
}
