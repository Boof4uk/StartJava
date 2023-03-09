public class VariablesTheme {

    public static void main(String[] args) {
        outputVarValuesInConsole();
        priceCalculationWithDiscount();
        outputJAVAword();
        outputMinMaxValue();
        permutationVarValues();
        outputSymbolsAndCodes();
        outputDukeInConsole();
        outputAmountOfHundredsDecadesUnits();
        outputOfTime();
    }

    public static void outputVarValuesInConsole() {
        byte numberOfCores = 2;
        short SSDMemory = 512;
        int HHDMemory = 16000;
        long videoMemory = 1;
        boolean windows11 = true;
        char favoriteChar = 'X';
        double PI = 3.14;
        float gitVersion = 2.39f;
        
        System.out.println("\n(1) ВЫВОД ЗНАЧЕНИЙ ПЕРЕМЕННЫХ НА КОНСОЛЬ\n" + "Количество ядер: " + 
                numberOfCores + "\nПамять SSD: " + SSDMemory +
                "\nПамять жесткого диска: " + HHDMemory + "\nВидео память: " + videoMemory + 
                "\nWindows 11: " + windows11 +"\nЛюбимый символ: " + favoriteChar + "\nЧисло ПИ:" + 
                PI +"\nВерсия гит: " + gitVersion);
    }

    public static void priceCalculationWithDiscount() {
        int penPrice = 100;
        int bookPrice = 200;
        double discount = 0.11;
        int sumOfDiscount = (int)((penPrice + bookPrice) * discount);
        int sumOfItemsOutOfDiscount = penPrice + bookPrice;
        int sumOfItemsWithDiscount = penPrice + bookPrice - sumOfDiscount;

        System.out.println("\n\n(2) РАСЧЕТ СТОИМОСТИ ТОВАРА СО СКИДКОЙ" + 
                "\nСумма товаров без скидки: " + sumOfItemsOutOfDiscount + "\nСумма скидки: " +
                sumOfDiscount + "\nСумма товаров со скидкой: " + sumOfItemsWithDiscount);
    }

    public static void outputJAVAword() {
        System.out.println("\n\n(3) ВЫВОД СЛОВА JAVA В КОНСОЛЬ\n    J    a  v     v  a" + 
                "\n    J   a a  v   v  a a\n J  J  aaaaa  V V  aaaaa\n  JJ  a     a  V  a     a");
    }

    public static void outputMinMaxValue() {
        byte b = 127;
        short s = 32767;
        int i = 2_147_483_647;
        long l = 9_223_372_036_854_775_807L;

        System.out.println("\n\n(4) ВЫВОД МИНИМАЛЬНОГО И МАКСИМАЛЬНОГО ЗНАЧЕНИЙ ЦЕЛЫХ ЧИСЛОВЫХ ТИПОВ" + 
                "\n--Вывод первоначального значения:" + "\nbyte: " + b + "\nshort: " + s + 
                "\nint: " + i + "\nlong: " + l +
                "\n--Вывод инкрементированного значения:" + "\nbyte: " + ++b + "\nshort: " + ++s + 
                "\nint: " + ++i + "\nlong: " + ++l +
                "\n--Вывод декрементированного значения:" + "\nbyte: " + --b + "\nshort: " + --s + 
                "\nint: " + --i + "\nlong: " + --l);
    }
    
    public static void permutationVarValues() {
        int number2 = 2;
        int number5 = 5;
        int swapVar;

        System.out.println("\n\n(5) ПЕРЕСТАНОВКА ЗНАЧЕНИЙ ПЕРЕМЕННЫХ "  + 
                "\n--C помощью третьей переменной: " + 
                "\nИсходные значения: " + "number 2 = " + number2 + "; number 5 = " + number5);

        swapVar = number2; // = 2
        number2 = number5; // = 5
        number5 = swapVar; // = 2

        System.out.println("Новые значения: " + "number 2 = " + number2 + "; number 5 = " + number5);
        
        System.out.println("\n--С помощью арифметических операций: " + 
                "\nИсходные значения: " + "number 2 = " + number2 + "; number 5 = " + number5);

        //Не придумал другого арифметического способа без участия третьей переменной, жду подсказку
        number5 = number5 + number2; // = 5
        number2 = number5 - number2; // = 2
        number5 = number5 - number2;

        System.out.println("Новые значения: " + "number 2 = " + number2 + "; number 5 = " + number5);

        System.out.println("\n--С помощью побитовых операций: " + 
                "\nИсходные значения: " + "number 2 = " + number2 + "; number 5 = " + number5);

        number5 = number5 ^ number2;
        number2 = number2 ^ number5;
        number5 = number5 ^ number2;

        System.out.println("Новые значения: " + "number 2 = " + number2 + "; number 5 = " + number5);
    }

    public static void outputSymbolsAndCodes() {
        char char35 = 35;
        char char38 = 38;
        char char64 = 64;
        char char94 = 94;
        char char95 = 95;

        System.out.println("\n\n(6) ВЫВОД СИМВОЛОВ И ИХ КОДОВ" + 
                "\nКод символа: 35; Символ: "+ char35 +
                "\nКод символа: 38; Символ: "+ char38 +
                "\nКод символа: 64; Символ: "+ char64 +
                "\nКод символа: 94; Символ: "+ char94 +
                "\nКод символа: 95; Символ: "+ char95); 
    }

    public static void outputDukeInConsole() {
        char rightSlash = '/';
        char leftSlash = '\\';
        char leftBracket = '(';
        char rightbracket = ')';
        char underline = '_';

        System.out.println("\n\n(7) ВЫВОД В КОНСОЛЬ ASCII-АРТ ДЮКА" + 
                "\n    " + rightSlash + leftSlash + 
                "\n   " + rightSlash + "  " + leftSlash + 
                "\n  " + rightSlash + underline + leftBracket + " " + rightbracket + leftSlash + 
                "\n " + rightSlash + "      " + leftSlash + 
                "\n" + rightSlash + underline + underline + underline + underline + rightSlash + 
                leftSlash + underline + underline + leftSlash); 
    }

    public static void outputAmountOfHundredsDecadesUnits() {
        int numberber = 123;
        int amountOfHundreds = numberber / 100;
        int amounOfDecades = numberber % 100 / 10;
        int amountOfUnits = numberber % 100 % 10;
        int sumOfnumberbers = amountOfHundreds + amounOfDecades + amountOfUnits;
        int productOfnumberbers = amountOfHundreds * amounOfDecades * amountOfUnits;

        System.out.println("\n\n(8) ВЫВОД КОЛИЧЕСТВА СОТЕН, ДЕСЯТКОВ И ЕДИНИЦ\n" + 
                "Число " + numberber + " содержит:\n" +
                amountOfHundreds + " сотен\n" +
                amounOfDecades + " десятков\n" +
                amountOfUnits + " единиц" +
                "\nСумма его цифр: " + sumOfnumberbers +
                "\nПроизведение его цифр: " + productOfnumberbers); 
    }

    public static void outputOfTime() {
        int allTimeInSec = 86399;
        int hours = allTimeInSec / 3600;
        int minutes = (allTimeInSec - hours * 3600) / 60;
        int seconds = allTimeInSec - (hours * 3600 + minutes * 60);

        System.out.println("\n\n(9) ВЫВОД ВРЕМЕНИ\n" +
                hours + " : " + minutes + " : " + seconds); 
    }
}