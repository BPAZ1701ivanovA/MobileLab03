package com.example.bpaz1701ivanovlab03;

public class Phaser
{
    public static String PhaserGen()
    {
    //Создайте три набора слов для выбора. Можете добавлять собственные слова!
        String[] wordListOne = {"силы","отряд",
                "ГО", "повстанцы", "биотик", "отступник",
                "поле подавления", "беглец", "хитрый", "коварный"};
        String[] wordListTwo = {"код - щит", "код - меч",
                "оскар", "лима", "сдержанный",
                "определённый", "командный", "целевой",
                "соединённый провод", "интерполированный", "нейрон",
                "протон", "гидрон", "пуля с оболочкой",
                "огненный", "каустичный", "разбитый", "мёртвый"};
        String[] wordListThree = {"задержать", "доставить в отдел",
                "канат из металла", "остановить", "устранить", "преследовать",
                "уровень розыска силовиками", "телепорт", "период времени",
                "надзор", "образец", "пункт следования"};
        // Вычисляем, сколько слов в каждом списке
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;
        //Генерируем три случайных числа
        int rl = (int) (Math.random() * oneLength) ;
        int r2 = (int) (Math.random() * twoLength) ;
        int r3 = (int) (Math.random() * threeLength);
        //Теперь строим фразу
        // TODO 1.1 Поставьте Breakpoint
        String phase = wordListOne[rl] + " " + wordListTwo[r2] + " " + wordListThree[r3];
        return phase;
    }
}

