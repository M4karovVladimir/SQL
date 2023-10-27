package com.digdes.school;

public class Main {
    public static void main(String[] args) {
        JavaSchoolStarter starter = new JavaSchoolStarter();

        try {
            starter.execute("INSERT VALUES 'id' = 1, 'lastName' = 'Makarov', 'active' = false, 'cost' = '300', 'age' = '8' ");
            starter.execute("INSERT VALUES 'id' = 2, 'lastName' = 'Koldaev', 'active' = true, 'cost' = '341', 'age' = '3' ");
            starter.execute("INSERT VALUES 'id' = 1, 'lastName' = 'Kutuzov', 'active' = true, 'cost' = '327', 'age' = '5' ");
            starter.execute("INSERT VALUES 'id' = 3, 'lastName' = 'Leluhin', 'active' = true, 'cost' = '388', 'age' = '6' ");

            starter.execute("DELETE WHERE 'id' = 3");

            starter.execute("SELECT WHERE 'id' = 1");
            starter.execute("SELECT");

            //starter.execute("UPDATE");
        }
        catch(Exception ex) {
            ex.printStackTrace();
        }
    }
}