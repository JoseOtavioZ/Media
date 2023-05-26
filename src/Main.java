public class Main {
    public static void main(String[] args) {
        Media form = new Media();
        form.setContentPane(form.formMedia);
        form.setVisible(true);
        form.setSize(500, 500);
        form.setTitle("Calculadora de media");


        Sub formS = new Sub();
        formS.setContentPane(form.formSub);
        formS.setVisible(true);
        formS.setSize(500, 500);
        formS.setTitle("Informe sua Sub");
    }
}