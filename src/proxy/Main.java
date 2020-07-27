package proxy;

public class Main {
    public static void main(String[] args) {
        Report report = new ReportImpl();
        report.doSomeThink();
        Report report1 = new ReportProxy();
        report1.doSomeThink();
        Report report2 = new ReportProxy();
        report2.doSomeThink();
    }
}
