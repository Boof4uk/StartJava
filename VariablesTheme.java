public class VariablesTheme {

    public static void main(String[] args) {
        outputVarValuesInConsole();
        calculationPriceWithDiscount();
        outputJAVAword();
        outputMinMaxValuesWholeNumberTypes();
        permutationVarValues();
        outputSymbolsAndCodes();
        outputDukeInConsole();
        outputAmountHundredsDecadesUnits();
        outputTime();
    }

    public static void outputVarValuesInConsole() {

        System.out.println("\n(1) ВЫВОД ЗНАЧЕНИЙ ПЕРЕМЕННЫХ НА КОНСОЛЬ");
        
        byte numberCores = 2;
        short SsdMemory = 512;
        int HhdMemory = 1000;
        long videoMemory = 1;
        boolean windows11 = true;
        char matebookVersion = 'D';
        double processorFrequency = 2.10;
        float usableRam = 15.3f;
        
        System.out.println("Количество ядер: " + numberCores + 
                "\nПамять SSD: " + SsdMemory +
                "\nПамять жесткого диска: " + HhdMemory + 
                "\nВидео память: " + videoMemory + 
                "\nWindows 11: " + windows11 + 
                "\nВерсия Matebook: " + matebookVersion + 
                "\nЧастота процессор: " + processorFrequency +
                "\nИспользуемая оперативная память: " + usableRam);
    }

    public static void calculationPriceWithDiscount() {

        System.out.println("\n(2) РАСЧЕТ СТОИМОСТИ ТОВАРА СО СКИДКОЙ");
        
        int penPrice = 100;
        int bookPrice = 200;
        double discount = 0.11;
        int sumGoods = penPrice + bookPrice;
        int sumDiscount = (int) ((sumGoods) * discount);
        int discountPrice = sumGoods - sumDiscount;

        System.out.println("Сумма товаров без скидки: " + sumGoods + 
                "\nСумма скидки: " + sumDiscount + 
                "\nСумма товаров со скидкой: " + discountPrice);
    }

    public static void outputJAVAword() {

        System.out.println("\n(3) ВЫВОД СЛОВА JAVA В КОНСОЛЬ");
        
        System.out.println("    J    a  v     v  a" + 
                "\n    J   a a  v   v  a a\n J  J  aaaaa  V V  aaaaa\n  JJ  a     a  V  a     a");
    }

    public static void outputMinMaxValuesWholeNumberTypes() {

        System.out.println("\n(4) ВЫВОД МИНИМАЛЬНОГО И МАКСИМАЛЬНОГО ЗНАЧЕНИЙ ЦЕЛЫХ ЧИСЛОВЫХ ТИПОВ");

        byte maxByte = 127;

        System.out.println("--Вывод первоначального значения для byte: " + maxByte +
                "\n--Вывод после инкремента: " + ++maxByte +
                "\n-- Вывод после декремента: " + --maxByte);

        short maxShort = 32767;

        System.out.println("--Вывод первоначального значения для short: " + maxShort +
                "\n--Вывод после инкремента: " + ++maxShort +
                "\n-- Вывод после декремента: " + --maxShort);

        int maxInt = 2_147_483_647;

        System.out.println("--Вывод первоначального значения для int: " + maxInt +
                "\n--Вывод после инкремента: " + ++maxInt +
                "\n-- Вывод после декремента: " + --maxInt);

        long maxLong = 9_223_372_036_854_775_807L;

        System.out.println("--Вывод первоначального значения для long: " + maxLong +
                "\n--Вывод после инкремента: " + ++maxLong +
                "\n-- Вывод после декремента: " + --maxLong);
    }
    
    public static void permutationVarValues() {

        System.out.println("\n(5) ПЕРЕСТАНОВКА ЗНАЧЕНИЙ ПЕРЕМЕННЫХ");

        int number2 = 2;
        int number5 = 5;
        int swapVar;

        System.out.println("--C помощью третьей переменной: " + 
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

        System.out.println("\n(6) ВЫВОД СИМВОЛОВ И ИХ КОДОВ");

        char char35 = 35;
        char char38 = 38;
        char char64 = 64;
        char char94 = 94;
        char char95 = 95;

        System.out.println("Код символа: 35; Символ: "+ char35 +
                "\nКод символа: 38; Символ: "+ char38 +
                "\nКод символа: 64; Символ: "+ char64 +
                "\nКод символа: 94; Символ: "+ char94 +
                "\nКод символа: 95; Символ: "+ char95); 
    }

    public static void outputDukeInConsole() {

        System.out.println("\n(7) ВЫВОД В КОНСОЛЬ ASCII-АРТ ДЮКА");

        char rightSlash = '/';
        char leftSlash = '\\';
        char leftBracket = '(';
        char rightbracket = ')';
        char underline = '_';

        System.out.println("    " + rightSlash + leftSlash + 
                "\n   " + rightSlash + "  " + leftSlash + 
                "\n  " + rightSlash + underline + leftBracket + " " + rightbracket + leftSlash + 
                "\n " + rightSlash + "      " + leftSlash + 
                "\n" + rightSlash + underline + underline + underline + underline + rightSlash + 
                leftSlash + underline + underline + leftSlash); 
    }

    public static void outputAmountHundredsDecadesUnits() {

        System.out.println("\n(8) ВЫВОД КОЛИЧЕСТВА СОТЕН, ДЕСЯТКОВ И ЕДИНИЦ");
        
        int numberber = 123;
        int amountHundreds = numberber / 100;
        int amounDecades = numberber % 100 / 10;
        int amountUnits = numberber % 100 % 10;
        int sumnumberbers = amountHundreds + amounDecades + amountUnits;
        int productnumberbers = amountHundreds * amounDecades * amountUnits;

        System.out.println("Число " + numberber + " содержит:\n" +
                amountHundreds + " сотен\n" +
                amounDecades + " десятков\n" +
                amountUnits + " единиц" +
                "\nСумма его цифр: " + sumnumberbers +
                "\nПроизведение его цифр: " + productnumberbers); 
    }

    public static void outputTime() {

        System.out.println("\n(9) ВЫВОД ВРЕМЕНИ");

        int allTimeInSec = 86399;
        int hours = allTimeInSec / 3600;
        int minutes = (allTimeInSec - hours * 3600) / 60;
        int seconds = allTimeInSec - (hours * 3600 + minutes * 60);

        System.out.println(hours + " : " + minutes + " : " + seconds); 
    }
}