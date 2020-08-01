package proxy;

public class ReportImpl implements Report{
    private int id;
    private String reportBody;

    public ReportImpl() {
        try {
            generateReport();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void generateReport() throws InterruptedException {
        System.out.println("Report generation...");
        Thread.sleep(5000);
        id = (int)(Math.random()*100);
        reportBody = new String("Report body");

    }

    @Override
    public void doSomeThink() {
        System.out.printf("Report # %s \n %s \n", id, reportBody);
    }
}
