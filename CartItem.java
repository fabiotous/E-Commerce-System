// Student Name: Fabio Tous
// Student ID: 501111871
public class CartItem
{
    private Product product;
    private String productOptions;

    public CartItem(Product product, String productOptions)
    {
        this.product = product;
        this.productOptions = productOptions;
    }
    public CartItem(Product product)
    {
        this.product = product;
    }
    public Product getProduct()
    {
        return product;
    }
    public void setProduct(Product product)
    {
        this.product = product;
    }
    public String getFormat()
    {
        return productOptions;
    }
    public void print()
    {
        product.print();
    }
    public boolean equal(Object other)
    {
        CartItem otherCI = (CartItem) other;
        return this.product.getId().equals(otherCI.product.getId());
    }
}