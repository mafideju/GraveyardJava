import com.mafideju.service.SpeakerService;
import com.mafideju.service.SpeakerServiceImpl;

public class Application {

    public static void main(String args[]) {
        SpeakerService service = new SpeakerServiceImpl();

        System.out.println(service.findAll().get(0).getFirstName());
        System.out.println(service.findAll().get(0).getLastName());
    }
}
