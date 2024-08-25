@Controller
public class SampleController {
 
    @GetMapping("/registerformNew")
    public String showRegisterFormNew() {
        return "registerformNew";
    }
    
    @PostMapping("/result1")
    public String showResult1() {
        return "result1";
    }
}
