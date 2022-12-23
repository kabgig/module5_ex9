/*
Задача 9
        Напишите два класса: ToTable и ToLine.

        Класс ToTable

        Этот класс должен превращать одномерный массив чисел
        в таблицу (двумерный массив чисел x на y).

        В этом классе реализуйте:

        поле data (одномерный массив);
        поле x ( число);
        поле y (число);
        конструктор, инициализирующий данные поля (data, x, y);
        метод resize(), возвращающий двумерный список x на y.
        Пример:

        ToTable a = new ToTable(new int[] {1, 2, 3, 4, 5, 6}, 3, 2);
        int[][] arr = a.resize();
        В поле arr должен попасть массив вида: [[1, 2], [3, 4], [5, 6]].

        Класс ToLine

        Этот класс работает наоборот,
        то есть из двумерного массива делает одномерный.

        В этом классе реализуйте:

        поле data (двумерный массив);
        конструктор, инициализирующий данное поле (data);
        метод resize(), возвращающий одномерный список.
        Пример:

        ToLine a = new ToLine(new int[][] {{1, 2}, {3, 4}, {5, 6}});
        int[] arr = a.resize();
        В поле arr должен попасть массив вида: [1, 2, 3, 4, 5, 6].*/
