import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("ВВедите операцию  через пробел с двумя числами от 1 до 10 или от I до X");
        Scanner sum = new Scanner(System.in);
        String sm = sum.nextLine();
        String [] strings = sm.split(" ");
        if(strings.length<3){
             try{ throw new IOException();}
             catch (IOException e) {System.out.println("строка не является математической операцией");}}
        else{ if(strings.length>3){
            try{ throw new IOException();}
            catch (IOException e) {System.out.println("формат математической операции не удовлетворяет заданию");}}}
        if(strings.length==3){
        int a=0; //Integer.parseInt(strings[0]);
        int b=0; //Integer.parseInt(strings[2]);
        int c=0;
        int d=0;
        int f=0;
        switch (strings[0]){
            case "I": a=1; d=1; break;
            case "II": a=2; d=1; break;
            case "III": a=3; d=1; break;
            case "IV": a=4; d=1; break;
            case "V": a=5; d=1; break;
            case "VI": a=6; d=1; break;
            case "VII": a=7; d=1; break;
            case "VIII": a=8; d=1; break;
            case "IX": a=9; d=1; break;
            case "X": a=10; d=1; break;
            case "1": a=1; d=2; break;
            case "2": a=2; d=2; break;
            case "3": a=3; d=2; break;
            case "4": a=4; d=2; break;
            case "5": a=5; d=2; break;
            case "6": a=6; d=2; break;
            case "7": a=7; d=2; break;
            case "8": a=8; d=2; break;
            case "9": a=9; d=2; break;
            case "10": a=10; d=2; break;}
            switch (strings[2]){
                case "I": b=1; f=1; break;
                case "II": b=2; f=1; break;
                case "III": b=3; f=1; break;
                case "IV": b=4; f=1; break;
                case "V": b=5; f=1; break;
                case "VI": b=6; f=1; break;
                case "VII": b=7; f=1; break;
                case "VIII": b=8; f=1; break;
                case "IX": b=9; f=1; break;
                case "X": b=10; f=1; break;
                case "1": b=1; f=2; break;
                case "2": b=2; f=2; break;
                case "3": b=3; f=2; break;
                case "4": b=4; f=2; break;
                case "5": b=5; f=2; break;
                case "6": b=6; f=2; break;
                case "7": b=7; f=2; break;
                case "8": b=8; f=2; break;
                case "9": b=9; f=2; break;
                case "10": b=10; f=2; break;}
            if((a>10)||(a<1)||(b>10)||(b<1)){
                try{ throw new IOException();}
                catch (IOException e) {System.out.println("возможны только числа от 1 до 10");}}
            else{
            if(d!=f){
                try{ throw new IOException();}
                catch (IOException e) {System.out.println("используются одновременно разные системы счисления");}}
            else{
            switch(strings[1].codePointAt(0)) {
            case 43:  c = a+b; break;
            case 45:  c = a-b; break;
            case 42:  c = a*b; break;
            case 47:  c = a/b; break;
                default: {
                    try{ throw new IOException();}
                catch (IOException e) {System.out.println("неправильный математический оператор");}}}
            String kon1 = " ";
            String kon2 = " ";
            int g,h;
            if((d==1)&&(c<=0)){
                try{ throw new IOException();}
                catch (IOException e) {System.out.println("в римской системе нет отрицательных чисел");}}
            else{
                if(d==1){
                    g=c/10; h=c%10;

                    switch (h){
                        case 1: kon2="I"; break;
                        case 2: kon2="II"; break;
                        case 3: kon2="III"; break;
                        case 4: kon2="IV"; break;
                        case 5: kon2="V"; break;
                        case 6: kon2="VI"; break;
                        case 7: kon2="VII"; break;
                        case 8: kon2="VIII"; break;
                        case 9: kon2="IX"; break;}
                        switch (g){
                            case 1: kon1="X"; break;
                            case 2: kon1="XX"; break;
                            case 3: kon1="XXX"; break;
                            case 4: kon1="XL"; break;
                            case 5: kon1="L"; break;
                            case 6: kon1="LX"; break;
                            case 7: kon1="LXX"; break;
                            case 8: kon1="LXXX"; break;
                            case 9: kon1="XC"; break;
                            case 10: kon1="C"; break;
                    }System.out.println("="+kon1+kon2);}
                else{ System.out.println("="+c);
                }}}}}}
}