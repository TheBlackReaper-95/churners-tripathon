package com.quirkbook.pojos;

/**
 * Created by MMT6434 on 8/26/2016.
 */
public class Dummy {

    private String item1;
    private String item2;

    public void setItem1(String s){
        try{
            item1=s;
        }catch(NullPointerException e){
            e.printStackTrace();
        }

    }

    public void setItem2(String s){
        try{
            item2=s;
        }catch(NullPointerException e){
            e.printStackTrace();
        }
    }

    public String getItem1(){
        return item1;
    }

    public String getItem2(){
        return item2;
    }
}
