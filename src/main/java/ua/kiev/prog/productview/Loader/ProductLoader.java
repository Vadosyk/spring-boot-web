package ua.kiev.prog.productview.Loader;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import ua.kiev.prog.productview.models.Product;
import ua.kiev.prog.productview.repositories.ProductRepository;

import java.math.BigDecimal;

@Component
public class ProductLoader implements ApplicationListener<ContextRefreshedEvent> {

    private ProductRepository productRepository;

    private Logger log = LogManager.getLogger(ProductLoader.class);

    @Autowired
    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {

        Product phone = new Product();
        phone.setDescription("Phone Samsung Galaxy A50 6/128Gb Blue (SM-A505FZBQ)");
        phone.setPrice(new BigDecimal("7700.00"));
        phone.setImageUrl("https://comfy.ua/ua/smartfon-samsung-a505-galaxy-a5-6-128gb-blue.html#galleryPopup");
        phone.setProductId("235268845711068308");
        productRepository.save(phone);

        log.info("Saved Phone - id: " + phone.getId());

        Product bike = new Product();
        bike.setDescription("Bike Comanche NIAGARA L 26 blue");
        bike.setImageUrl("https://www.veloonline.com/view.shtml?id=658#images-1");
        bike.setProductId("168639393495335947");
        bike.setPrice(new BigDecimal("7936.00"));
        productRepository.save(bike);

        log.info("Saved Bike - id:" + bike.getId());
    }
}
