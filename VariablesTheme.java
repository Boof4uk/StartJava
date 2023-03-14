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
        short ssdMemory = 512;
        int hhdMemory = 1000;
        long videoMemory = 1;
        boolean windows11 = true;
        char matebookVersion = 'D';
        double processorFrequency = 2.10;
        float usableRam = 15.3f;
        
        System.out.println("Количество ядер: " + numberCores + 
                "\nПамять SSD: " + ssdMemory +
                "\nПамять жесткого диска: " + hhdMemory + 
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
        int sumDiscount = (int)(sumGoods * discount);
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

        int number1 = 2;
        int number2 = 5;
        int temp;

        System.out.println("--C помощью третьей переменной: " + 
                "\nИсходные значения: " + "Число 1 = " + number1 + "; Число 2 = " + number2);

        temp = number1; // = 2
        number1 = number2; // = 5
        number2 = temp; // = 2

        System.out.println("Новые значения: " + "Число 1 = " + number1 + "; Число 2 = " + number2);
        
        System.out.println("\n--С помощью арифметических операций: " + 
                "\nИсходные значения: " + "Число 1 = " + number1 + "; Число 2 = " + number2);

        //Не придумал другого арифметического способа без участия третьей переменной, жду подсказку
        number2 += number1; // 7
        number1 = number2 - number1; // 2
        number2 -= number1; // 5

        System.out.println("Новые значения: " + "Число 1 = " + number1 + "; Число 2 = " + number2);

        System.out.println("\n--С помощью побитовых операций: " + 
                "\nИсходные значения: " + "Число 1 = " + number1 + "; Число 2 = " + number2);

        number2 ^= number1;
        number1 ^= number2; //5
        number2 ^= number1; //2

        System.out.println("Новые значения: " + "Число 1 = " + number1 + "; Число 2 = " + number2);
    }

    public static void outputSymbolsAndCodes() {
        System.out.println("\n(6) ВЫВОД СИМВОЛОВ И ИХ КОДОВ");

        char hash = 35;
        char ampersand = 38;
        char at = 64;
        char xor = 94;
        char underScore = 95;

        System.out.println("Код символа: 35; Символ: "+ hash +
                "\nКод символа: 38; Символ: "+ ampersand +
                "\nКод символа: 64; Символ: "+ at +
                "\nКод символа: 94; Символ: "+ xor +
                "\nКод символа: 95; Символ: "+ underScore); 
    }

    public static void outputDukeInConsole() {
        System.out.println("\n(7) ВЫВОД В КОНСОЛЬ ASCII-АРТ ДЮКА");

        char slash = '/';
        char backSlash = '\\';
        char backBracket = '(';
        char rightbracket = ')';
        char underline = '_';

        System.out.println("    " + slash + backSlash + 
                "\n   " + slash + "  " + backSlash + 
                "\n  " + slash + underline + backBracket + " " + rightbracket + backSlash + 
                "\n " + slash + "      " + backSlash + 
                "\n" + slash + underline + underline + underline + underline + slash + 
                backSlash + underline + underline + backSlash); 
    }

    public static void outputAmountHundredsDecadesUnits() {
        System.out.println("\n(8) ВЫВОД КОЛИЧЕСТВА СОТЕН, ДЕСЯТКОВ И ЕДИНИЦ");
        
        int number = 123;
        int amountHundreds = number / 100;
        int amountTens = number % 100 / 10;
        int amountOnes = number % 100 % 10;
        int sumNumbers = amountHundreds + amountTens + amountOnes;
        int productNumbers = amountHundreds * amountTens * amountOnes;

        System.out.println("Число " + number + " содержит:\n" +
                amountHundreds + " сотен\n" +
                amountTens + " десятков\n" +
                amountOnes + " единиц" +
                "\nСумма его чисел: " + sumNumbers +
                "\nПроизведение его чисел: " + productNumbers); 
    }

    public static void outputTime() {
        System.out.println("\n(9) ВЫВОД ВРЕМЕНИ");

        int allTimeInSec = 86399;
        int hours = allTimeInSec / 3600;
        int temp1 = allTimeInSec % 3600;
        int minutes = temp1 / 60;
        int seconds = minutes % 60;

        System.out.println(hours + " : " + minutes + " : " + seconds); 
    }
}