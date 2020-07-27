package proxy;

public class ReportProxy implements Report{
    private static ReportImpl report;

    @Override
    public void doSomeThink() {
        if(report == null){
            report = new ReportImpl();
        }
        report.doSomeThink();
    }
}
