package tavern;
abstract class DishDecorator implements Dish{
    Dish decoratedDish;

    public DishDecorator (Dish dish){
        this.decoratedDish = dish;
    }

    @Override
    public String getName(){
        return decoratedDish.getName();
    }

    @Override
    public int getPrice(){
        return decoratedDish.getPrice();
    }
}
