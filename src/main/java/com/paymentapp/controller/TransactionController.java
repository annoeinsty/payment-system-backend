@RestController
@RequestMapping("/api/transactions")
public class TransactionController {

    @Autowired
    private TransactionService service;

    @PostMapping
    public Transaction createTransaction(@RequestBody Transaction tx) {
        return service.saveTransaction(tx);
    }

    @GetMapping
    public List<Transaction> getAllTransactions() {
        return service.getAllTransactions();
    }
}
