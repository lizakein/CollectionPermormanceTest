package Main;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Класс "CollectionPerformanceTest" представляет собой Java-приложение, которое измеряет производительность операций
 * добавления, получения и удаления элементов в коллекциях "ArrayList" и "LinkedList" и измеряет время, необходимое для выполнения
 * этих операций для указанного числа повторений и элементов в коллекциях.
 */
public class CollectionPerformanceTest {
    public static void main(String[] args) {
        int repetitions = 1000; // Количество повторений операций
        int numElements = 3000; // Количество элементов в коллекции

        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Измерение времени для операции "добавить" в ArrayList
        long startTime = System.nanoTime();
        for (int i = 0; i < repetitions; i++)
            for (int j = 0; j < numElements; j++)
                arrayList.add(j);

        long endTime = System.nanoTime();
        long addArrayListTime = (endTime - startTime) / repetitions;

        // Измерение времени для операции "получить" из ArrayList
        startTime = System.nanoTime();
        for (int i = 0; i < repetitions; i++)
            for (int j = 0; j < numElements; j++)
                arrayList.get(j);

        endTime = System.nanoTime();
        long getArrayListTime = (endTime - startTime) / repetitions;

        // Измерение времени для операции "удалить" из ArrayList
        startTime = System.nanoTime();
        for (int i = 0; i < repetitions; i++)
            for (int j = numElements - 1; j >= 0; j--)
                arrayList.remove(j);

        endTime = System.nanoTime();
        long deleteArrayListTime = (endTime - startTime) / repetitions;


        // Аналогичные измерения для LinkedList
        startTime = System.nanoTime();
        for (int i = 0; i < repetitions; i++)
            for (int j = 0; j < numElements; j++)
                linkedList.add(j);

        endTime = System.nanoTime();
        long addLinkedListTime = (endTime - startTime) / repetitions;

        // Измерение времени для операции "получить" из ArrayList
        startTime = System.nanoTime();
        for (int i = 0; i < repetitions; i++)
            for (int j = 0; j < numElements; j++)
                linkedList.get(j);

        endTime = System.nanoTime();
        long getLinkedListTime = (endTime - startTime) / repetitions;

        // Измерение времени для операции "удалить" из ArrayList
        startTime = System.nanoTime();
        for (int i = 0; i < repetitions; i++)
            for (int j = numElements - 1; j >= 0; j--)
                linkedList.remove(j);

        endTime = System.nanoTime();
        long deleteLinkedListTime = (endTime - startTime) / repetitions;

        // Вывод результатов
        System.out.println("Method\t\tRepetitions\tTime (ns)");
        System.out.println("Add ArrayList\t" + repetitions + "\t\t" + addArrayListTime);
        System.out.println("Get ArrayList\t" + repetitions + "\t\t" + getArrayListTime);
        System.out.println("Delete ArrayList\t" + repetitions + "\t\t" + deleteArrayListTime);

        System.out.println("Add LinkedList\t" + repetitions + "\t\t" + addLinkedListTime);
        System.out.println("Get LinkedList\t" + repetitions + "\t\t" + getLinkedListTime);
        System.out.println("Delete LinkedList\t" + repetitions + "\t\t" + deleteLinkedListTime);
    }
}