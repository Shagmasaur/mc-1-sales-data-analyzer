package com.jap.sales;


import java.util.Comparator;

public class TimeOnSiteComparator implements Comparator<SalesRecord>
{
    public int compare(SalesRecord salesRecord1 , SalesRecord salesRecord2){
        if(salesRecord1.getTime_on_site() == salesRecord2.getTime_on_site()){
            return 0;
        }
        if(salesRecord1.getTime_on_site() > salesRecord2.getTime_on_site()){
            return -1;
        }
        else{
            return 1;
        }
    }
}
