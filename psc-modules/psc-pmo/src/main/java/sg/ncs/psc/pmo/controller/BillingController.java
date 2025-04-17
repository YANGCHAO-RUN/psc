package sg.ncs.psc.pmo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sg.ncs.psc.common.core.domain.R;

import java.util.List;

@RestController
@RequestMapping("/billing")
public class BillingController {

    @Autowired
    private BillingService billingService;

    @PostMapping("/export/dbs")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<byte[]> exportDbs() {
        byte[] data = billingService.exportDbs();
        if (data != null) {
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
            headers.setContentDispositionFormData("attachment", "billing_dbs.xlsx"); // Assuming it's an Excel file
            return new ResponseEntity<>(data, headers, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT); // Or handle error appropriately
        }
    }

    @GetMapping("/export/ant")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<byte[]> exportAnt() {
        byte[] data = billingService.exportAnt();
        if (data != null) {
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
            headers.setContentDispositionFormData("attachment", "billing_ant.xlsx"); // Assuming it's an Excel file
            return new ResponseEntity<>(data, headers, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT); // Or handle error appropriately
        }
    }

    @GetMapping("/list")
    public  R<List<?>> getBillingList() {
        return  R.ok(billingService.getBillingList());
    }

    @GetMapping("/monthly-backup")
    public  R<List<?>> getMonthlyBackup() {
        return  R.ok(billingService.getMonthlyBackup());
    }
}
