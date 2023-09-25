package study.java.java8.standard;

/**
 * Generic Class
 * @param <T> Type variable
 */
public class Box<T> {

    T item;

    void setItem(T item) {
        this.item = item;
    }
    T getItem() {
        return item;
    }
}
