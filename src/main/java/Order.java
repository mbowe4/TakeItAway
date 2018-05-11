import java.util.ArrayList;
import java.util.Collection;

public class Order {
    private Collection<MenuItem> menuItems;

    public Order() {
        this.menuItems = new ArrayList<MenuItem>();
    }

    public void addMenuItem(MenuItem menuItem) {
        this.menuItems.add(menuItem);
    }

    public Collection<MenuItem> getMenuItems() {
        return menuItems;
    }

}
