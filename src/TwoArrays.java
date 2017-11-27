import java.util.ArrayList;
import java.util.List;

public class TwoArrays {

    int[] arrayCrossing(int[] firstArray, int[] secondArray) {
        List<Integer> resultArrList = new ArrayList<>();

        // В идеале NullPointer отлавливается выше по стэку вызовов, но так как у нас только 1 метод ловим его здесь
        if (firstArray == null || secondArray == null){
            return null;
        }

        // Проверяем длинну, что-бы работать только с меньшим
        // Можно поменять массивы местами что-бы не повторять код, но это будет тратить время
        if (firstArray.length >= secondArray.length) {
            for (int i = 0; i < firstArray.length; i++) {
                for (int j = 0; j < secondArray.length; j++) {
                    if (firstArray[i] == secondArray[j] && !resultArrList.contains(firstArray[i])) {
                        resultArrList.add(firstArray[i]);
                        // Нам не нужно продолжать внутренний цикл с использованием уже добавленного числа
                        break;
                    }
                }
            }
        }
        else{
            for (int i = 0; i < secondArray.length; i++) {
                for (int j = 0; j < firstArray.length; j++) {
                    if (secondArray[i] == firstArray[j] && !resultArrList.contains(secondArray[i])) {
                        resultArrList.add(secondArray[i]);
                        break;
                    }
                }
            }
        }
        return resultArrList.stream().mapToInt(i -> i).toArray();
    }
}