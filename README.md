# WooCommerce API Connection - Java
A connection with the WooCommercer API using Java with Spring-Boot

## Resume
Those code were based on [this repository](https://github.com/calatonsystems/wc-api-java), and with a help of Sergio Borges (a friend of the company i work on).
The code is all comented and explicative, some things might be in portugues, so you can take the translator to help you at understanding theses parts. 

## An Exemple Of The Code

    public static void main(String[] args) throws JSONException {
        // Setup client
        OAuthConfig config = new OAuthConfig("https://thelinkfromyourwoocommercewebsite.com.br",
                "ck_XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX",
                "cs_XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");

        WooCommerce wooCommerce;
        wooCommerce = new WooCommerceAPI(config, ApiVersionType.V3);

        //CREATE
        Map <String, Object> taxesInfo = new HashMap<>();
        String cidades[] = {"Bahia", "Sergipe", "Rio Grande do Norte"};
        String postcodes[] = {"25314-000", "35036-562" , "55664-963"};
        taxesInfo.put("country", "BR");
        taxesInfo.put("state", "RJ");
        taxesInfo.put("cities", cidades);
        taxesInfo.put("postcodes", postcodes);
        taxesInfo.put("rate" , "4");
        taxesInfo.put("name", "Taxa Regiao Nordeste");
        taxesInfo.put("shipping", false);
        Map taxes= wooCommerce.create(EndpointBaseType.TAXES.getValue(), taxesInfo);
        Assert.assertNotNull(taxes.get("id"));

        //GET ALL
        Map <String, String> params = new HashMap<>();
        params.put("per_page", "100");
        params.put("offset", "0");
        List products = wooCommerce.getAll(EndpointBaseType.TAXES.getValue(), params);
        Assert.assertNotNull(products.size());

        //GET BY ID
        Map taxesById = wooCommerce.get(EndpointBaseType.TAXES.getValue(), 5);
        Assert.assertNotNull(taxesById.get("id"));

        //UPDATE
        Map <String, Object> taxesUpdateInfo = new HashMap<>();
        taxesUpdateInfo.put("name", "US Tax");
        Map taxesUpdate = wooCommerce.update(EndpointBaseType.TAXES.getValue(), 5, taxesUpdateInfo);
        Assert.assertNotNull(taxesUpdate);

        //DELETE
        Map taxesDelete = wooCommerce.delete(EndpointBaseType.TAXES.getValue(), 5);
        Assert.assertNotNull(taxesDelete);

