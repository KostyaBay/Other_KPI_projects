package MathMod.src;

import java.text.DecimalFormat;

    public class Main {

//    Взуттєве підприємство щодня постачає на ринок 900 партій взуття.
//    Фахівець зі збуту знає, що щодня підприємству повертають від 1 до 13 пар бракованого взуття.
//        Оцінити, яку кількість пар бракованого взуття підприємство постачає на ринок протягом
//    місяця в припущенні, що поява кожного з чисел рівноймовірна. Який ризик втрат фірми за 14 днів,
//    оцінений кількістю бракованих пар взуття, постачених на ринок? Написати програму для обчислення
//    ризику та завантажити її в класрум.

        public static void main(String[] args) {
            for (int d=0; d<7; d++) {
                System.out.println("Кількість бракованого товару за день: " + function_day());
            }
            System.out.println("\nКількість бракованого товару за місяць: " + function_month());
            System.out.println("\nРизик втрат фірми за 14 днів: " + function_2week_percent() + " % ");
        }

        public static int function_day() {
            int[] arr = new int[900];
            int sum = 0;
            int sum1 = 0;
            int ogr = 1 + (int) (Math.random() * 13);
            for (int i = 0; i < 900; i++) {
                int c = (int) (Math.random() * 2);

                if (sum1 + c <= ogr) {
                    arr[i] = c;
                    sum1 = sum1 + arr[i];
                }
                else
                {
                    arr[i] = 0;
                }
            }
            for (int i : arr) {
                sum = sum + i;
            }
            return sum;
        }

        public static int function_month(){
            int [] sum_month = new int[31];
            int summonth = 0;
            for (int j = 0; j < 31; j++) {
                sum_month[j] = function_day();
                summonth = summonth + sum_month[j];
            }
            return summonth;
        }

        public static int function_2week(){
            int [] sum_14 = new int[14];
            int sum14 = 0;
            for (int j = 0; j < 14; j++) {
                sum_14[j] = function_day();
                sum14 = sum14 + sum_14[j];
            }
            return sum14;
        }

        public static float function_2week_percent(){
            int week_of_14 = function_2week();
            System.out.println("\nКількість бракованого товару за 14 днів: " + week_of_14);
            float proc = ((float) week_of_14 / 900)*100;
            DecimalFormat df = new DecimalFormat("#.##");
            return Float.parseFloat(df.format(proc));
        }
    }
