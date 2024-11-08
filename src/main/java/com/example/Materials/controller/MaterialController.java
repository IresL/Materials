package com.example.Materials.controller;



import com.example.Materials.entity.Material;
import com.example.Materials.service.MaterialService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/materials")
public class MaterialController {
    private final MaterialService materialService;

    public MaterialController(MaterialService materialService) {
        this.materialService = materialService;
    }

    @GetMapping
    public List<Material> getAllMaterials() {
        return materialService.getAllMaterials();
    }

    @PostMapping
    public Material saveMaterial(@RequestBody Material material) {
        return materialService.saveMaterial(material);
    }

    @PutMapping("/update/{id}")
    public void updateQuantityUsed(@PathVariable Long id, @RequestParam int quantityUsed) {
        materialService.updateQuantityUsed(id, quantityUsed);
    }
}

