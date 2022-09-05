package com.jap.sales;


import java.util.Comparator;

public class AmountComparator implements Comparator<SalesRecord>
{
    public int compare(SalesRecord salesRecord1 , SalesRecord salesRecord2){
        if(salesRecord1.getAmount() == salesRecord2.getAmount()){
            return 0;
        }
        if(salesRecord1.getAmount() > salesRecord2.getAmount()){
            return -1;
        }
        else{
            return 1;
        }
    }

}
