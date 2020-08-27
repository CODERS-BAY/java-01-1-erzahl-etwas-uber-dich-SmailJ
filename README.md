# Java 

## Variablen und Datentpyen 

### Aufgabe 1.1 - Erzähl mir etwas über dich

Deklariere Variablen für dein Alter, deinen Vornamen, dein Geschlecht, deinen Nachnamen, dein Geburtsdatum, deinen Notendurchschnitt und dafür ob du verheiratet bist oder nicht. Überleg dir gut welchen Datentyp du für welche Variablen am besten verwenden solltest. 

Gib alle Variablen mit `System.out.println` auf der Konsole aus. 

------------------------------------------------------------

# Java 

## Variables and Datatypes

### Exercise 1.1 - Tell me about yourself

Declare variables to express your age, first name, gender, last name, birthday, average grade and whether you are married or not. Think which datatype is well suited for which variable. 

Print all variables to the console with `System.out.println`


# By Smail Jusic


    public static void main(String[] args) {
        
        int age=22;
        String firstName="Smail";
        char gender='M';
        String lastName="Jusic";
        String bDay="05.09.1997";
        double grade=2.7;
        boolean married=false;

        System.out.println(age);
        System.out.println(firstName);
        System.out.println(gender);
        System.out.println(lastName);
        System.out.println(bDay);
        System.out.println(grade);
        System.out.println(married);
    }

