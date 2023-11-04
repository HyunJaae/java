package main.java.me.hyeonjae.observer.wheather;

public interface Observer {
    void update(float temp, float humidity, float pressure);
}
