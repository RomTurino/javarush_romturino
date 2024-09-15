package level11;

/*
Многосерийный предприниматель
*/

public class SerialIntrepreneur {
    private String type;

    //

    //напишите тут ваш код
    public void  initialize(String type){
        this.type=type;
    }

    public static void main(String[] args) {
        SerialIntrepreneur building = new SerialIntrepreneur();
        building.initialize("Ресторан");
        building.initialize("Барбершоп");
    }
}



