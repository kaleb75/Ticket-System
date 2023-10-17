import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class Test extends JFrame {
    private DefaultCategoryDataset dataset;
    
    public Test(String title) {
        super(title);
        
        dataset = new DefaultCategoryDataset();
        
        JFreeChart chart = ChartFactory.createLineChart(
            "Ping Latency Over Time",
            "Time (s)",
            "Latency (ms)",
            dataset,
            PlotOrientation.VERTICAL,
            true, true, false
        );
        
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new java.awt.Dimension(800, 600));
        setContentPane(chartPanel);
        
        pack();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public void updateChart(int time, int latency) {
        dataset.addValue(latency, "Latency", String.valueOf(time));
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        String ipAddress = "10.1.100.19";
        Test chart = new Test("Ping Latency Over Time");
        chart.setVisible(true);
        
        int time = 0;

        while (true) {
            Process process = Runtime.getRuntime().exec("ping -n 1 " + ipAddress);

            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            int latency = -1;

            while ((line = reader.readLine()) != null) {
                if (line.contains("time=")) {
                    int index = line.indexOf("time=");
                    latency = Integer.parseInt(line.substring(index + 5, line.indexOf(" ", index + 5)));
                    break;
                }
            }
            
            if (latency != -1) {
                chart.updateChart(time, latency);
                time++;
            }

            Thread.sleep(1000); // Espera 1 segundo antes de realizar el siguiente ping
        }
    }
}
