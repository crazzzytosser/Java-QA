package HW1;

import java.util.List;

public class BottleofWaterVendMach implements VendingMachine {

    private final List<Product> productList;
    private int money;

    public BottleofWaterVendMach(List<Product> productList) {
        this.productList = productList;
    }

    @Override
    public Product getProduct(String name) {
        for (Product product : productList) {
            if (product.getName().equals(name)) {
                money += product.getPrice();
                return product;
            }
        }
        return null;
    }

    public BottleofWater getProduct(String name, int volume) {
        for (Product product : productList) {
            if (product instanceof BottleofWater) {
                if (product.getName().equals(name) && ((BottleofWater)product).getVolume() == volume){
                    return (BottleofWater) product;
                }
            }
        }
        return null;
    }

}
