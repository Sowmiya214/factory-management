package com.jsw.certificates.Factory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("factoryInfo")
public class FactoryController {

    @Autowired
    private  FactoryService factoryService;

    @Autowired
    private FactoryRepository factoryRepository;

    @PostMapping("/saveFactory")
    public FactoryModel saveFactory(FactoryModel factoryModel){
        return factoryService.save(factoryModel);
    }
    @PostMapping("/updateFactory")
    public FactoryModel updateFactory(FactoryModel factoryModel){
        return factoryService.update(factoryModel);
    }
    @GetMapping("/getDetails")
    public FactoryModel getDetails(@RequestParam("certificate_no") String certificate_no){
        return factoryService.getDetails(certificate_no);
    }

}
