package sg.ncs.psc.pmo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import sg.ncs.psc.common.core.domain.R;
import sg.ncs.psc.pmo.domain.PurchaseOrder;

import java.util.List;

@RestController
@RequestMapping("/po")
public class PurchaseOrderController {

    @Autowired
    private PurchaseOrderService purchaseOrderService;

    @PostMapping("/add")
    public  R<Integer> addPO(@RequestBody PurchaseOrder purchaseOrder) {
        return  R.ok(purchaseOrderService.addPO(purchaseOrder));
    }

    @PostMapping("/batch-import-ant")
    public  R<Integer> batchImportAnt(@RequestParam("file") MultipartFile file) {
        return  R.ok(purchaseOrderService.batchImportAnt(file));
    }

    @PostMapping("/batch-import-dbs")
    public  R<Integer> batchImportDbs(@RequestParam("file") MultipartFile file) {
        return  R.ok(purchaseOrderService.batchImportDbs(file));
    }

    @GetMapping("/list")
    public  R<List<PurchaseOrder>> getPOList() {
        return  R.ok(purchaseOrderService.getPOList());
    }

    @PutMapping("/edit")
    public  R<Integer> editPO(@RequestBody PurchaseOrder purchaseOrder) {
        return  R.ok(purchaseOrderService.editPO(purchaseOrder));
    }
}
