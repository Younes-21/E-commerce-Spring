package com.pfa.projetpfa.controller;

import com.pfa.projetpfa.domaine.BillVO;
import com.pfa.projetpfa.domaine.OrderVO;
import com.pfa.projetpfa.service.IBillService;
import com.pfa.projetpfa.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/bill")
@CrossOrigin(origins= {"*"})
public class BillController {
    @Autowired
    private IBillService service;
    @GetMapping("/bills")
    public List<BillVO> getBills(){
        return service.getBills();
    }

    // Save order
    @PostMapping("/bills")
    public BillVO save(@RequestBody BillVO bill){
        return service.saveBill(bill);
    }
}
