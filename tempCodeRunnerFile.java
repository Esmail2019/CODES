
public static void binTOdec(int binNum){
    int Mynum=binNum;
    int pow=0;
    int decNum=0;

    while(binNum>0){
        int lastdigit =binNum%10;
        decNum=decNum+(lastdigit*(int)Math.pow(2,pow));

        pow++;
        binNum= binNum/10;
    }
    System.out.print("The binary of decimal number :"+Mynum+"= "+decNum);
