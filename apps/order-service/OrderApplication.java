@RestController
@SpringBootApplication
public class OrderApplication {

    @GetMapping("/order")
    public String order() {
        return "Order Service is UP";
    }

    public static void main(String[] args) {
        SpringApplication.run(OrderApplication.class, args);
    }
}
