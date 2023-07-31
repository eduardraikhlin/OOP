package Homework3;

public interface IMarketBehavior {

    /**
     * Этот метод имитурет вхождение человека в магазин
     */
    void getIn();

    /**
     * Этот метод имитирует выход человека из магазина
     */
    void getOut();

    /**
     * Этот метод отображает текущий статус количества людей в магазине
     */
    void update();

}
