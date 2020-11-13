package mianshi;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName Operation.java
 * @Description TODO
 * @createTime 2020年11月11日 15:23:00
 */
public class Operation {
    public static void main(String[] args) {
        String str = "5+4-3*2/1+5*6";
        int sum = 0;
        System.out.println(str.indexOf("*"));
        while(str.indexOf("*") != -1){

            if(str.indexOf("*") != -1){
                String substring = str.substring(str.indexOf("*") - 1, str.indexOf("*") + 2);
            String[] split = substring.split("\\*");
            sum = Integer.parseInt(split[0])*Integer.parseInt(split[1]);
            str = str.replace(substring,String.valueOf(sum));
            }
        }
        System.out.println(str);

        while(str.indexOf("/") != -1){
            if(str.indexOf("/") != -1){
                String substring = str.substring(str.indexOf("/") - 1, str.indexOf("/") + 2);
                String[] split = substring.split("\\/");
                sum = Integer.parseInt(split[0])/Integer.parseInt(split[1]);
                str = str.replace(substring,String.valueOf(sum));
            }
        }
        System.out.println(str);

        while(str.indexOf("+") != -1){
            if(str.indexOf("+") != -1){
                String substring = "";
                String substring1 = "";
                for (int i = 1; i <= 3; i++) {
                    System.out.println("111111");
                    System.out.println(str.substring(str.indexOf("+")+1));
                    substring1 = str.substring(str.indexOf("+")+1, str.indexOf("+") + i);
                    if(str.substring(str.indexOf("+")+1, str.indexOf("+") + i).contains("+") ||
                       str.substring(str.indexOf("+")+1, str.indexOf("+") + i).contains("-") ||
                       str.substring(str.indexOf("+")+1, str.indexOf("+") + i).contains("*") ||
                       str.substring(str.indexOf("+")+1, str.indexOf("+") + i).contains("/")
                    ){

                        substring1 = str.substring(str.indexOf("+")+1, str.indexOf("+") + i-1);
                        break;
                    }
                    System.out.println(substring1);
                }
                if(substring1.length()>=2){
                    substring = str.substring(str.indexOf("+") - 1, str.indexOf("+") + 3);
                }else {
                    substring = str.substring(str.indexOf("+") - 1, str.indexOf("+") + 2);
                }
                String[] split = substring.split("\\+");
                sum = Integer.parseInt(split[0])+Integer.parseInt(split[1]);
                str = str.replace(substring,String.valueOf(sum));
            }
        }
        System.out.println(str);
    }

//        str.substring(str.indexOf("+")+1, str.indexOf("+") + i).contains("/")
}
