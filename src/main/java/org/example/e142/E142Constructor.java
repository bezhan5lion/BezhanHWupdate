package org.example.e142;

public class E142Constructor {
    public static class SyntaxTechnologies {
        String schoolName;
        int batch;
        int year;
        String lastDayOfClass;

        void nonArgumentCon() {
            System.out.println(schoolName + " " + batch + " " + year + " " + lastDayOfClass);
        }

        void parameterizedCon(String dschoolName, int dbatch, int dyear, String dlastDayOfClass) {
            schoolName = dschoolName;
            batch = dbatch;
            year = dyear;
            lastDayOfClass = dlastDayOfClass;
        }

        void display() {
            System.out.println(schoolName + " " + batch + " " + year + " " + lastDayOfClass);
        }

    }

    public static void main(String[] args) {
        SyntaxTechnologies obj1 = new SyntaxTechnologies();
        SyntaxTechnologies obj2 = new SyntaxTechnologies();

        obj1.nonArgumentCon();
        obj2.parameterizedCon("Syntax", 6, 2020, "07302020");
        obj2.display();
    }
}

