package com.bnt.tasks;

import org.springframework.stereotype.Component;

@Component
public class ConfusedPappu {
    public int indDiff(int amount) {
        /*String amt = String.valueOf(amount);
        String actualAmt ="";
        for (int i=0;i<amt.length();i++){
            if(amt.charAt(i)=='6'){
                actualAmt +="9";
            } else if (amt.charAt(i)=='9') {
                actualAmt +="6";
            }else {
                actualAmt +=amt.charAt(i);
            }
        }
        if(Integer.valueOf(actualAmt)>amount){
            return Integer.valueOf(actualAmt)-amount;
        }else {
            return amount-Integer.valueOf(actualAmt);
        }*/

       /*String actualAmt = String.valueOf(amount).replace('6', '9');
       return Integer.valueOf(actualAmt)-amount;*/
        int multiplication = 1;
        int oldAmt = amount;
        int extraAmt = 0;
        while (amount > 0) {
            int rem = amount % 10;
            if (rem == 6) {
                extraAmt = extraAmt + (multiplication * 3);
            }
            multiplication = multiplication * 10;
            amount = amount / 10;
        }

        return (extraAmt + oldAmt) - oldAmt;

    }


}
