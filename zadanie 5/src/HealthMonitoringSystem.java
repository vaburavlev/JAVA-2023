import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

// Класс для представления медицинских анализов
class MedicalReport {
    private String result;

    public MedicalReport(String result) {
        this.result = result;
    }

    public String getResult() {
        return result;
    }
}

// Класс, представляющий пациента
class Patient implements Observer {
    private String name;

    public Patient(String name) {
        this.name = name;
    }

    // Метод, вызываемый при обновлении состояния медицинского отчета
    @Override
    public void update(Observable o, Object arg) {
        if (arg instanceof MedicalReport) {
            MedicalReport report = (MedicalReport) arg;
            System.out.println("Уведомление для пациента " + name + ": Результат анализов - " + report.getResult());
        }
    }

    // Метод для подписки на уведомления
    public void subscribeToHealthMonitor(HealthMonitor healthMonitor) {
        healthMonitor.addObserver(this);
    }
}

// Класс для мониторинга здоровья и отправки уведомлений
class HealthMonitor extends Observable {
    private MedicalReport currentReport;

    // Метод для добавления нового медицинского отчета
    public void addMedicalReport(MedicalReport report) {
        currentReport = report;
        setChanged();
        notifyObservers(report);
    }
}

public class HealthMonitoringSystem {
    public static void main(String[] args) {
        // Создаем экземпляры пациентов
        Patient patient1 = new Patient("Иван");
        Patient patient2 = new Patient("Мария");

        // Создаем экземпляр монитора здоровья
        HealthMonitor healthMonitor = new HealthMonitor();

        // Пациенты подписываются на уведомления от монитора
        patient1.subscribeToHealthMonitor(healthMonitor);
        patient2.subscribeToHealthMonitor(healthMonitor);

        // Добавляем медицинские отчеты
        healthMonitor.addMedicalReport(new MedicalReport("Норма холестерина"));
        healthMonitor.addMedicalReport(new MedicalReport("Повышенный уровень сахара"));

        // Теперь оба пациента получат уведомления о результатах анализов
    }
}
