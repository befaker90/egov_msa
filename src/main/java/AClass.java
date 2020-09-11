public class AClass {

    public void execute() {
        new BClass().execute();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        new CClass().execute();
    }
}
