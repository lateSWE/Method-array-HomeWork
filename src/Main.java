public class Main {

    public static void main(String [] args){
        // 100 tal i intervallet [0-9]
        int[] numbers = {1,1,1,2,6,7,8,4,3,7,8,9,3,1,3,7,8,5,3,4,8,9,6,4,2,4,7,9,7,4,3,2,3,6,7,8,7,7,5,7,9,6,1,4,0,8,6,5,6,8,9,0,7,5,4,3,2,4,5,9,8,5,9,8,8,4,5,6,7,8,9,0,9,0,9,7,5,2,1,2,3,4,5,4,4,5,3,4,5,0,8,7,0,7,9,7,0,6,5,4};

        // 100 namn
        String[] names = {"Crystal","Tam","Ed","Beulah","Daina","Benjamin","Kia","Clelia","Cassy","Gita","Celsa","Karoline","Talitha","Lewis","Betsy","Colin","Glendora","Carola","Rosalba","Jeanie","Yevette","Armand","Neal","Lilla","Dorethea","Delta","Maye","Nikita","Shoshana","Carola","Margie","Haywood","Venessa","Natacha","Gilbert","Kandi","Tyisha","Tammie","Blossom","Penney","Diana","Audrey","Willard","Zoraida","Drusilla","Jacquline","Cyndy","Janiece","Tressie","Kami","Lashanda","Leann","Tom","Santana","Junita","Gisela","Tom","Marquerite","Bryant","Lauralee","Yael","Kelle","Samantha","Tom","Meta","Lanette","Wanetta","Carola","Jana","Neal","Brady","Rigoberto","Felicia","Hellen","Georgeann","Carola","Isaias","Ellis","Roseanne","Lenard","Ela","Ophelia","Alesha","Mafalda","Flor","Kelsi","Autumn","Sondra","Pasty","Jacquelyne","Benjamin","Emmie","Mickie","Lang","Jamee","Felice","Daniella","Carola","Nathalie","Genevive"};

        System.out.println(NoOf7(numbers));
        System.out.println(NoOfTom(names));
        System.out.println(MaxAndMinAmount(numbers));
        System.out.println(Drusilla(names));
        System.out.println(SumOfAllEvenNumbers(numbers));
        System.out.println(NameBegginingWithL(names));
        System.out.println(Names5Long(names));
        System.out.println(IndexOfEachNumber(numbers));
        System.out.println(UniqueNames(names));
        System.out.println(MostCommonName(names));
    }

    public static int NoOf7(int[]numbers){                  //1
        int out = 0;
        for (int i = numbers.length - 1; i >= 0; i--){
            if (numbers[i] == 7) {
                out++;
            }
        }
        return out;
    }
    public static int NoOfTom(String[]names){               //2
        int out = 0;
        for (int i = names.length - 1; i >= 0; i--){
            if (names[i].equals("Tom") || names[i].equals("tom") ){
                out++;
            }
        }
        return out;
    }
    public static String MaxAndMinAmount(int[]numbers){     //3
        String out = "";
        int outnum1 = 0;
        int outnum2 = 0;
        int k = 0;
        int l = 0;

        int[] index = new int[10];
        for (int i = index.length - 1; i >= 0; i--){
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[j] == i){
                    index[i]++;
                }
            }
        }

        for (int i = 0; i < index.length - 1; i++) {
            k = index[i];
            l = index[i + 1];
            if (k < l){
                outnum1 = l;
            }
        }
        for (int i = 0; i < index.length - 1; i++) {
            k = index[i];
            l = index[i + 1];
            if (k > l) {
                outnum2 = l;
            }
        }
        out = numbers[outnum1] + ", " + numbers[outnum2];
        return out;
    }
    public static int Drusilla(String[]names){              //4
        int out = 0;
        for (int i = 0; i < names.length; i++) {
            if (names[i].equals("Drusilla")){
                out = i;
            }
        }
        return out;
    }
    public static int SumOfAllEvenNumbers(int[]numbers){    //5
        int out = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0){
                out += numbers[1];
            }
        }

        return out;
    }
    public static int NameBegginingWithL(String[]names){    //6
        int out = 0;
        for (int i = 0; i < names.length; i++) {
            if (names[i].charAt(0) == 'L'){
                out++;
            }
        }
        return  out;
    }
    public static int Names5Long(String[]names){            //7
        int out = 0;
        for (int i = 0; i < names.length; i++) {
            if (names[i].length() == 5){
                out++;
            }
        }
        return out;
    }


    public static String IndexOfEachNumber(int[]numbers){   //8
        String out = "";
        int[] index = new int[10];

        for (int i = 0; i < index.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[j] == i){
                    index[i]++;
                }
            }
            out = out + "Tal " + index[i] +", ";
        }
        return out;
    }
    public static int UniqueNames(String[]names) {           //9
        int out = 0;
        int times = names.length;
        String text;
        for (int i = 0; i < times; i++) {
            text = names[i];
            for (int j = 0; j < times; j++) {
                if (i != j) {
                    if (text.equals(names[j])) {
                        break;
                    }
                    if (j == times - 1) {
                        out++;
                    }
                }


            }
        }
        return out;
    }
    public static String MostCommonName(String[]names) {    //10
        String out = "";
        int outnum = 0;
        String string1 = "";
        String string2 = "";
        int index1 = 0;
        int index2 = 0;
        int index3 = names.length;


        for (int i = 0; i < index3 - 1; i++) {
            string1 = names[i];
            string2 = names[i + 1];
            for (int j = 0; j < index3; j++) {
                if (index3 >= index2){
                    outnum = i;
                }
            }

        }
        out = names[outnum];
        return out;
    }
}
