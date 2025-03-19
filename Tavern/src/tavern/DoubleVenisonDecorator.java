package tavern;
public class DoubleVenisonDecorator extends DishDecorator{
    public DoubleVenisonDecorator(Dish dish) {
        super(dish);
    }

    @Override
    public String getName() {
        return decoratedDish.getName() + " + двойная порция оленины ";
    }

    @Override
    public int getPrice() {
        return decoratedDish.getPrice() + 20;
    }
}
