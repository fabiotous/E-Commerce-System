// Student Name: Fabio Tous
// Student ID: 501111871
import java.util.ArrayList;
import java.util.Iterator;
public class Cart
{
    ArrayList<CartItem> list;

    public Cart()
    {
        list = new ArrayList<CartItem>();;
    }

    public ArrayList<CartItem> getCartList()
    {
        return list;
    }
    public void addToCart(CartItem cartitem)
    {
        list.add(cartitem);
    }
    public void removeFromCart(CartItem cartitem)
    {
        list.remove(cartitem);
    }
    public void print()
    {
        for (CartItem item : list)
        {
            item.print();
        }
    }
}