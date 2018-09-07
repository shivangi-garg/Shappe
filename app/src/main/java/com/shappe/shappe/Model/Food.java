package com.shappe.shappe.Model;



public class Food {
    private String Name,Measure,Cal;

    public Food() {
    }

    public Food( String name, String measure,String cal) {
        Name = name;
        Measure = measure;
        Cal=cal;
    }



    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
    public String getMeasure() {
        return Measure;
    }

    public void setMeasure(String measure) {
        Measure = measure;
    }

    public String getCal() {
        return Cal;
    }

    public void setCal(String cal) {
        Cal = cal;
    }
}
