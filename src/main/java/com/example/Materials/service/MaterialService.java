package com.example.Materials.service;



import com.example.Materials.entity.Material;
import com.example.Materials.repository.MaterialRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MaterialService {
    private final MaterialRepository materialRepository;

    public MaterialService(MaterialRepository materialRepository) {
        this.materialRepository = materialRepository;
    }

    public List<Material> getAllMaterials() {
        return materialRepository.findAll();
    }

    public Material saveMaterial(Material material) {
        return materialRepository.save(material);
    }

    public void updateQuantityUsed(Long id, int quantityUsed) {
        Material material = materialRepository.findById(id).orElseThrow();
        material.setQuantityUsed(material.getQuantityUsed() + quantityUsed);
        materialRepository.save(material);
    }
}

