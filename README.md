# Практика на работу с обобщениями

Задание: необходимо реализовать методы поиска максимального и минимального элемента в обобщенном
списке [List<T>](src/main/java/org/itstep/List.java)

Для этого нужно указать, что обобщенный тип `T` в списке должен реализовывать интерфейс 
[Comparable<T>](https://docs.oracle.com/javase/8/docs/api/java/lang/Comparable.html).

Интерфейс [Comparable<T>](https://docs.oracle.com/javase/8/docs/api/java/lang/Comparable.html):

```java
public interface Comparable<T> {
    int compareTo(T o);
}
```

Содержит один метод `compareTo()`, который необходимо будет реализовать в классе 
[Tea](src/main/java/org/itstep/Tea.java).

Придерживайтесь подсказок в классах [List<T>](src/main/java/org/itstep/List.java)
и [Tea](src/main/java/org/itstep/Tea.java) для успешного выполнения задания.

Проверяйте решение в методе `main()` класса [App](src/main/java/org/itstep/App.java).