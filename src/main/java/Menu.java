
public class Menu {
    private String menu = "MENÚ\n" +
            "   -------------------------------\n" +
            "   1- Upload array A\n" +
            "   2- Upload el array B\n" +
            "   3- Show array A\n" +
            "   4- Show array B\n" +
            "   5- Show result A+B\n" +
            "   6- Show result A*B\n" +
            "   7- Show reverse Array A\n" +
            "   8- Exit\n" +
            "   Choose an option (1-8):\n";

    public String getMenu(){
        return this.menu;
    }

    public int optionExit(){return 8;}

}
