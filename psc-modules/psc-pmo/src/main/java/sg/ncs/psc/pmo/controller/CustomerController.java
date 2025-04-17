package sg.ncs.psc.pmo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import sg.ncs.psc.common.core.domain.R;
import sg.ncs.psc.pmo.domain.Customer;

import java.util.List;

@RestController
@RequestMapping("/pmo")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping("/customer/add")
    public  R<Integer> addCustomer(@RequestBody Customer customer) {
        return  R.ok(customerService.addCustomer(customer));
    }

    @PutMapping("/customer/edit")
    public R<Integer> editCustomer(@RequestBody Customer customer) {
        return  R.ok(customerService.editCustomer(customer));
    }

    @DeleteMapping("/customer/delete/{id}")
    public  R<Integer> deleteCustomer(@PathVariable Long id) {
        return  R.ok(customerService.deleteCustomer(id));
    }

    @GetMapping("/customer/list")
    public  R<List<Customer>> getCustomerList() {
        return  R.ok(customerService.getCustomerList());
    }

    @PostMapping("/customer/import-ratecard")
    public  R<Integer> importRateCard(@RequestParam("file") MultipartFile file) {
        return  R.ok(customerService.importRateCard(file));
    }
}
