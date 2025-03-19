package tavern;
public class NordicStew implements Dish{
    @Override
    public String getName() {
        return "Нордическое рагу";
    }

    @Override
    public int getPrice() {
        return 50;
    }
}
